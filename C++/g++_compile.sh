for filename in *.cpp
do
	g++ $filename -o ${filename%%.cpp}
done
x='';while [[ "$x" != "A" ]]; do read -n1 x; done