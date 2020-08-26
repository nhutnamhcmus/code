#include <iostream>
#include <typeinfo>

template<class T, class U>
auto add(T t, U u) { return t + u; }

int main() {

    auto a = 1 + 2;
    std::cout << "Value of variable a is " << a << std::endl;
    std::cout << typeid(a).name() << std::endl;
    auto b = add(1, 1.3);
    std::cout << "Value of variable b is " << b << std::endl;
    std::cout << typeid(b).name() << std::endl;
    std::cin.get();
    return 0;
}