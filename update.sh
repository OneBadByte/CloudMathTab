#!/bin/bash

echo "started"

git add -f *
echo "input commit message" 
read text 
git status
git commit -m " $text " 
git push -u origin
echo "done"
git log 

