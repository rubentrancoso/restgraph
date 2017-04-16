#!/bin/bash
#
# addpted from 
# http://sharadchhetri.com/2014/07/29/install-nginx-source-centos-7/
#
# Want to install NGINX in your CentOS 7 box?
# JUST NEED TO EXECUTE THE LINE BELOW
#
# mkdir tmp; cd tmp; yum install -y wget; service nginx stop; rm -rf nginx-install.*; yum -y install dos2unix; wget https://docs.google.com/document/d/1S0O0K6NcvlTCdj67mh_knpG7scSCvPvpseYS0fg6_PQ/export?format=txt; mv export\?format\=txt nginx-install.txt; dos2unix -n nginx-install.txt nginx-install.sh;chmod +x nginx-install.sh; ./nginx-install.sh; rm -rf nginx-*

# Ruben Trancoso - 22/05/2016

rm -rf nginx-src
rm -rf nginx-modules

yum install -y wget
yum install -y git
yum -y install gcc gcc-c++ make zlib-devel pcre-devel openssl-devel

mkdir nginx-modules
cd nginx-modules
git clone git://github.com/yaoweibin/ngx_http_substitutions_filter_module.git
cd ..

# OpenSSL 1.0.1e-fips 11 Feb 2013
openSSLVersion="1.0.1g"
wget http://www.openssl.org/source/openssl-$openSSLVersion.tar.gz
tar -xzvf openssl-$openSSLVersion.tar.gz -C /usr/local/src

mkdir nginx-src
cd nginx-src

nginxVersion="1.10.0"

wget http://nginx.org/download/nginx-$nginxVersion.tar.gz
tar -xzf nginx-$nginxVersion.tar.gz
ln -sf nginx-$nginxVersion nginx

cd nginx

./configure \
--user=nginx                            \
--group=nginx                           \
--prefix=/etc/nginx                     \
--sbin-path=/usr/sbin/nginx             \
--conf-path=/etc/nginx/nginx.conf       \
--pid-path=/var/run/nginx.pid           \
--lock-path=/var/run/nginx.lock         \
--error-log-path=/var/log/nginx/error.log \
--http-log-path=/var/log/nginx/access.log \
--with-http_gzip_static_module          \
--with-http_stub_status_module          \
--with-http_ssl_module                  \
--with-pcre                             \
--with-file-aio                         \
--with-http_realip_module               \
--without-http_scgi_module              \
--without-http_uwsgi_module             \
--with-http_v2_module                   \
--with-openssl=/usr/local/src/openssl-$openSSLVersion/	 \
--with-openssl-opt=enable-tlsext        \
--add-module=./../../nginx-modules/ngx_http_substitutions_filter_module
# --add-module=./../../nginx-modules/ngx_cache_purge \
# --add-module=./../../nginx-modules/headers-more-nginx-module-0.25

make
make install

useradd -r nginx
usermod -s /sbin/nologin nginx

cat <<EOT > /lib/systemd/system/nginx.service
[Unit]
Description=The NGINX HTTP and reverse proxy server
After=syslog.target network.target remote-fs.target nss-lookup.target

[Service]
Type=forking
PIDFile=/run/nginx.pid
ExecStartPre=/usr/sbin/nginx -t
ExecStart=/usr/sbin/nginx
ExecReload=/bin/kill -s HUP $MAINPID
ExecStop=/bin/kill -s QUIT $MAINPID
PrivateTmp=true

[Install]
WantedBy=multi-user.target
EOT

cd ~
cd restgraph

sudo yes | cp -rf infra/nginx/conf/* /etc/nginx/

sudo sed -i.bak s/%CERTDOMAIN%/$CERTDOMAIN/g /etc/nginx/conf.d/api.conf
sudo sed -i.bak s/%APIDOMAIN%/$APIDOMAIN/g /etc/nginx/conf.d/api.conf

sudo sed -i.bak s/%CERTDOMAIN%/$CERTDOMAIN/g /etc/nginx/conf.d/front.conf
sudo sed -i.bak s/%FRONTDOMAIN%/$FRONTDOMAIN/g /etc/nginx/conf.d/front.conf

sudo sed -i.bak s/%CERTDOMAIN%/$CERTDOMAIN/g /etc/nginx/conf.d/neo4j.conf
sudo sed -i.bak s/%NEO4JDOMAIN%/$NEO4JDOMAIN/g /etc/nginx/conf.d/neo4j.conf

sudo rm -rf nginx-modules
sudo rm -rf nginx-src
sudo rm -rf openssl-1.0.1g.tar.gz

sudo systemctl enable nginx.service
sudo systemctl start nginx.service
/usr/sbin/nginx -c /etc/nginx/nginx.conf
sudo systemctl status nginx.service
sudo nginx -V

cd ~

echo -e "NGINX ENDED"
