// include session
#include <iostream>
#include <functional>
#include <vector>
#include <algorithm>
#include <numeric>
#include <cmath>
#include <bitset>

// ----------------------------------------------------------------------------
// constants
const double pi = 3.1416;

template <typename T>
auto sum = [](T a, T b) { return a + b; };

template <typename T>
auto multiply = [](T a, T b) -> T { return a * b; };

auto add = sum<int>;

auto mul = multiply<int>;

auto whatPi = []() {
    std::cout << "The value of pi is " << pi << std::endl;
};

auto gene_lambda = [](auto arg) { return arg + arg; };
// ----------------------------------------------------------------------------
// function
int _sum(int x, int y)
{
    return x + y;
}

template <typename T>
T _SUM(T x, T y)
{
    return x + y;
}

class ADD
{
    int operator()(int x, int y)
    {
        return x + y;
    }
};

// -> function in action
std::function<int(int, int)> function_1 = _sum;
std::function<double(double, double)> function_2 = _SUM<double>;
// -> lambda in action
std::function<int(int, int)> function_3 = [](double A, double B) { return A + B; };
template <typename T>
std::function<int(int, int)> function_4 = [](T a, T b) -> T { return a * b; };
// ----------------------------------------------------------------------------
// -> immutability
constexpr int Fibonacci(int x)
{
    return (x <= 1) ? x : Fibonacci(x - 1) + Fibonacci(x - 2);
}

int main()
{
    /*
    // ----------------------------------------------------------------------------
    // Hello world
    std::cout << "Hello, World!" << std::endl;
    // ----------------------------------------------------------------------------
    // First Class Functions
    [](){
        std::cout << "Hello World with Lambda Expression.!" <<std::endl;
    }

            ();

    int a = 2;
    int b = 3;
    std::cout << a << " + " << b << " = " << sum<int>(a, b) << std::endl;

    std::cout << "1.5 + 2.5 = " << sum<double>(1.5, 2.5) << std::endl;

    std::cout << "1 x 2 = " << mul(1, 2) << std::endl;

    std::cout << gene_lambda(5) << std::endl;

    std::cout << gene_lambda(3.1416) << std::endl;

    // ----------------------------------------------------------------------------
    // higher order functions

    // init vector v
    std::vector<int> v{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    // -> transform in action
    std::transform(v.begin(),
                   v.end(),
                   v.begin(),
                   [](int n) {return n + (n * 2);}
                   );
    std::cout << "Display vector v = ";
    std::for_each(v.begin(),
                  v.end(),
                  [](const int&x) {std::cout << x << " ";}
                  );
    std::cout << std::endl;
    // Result: Display vector v = 3 6 9 12 15 18 21 24 27 30

    // -> remove_if in action
    std::remove_if(v.begin(),
                   v.end(),
                   [](int n) {return n % 2 != 0;}
                   );
    std::cout << "Display vector v = ";
    std::for_each(v.begin(),
                  v.end(),
                  [](const int&x) {std::cout << x << " ";}
                  );
    std::cout << std::endl;
    // Result: Display vector v = 6 12 18 24 30 18 21 24 27 30

    // -> copy_if in action
    // init vector v1
    std::vector<int> v1;

    std::copy_if(v.begin(),
                 v.end(),
                 std::back_inserter(v1),
                 [](int n) {return n % 2 != 0; }
                );
    std::cout << "Display vector v1 = ";
    std::for_each(v1.begin(),
                  v1.end(),
                  [](const int&x) {std::cout << x << " ";}
    );
    std::cout << std::endl;
    // Result: Display vector v1 = 21 27

    // -> accumulate in action
    auto sum = std::accumulate(begin(v1), end(v1), 0);
    std::cout << sum << std::endl;
    // ----------------------------------------------------------------------------
    // -> pure function
    std::cout << "Absolute value of +0.025 is " << abs(+0.025) << std::endl;
    std::cout << "Absolute value of -1.62 is " << abs(-1.62) << std::endl;
    std::cout << "Square root of 25 is " << sqrt(25) << std::endl;
    std::cout << "square of 10 is " << pow(10, 2) << std::endl;
    // ----------------------------------------------------------------------------
    // -> immutability
    // call
    std::cout << Fibonacci(20) << std::endl;*/

    int x = 1;
    std::cout << ~x << std::endl;

    std::bitset<32> y(~x);
    std::cout << y << '\n';
    return 0;
}
