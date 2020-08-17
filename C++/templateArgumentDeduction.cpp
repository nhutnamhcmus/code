#include <iostream>

template <typename T>
bool isSmaller(T fir, T sec)
{
    return fir < sec;
}

template <typename T, typename U>
bool isSmaller2(T fir, U sec)
{
    return fir < sec;
}

template <typename R, typename T, typename U>
R add(T fir, U sec)
{
    return fir + sec;
}

int main()
{

    std::cout << std::boolalpha << std::endl;

    std::cout << "isSmaller(1,2): " << isSmaller(1, 2) << std::endl;
    // std::cout << "isSmaller(1,5LL): "  << isSmaller(1,5LL) << std::endl; // ERROR

    std::cout << "isSmaller<int>(1,5LL): " << isSmaller<int>(1, 5LL) << std::endl;
    std::cout << "isSmaller<double>(1,5LL): " << isSmaller<double>(1, 5LL) << std::endl;

    std::cout << std::endl;

    std::cout << "isSmaller2(1,5LL): " << isSmaller2(1, 5LL) << std::endl;

    std::cout << std::endl;

    std::cout << "add<long long int>(1000000,1000000): " << add<long long int>(1000000, 1000000) << std::endl;
    std::cout << "add<double,double>(1000000,1000000): " << add<double, double>(1000000, 1000000) << std::endl;
    std::cout << "add<double,double,float>(1000000,1000000): " << add<double, double, float>(1000000, 1000000) << std::endl;

    std::cout << std::endl;


    std::cin.get();
    return 0;
}