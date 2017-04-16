#!/bin/bash
DIR="${BASH_SOURCE%/*}"
if [[ ! -d "$DIR" ]]; then DIR="$PWD"; fi
. "$DIR/PARAMETERS"
. "$DIR/infra/buildhost.sh"
. "$DIR/infra/server.sh"
. "$DIR/infra/certbot/getcerts.sh"
. "$DIR/infra/nginx.sh"
. "$DIR/front/install.sh"

