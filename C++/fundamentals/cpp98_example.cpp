#include <iostream>
#include <string>

class HumanBeing{
public:
  HumanBeing(std::string n): name(n){}
  std::string getName() const{ 
      return name;
  }
  void chanName(const std::string& newName){
    name = newName; 
  }
private:
  std::string name;
};

class Man: public HumanBeing{ using HumanBeing::HumanBeing;
public:
  std::string getSex() const{
     return "male";
  }
};

class Woman: public HumanBeing{ using HumanBeing::HumanBeing;
public:
  std::string getSex() const{
    return "female";
  } 
};

// Generics
template <typename T>
void _swap(T& x, T& y){
  T t= x;
  x= y;
  y= t;
};

template <typename T, int N>
class Array{
public:
  int getSize() const{
    return N;
  }
private:
  T *elem[N];
};

int main(){
  Man man("Le Nam");
  std::cout << "Name: " << man.getName() << std::endl;
  std::cout << "Sex: " << man.getSex() << std::endl;
  

  int a = 10;
  int b = 20;
  std::cout << "i = " << a << ", j = " << b << std::endl;

  _swap(a, b);
  std::cout << "i = " << a << ", j = " << b << std::endl;

  Array<double, 10> doubleArray;
  std::cout << doubleArray.getSize() << std::endl;

  Array<int, 10> intArray;
  std::cout << intArray.getSize() << std::endl;
  

}