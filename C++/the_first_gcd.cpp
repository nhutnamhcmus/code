#include <iostream>

template <typename T>
T gcd(T a, T b)
{
    if (b == 0)
        return a;
    else
        return gcd(b, a % b);
}

int main()
{
    std::cout << gcd(100, 10) << std::endl;     // 10
    std::cout << gcd(100, 33) << std::endl;     // 1
    std::cout << gcd(100, 0) << std::endl;      // 100
    // std::cout << gcd(3.5, 4.0) << std::endl;    // ERROR
    // std::cout << gcd("100", "10") << std::endl; // ERROR
    // std::cout << gcd(100, 10L) << std::endl;    // ERROR

    std::cin.get();
    return 0;
}