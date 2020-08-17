#include <iostream>

int power(int m, int n)
{
    int r = 1;
    for (int k = 1; k <= n; ++k)
        r *= m;
    return r;
}

template <int m, int n>
struct Power
{
    static const int value = Power<m, n - 1>::value * m;
};

template <int m>
struct Power<m, 0>
{
    static const int value = 1;
};

template <int n>
int power2(const int &m)
{
    return power2<n - 1>(m) * m;
}

template <>
int power2<1>(const int &m)
{
    return m;
}

template <>
int power2<0>(const int &)
{
    return 1;
}

int main()
{

    std::cout << std::endl;

    std::cout << "power(2,10):        " << power(2, 10) << std::endl;
    std::cout << "power2<10>(2):       " << power2<10>(2) << std::endl;
    std::cout << "Power<2,10>::value: " << Power<2, 10>::value << std::endl;

    std::cout << std::endl;
    std::cin.get();
    return 0;
}
