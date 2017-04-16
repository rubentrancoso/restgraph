#!/bin/bash
certbot certonly --test-cert -n --standalone --email rubentrancoso@gmail.com --agree-tos -d api.doteva.com
certbot certonly --test-cert -n --standalone --email rubentrancoso@gmail.com --agree-tos -d angular.doteva.com 
certbot certonly --test-cert -n --standalone --email rubentrancoso@gmail.com --agree-tos -d neo.doteva.com
