#!/bin/bash
cd frontend
sudo cp -R html /opt/server/
sudo sed -i.bak s/%APIDOMAIN%/$APIDOMAIN/g /opt/server/html/js/project.js
sudo service nginx restart
echo -e "FRONT ENDED"
