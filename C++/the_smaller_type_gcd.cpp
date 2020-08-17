#include <iostream>
#include <type_traits>
#include <typeinfo>
template <typename T1, typename T2>
typename std::conditional<(sizeof(T1) < sizeof(T2)), T1, T2>::type gcd(T1 a, T2 b)
{
    static_assert(std::is_integral<T1>::value, "T1 should be integral!");
    static_assert(std::is_integral<T2>::value, "T2 should be integral!");
    if (b == 0)
        return a;
    else
        return gcd(b, a % b);
}

int main()
{
    std::cout << gcd(100, 10LL) << std::endl;
    auto res = gcd(100, 10LL);
    std::conditional<(sizeof(long long) < sizeof(long)), long long, long>::type res2 = gcd(100LL, 10L);
    std::cout << typeid(res).name() << std::endl;  // i
    std::cout << typeid(res2).name() << std::endl; // l
    std::cout << std::endl;
    std::cin.get();
    return 0;
}