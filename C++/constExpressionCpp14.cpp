#include <iostream>

constexpr int gcd(int a, int b)
{
    while (b != 0)
    {
        auto t = b;
        b = a % b;
        a = t;
    }
    return a;
}

int main()
{

    std::cout << std::endl;

    constexpr auto res = gcd(100, 10);
    std::cout << "gcd(100, 10) " << res << std::endl;

    auto val = 100;
    auto res2 = gcd(val, 10);
    std::cout << "gcd(val, 10) " << res2 << std::endl;
    std::cin.get();
    return 0;
}