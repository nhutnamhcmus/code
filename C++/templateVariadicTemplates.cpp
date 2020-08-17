#include <iostream>

template <typename... Args>
int printSize(Args... args)
{
    return sizeof...(args);
}

template <int...>
struct Mult;

template <>
struct Mult<>
{
    static const int value = 1;
};

template <int i, int... tail>
struct Mult<i, tail...>
{
    static const int value = i * Mult<tail...>::value;
};

int main()
{

    std::cout << std::endl;

    std::cout << "printSize(): " << printSize() << std::endl;
    std::cout << "printSize(template,2011,true): " << printSize("template", 2011, true) << std::endl;
    std::cout << "printSize(1, 2.5, 4, 5, 10): " << printSize(1, 2.5, 4, 5, 10) << std::endl;

    std::cout << std::endl;

    std::cout << "Mult<10>::value: " << Mult<10>::value << std::endl;
    std::cout << "Mult<10,10,10>::value: " << Mult<10, 10, 10>::value << std::endl;
    std::cout << "Mult<1,2,3,4,5>::value: " << Mult<1, 2, 3, 4, 5>::value << std::endl;

    std::cout << std::endl;
    std::cin.get();
    return 0;
}
