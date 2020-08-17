#include <iostream>
#include <type_traits>

template<typename T1, typename T2> 
??? gcd(T1 a, T2 b){
  static_assert(std::is_integral<T1>::value, "T1 should be integral!");
  static_assert(std::is_integral<T2>::value, "T2 should be integral!");
  if( b == 0 ) 
    return a;
  else 
    return gcd(b, a % b);
}

int main(){
  std::cout << gcd(100, 10L) << std::endl;
  std::cin.get();
  return 0;
}