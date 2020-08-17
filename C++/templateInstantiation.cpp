#include <iostream>
#include <vector>

template <typename T, int N>
class Array
{

public:
    Array() = default;

    int getSize() const
    {
        return N;
    }

    std::vector<T> elem;
};

template <typename T>
bool isSmaller(T fir, T sec)
{
    return fir < sec;
}

template class std::vector<int>;
template bool std::vector<double>::empty() const;

template class Array<int, 20>;
template int Array<double, 5>::getSize() const;

template bool isSmaller(double, double);
template bool isSmaller<int>(int, int);

int main()
{

    std::cout << std::endl;

    std::cout << std::boolalpha << "implicit" << std::endl;

    std::cout << std::endl;

    std::vector<int> vec{};
    std::cout << "vec.size(): " << vec.size() << std::endl;

    Array<int, 10> arr;
    std::cout << "arr.getSize(): " << arr.getSize() << std::endl;

    std::cout << std::endl;

    std::cout << "isSmaller(5, 10): " << isSmaller(5, 10) << std::endl;

    std::cout << "isSmaller<double>(5.5, 6.5): " << isSmaller<double>(5.5, 6.5) << std::endl;

    std::cout << std::endl;

    std::cin.get();
    return 0;
}
