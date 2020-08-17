#include <iostream>
#include <type_traits>

template <typename T>
void getPrimaryTypeCategory()
{

    std::cout << std::boolalpha << std::endl;

    std::cout << "is_void<T>::value: " << std::is_void<T>::value << std::endl;
    std::cout << "is_integral<T>::value: " << std::is_integral<T>::value << std::endl;
    std::cout << "is_floating_point<T>::value: " << std::is_floating_point<T>::value << std::endl;
    std::cout << "is_array<T>::value: " << std::is_array<T>::value << std::endl;
    std::cout << "is_pointer<T>::value: " << std::is_pointer<T>::value << std::endl;
    std::cout << "is_reference<T>::value: " << std::is_reference<T>::value << std::endl;
    std::cout << "is_member_object_pointer<T>::value: " << std::is_member_object_pointer<T>::value << std::endl;
    std::cout << "is_member_function_pointer<T>::value: " << std::is_member_function_pointer<T>::value << std::endl;
    std::cout << "is_enum<T>::value: " << std::is_enum<T>::value << std::endl;
    std::cout << "is_union<T>::value: " << std::is_union<T>::value << std::endl;
    std::cout << "is_class<T>::value: " << std::is_class<T>::value << std::endl;
    std::cout << "is_function<T>::value: " << std::is_function<T>::value << std::endl;
    std::cout << "is_lvalue_reference<T>::value: " << std::is_lvalue_reference<T>::value << std::endl;
    std::cout << "is_rvalue_reference<T>::value: " << std::is_rvalue_reference<T>::value << std::endl;

    std::cout << std::endl;
}

int main()
{
    getPrimaryTypeCategory<void>();

    std::cin.get();
    return 0;
}