#include <iostream>

struct Data {
    double x;
};

const Data* data;

decltype(data->x) y;
decltype((data->x)) z = y;

// C++14
/*
template<typename T, typename U>
auto add(T t, U u) { return t + u; }
*/

int main() {
    int i = 24;
    decltype(i) j = i * 2;

    auto mul = [](int a, int b) -> int { return a * b; };
    decltype(mul) g = mul;
    int a = mul(3, 3);
    int b = g(10, 2);
    std::cout << "i = " << i << ", " << "j = " << j << std::endl;

    std::cout << "a = " << a << ", " << "b = " << b << std::endl;
}