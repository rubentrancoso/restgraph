#!/bin/bash

IFS=',' read -ra ADDR <<< "$CERTDOMAINS"
for i in "${ADDR[@]}"; do
    DOMAINS=$DOMAINS" -d "$i
done
echo -e $DOMAINS

certbot certonly $TESTCERT -n --standalone --email $CERTBOTEMAIL --agree-tos --expand $DOMAINS 

# certbot certonly --test-cert -n --standalone --email $CERTBOTEMAIL --agree-tos -d api.doteva.com

rm -rf /var/lib/neo4j/certificates/neo4j.*
cp /etc/letsencrypt/live/$CERTDOMAIN/cert.pem /var/lib/neo4j/certificates/neo4j.cert
cp /etc/letsencrypt/live/$CERTDOMAIN/privkey.pem /var/lib/neo4j/certificates/neo4j.key

sudo cat <<EOF>  /opt/server/certsrenew.sh
#!/bin/bash
rm -rf /var/lib/neo4j/certificates/neo4j.*
cp /etc/letsencrypt/live/$CERTDOMAIN/cert.pem /var/lib/neo4j/certificates/neo4j.cert
cp /etc/letsencrypt/live/$CERTDOMAIN/privkey.pem /var/lib/neo4j/certificates/neo4j.key
# service nginx restart
EOF

sudo cat <<EOF>  /etc/cron.daily/certscron.sh
#!/bin/bash
certbot renew --renew-hook /opt/server/certsrenew.sh
EOF

chmod +x /opt/server/certsrenew.sh
chmod +x /etc/cron.daily/certscron.sh


echo -e "GETCERTS ENDED"
