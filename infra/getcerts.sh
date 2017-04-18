#!/bin/bash

IFS=',' read -ra ADDR <<< "$CERTDOMAINS"
for i in "${ADDR[@]}"; do
    DOMAINS=$DOMAINS" -d "$i
done
echo -e $DOMAINS

certbot certonly $TESTCERT -n --standalone --email $CERTBOTEMAIL --agree-tos --expand $DOMAINS 

# certbot certonly --test-cert -n --standalone --email $CERTBOTEMAIL --agree-tos -d api.doteva.com

rm -rf /var/lib/neo4j/certificates/neo4j.*
cp -s /etc/letsencrypt/live/$CERTDOMAIN/cert.pem /var/lib/neo4j/certificates/neo4j.cert
cp -s /etc/letsencrypt/live/$CERTDOMAIN/privkey.pem /var/lib/neo4j/certificates/neo4j.key

echo -e "GETCERTS ENDED"
