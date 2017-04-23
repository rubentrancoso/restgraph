#!/bin/bash
cd html
case $( uname -s ) in
Linux) python -m SimpleHTTPServer 80
;;
Darwin) python3 -m http.server 80
;;
*)     echo "Which OS is that?";;
esac
