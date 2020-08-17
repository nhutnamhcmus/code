#include <iostream>
#include <string>

template <typename... Args>
auto addLeft(Args... args)
{
    return (std::string("0") + ... + args); // (((std::string("0")+"1")+"2")+"3")
}

template <typename... Args>
auto addRight(Args... args)
{
    return (args + ... + std::string("0")); // ("1"+("2"+("3" + std::string("0"))))
}

int main()
{

    std::cout << addLeft("1", "2", "3") << std::endl;  // 0123
    std::cout << addRight("1", "2", "3") << std::endl; // 1230
    std::cin.get();
    return 0;
}