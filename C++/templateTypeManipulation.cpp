#include <iostream>
#include <type_traits>

template <typename T>
struct RemoveConst
{
    typedef T type;
};

template <typename T>
struct RemoveConst<const T>
{
    typedef T type;
};

int main()
{

    std::cout << std::boolalpha << std::endl;

    std::cout << "std::is_same<int, RemoveConst<int>::type>::value: " << std::is_same<int, RemoveConst<int>::type>::value << std::endl;
    std::cout << "std::is_same<int, RemoveConst<const int>::type>::value: " << std::is_same<int, RemoveConst<const int>::type>::value << std::endl;

    std::cout << std::endl;
    std::cin.get();
    return 0;
}