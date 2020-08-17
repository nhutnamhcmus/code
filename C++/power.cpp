#include <iostream>

// Using Function Arguments
int _power(int m, int n)
{
    int r = 1;
    for (int i = 1; i <= n; ++i)
    {
        r *= m;
    }
    return r;
}

// Using Template Arguments

template <int m, int n>
struct Power
{
    static int const value = m * Power<m, n - 1>::value;
};

template <int m>
struct Power<m, 0>
{
    static int const value = 1;
};

// Using Template Arguments and Function Arguments
template <int n>
int __power(int m)
{
    return m * __power<n - 1>(m);
}

template <>
int __power<1>(int m)
{
    return m;
}

template <>
int __power<0>(int m)
{
    return 1;
}

int main()
{

    std::cout << _power(2, 5) << std::endl; // Output: 32

    std::cout << Power<2, 7>::value << std::endl;

    std::cout << __power<9>(2) << std::endl;
    std::cin.get();
    return 0;
}