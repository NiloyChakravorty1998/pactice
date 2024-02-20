#!/bin/bash

echo "Adding all files for staging"
git add .
read -p "Add a commit message for staging : " MSG
git commit -m "$MSG"
echo "Pushing to upstream"
git push
