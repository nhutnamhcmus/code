#include <iostream>
#include <type_traits>

template <typename T1, typename T2,
          typename std::enable_if<std::is_integral<T1>::value, T1>::type = 0,
          typename std::enable_if<std::is_integral<T2>::value, T2>::type = 0,
          typename R = typename std::conditional<(sizeof(T1) < sizeof(T2)), T1, T2>::type>
R gcd(T1 a, T2 b)
{
    if (b == 0)
    {
        return a;
    }
    else
    {
        return gcd(b, a % b);
    }
}

int main()
{
    std::cout << "gcd(100, 10)= " << gcd(100, 10) << std::endl;
    std::cout << "gcd(100, 33)= " << gcd(100, 33) << std::endl;
    std::cout << "gcd(3.5, 4.0)= " << gcd(3.5, 4.0) << std::endl;
    std::cin.get();
    return 0;
}