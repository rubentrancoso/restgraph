#!/bin/bash

IFS=',' read -ra ADDR <<< "$CERTDOMAINS"
for i in "${ADDR[@]}"; do
    DOMAINS=$DOMAINS" -d "$i
done
echo -e $DOMAINS

certbot certonly $TESTCERT -n --standalone --email $CERTBOTEMAIL --agree-tos --expand $DOMAINS 

# certbot certonly --test-cert -n --standalone --email $CERTBOTEMAIL --agree-tos -d api.doteva.com

echo -e "GETCERTS ENDED"
