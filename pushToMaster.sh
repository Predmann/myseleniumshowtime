git status
git add .
echo "Provide commit message"
read x
git commit -m ${x}
echo "Now push"
git push
