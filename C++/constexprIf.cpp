#include <iostream>
#include <type_traits>

// SFINAE

template <typename T, std::enable_if_t<std::is_arithmetic<T>{}> * = nullptr>
auto get_value_SFINAE(T)
{
    std::cout << "get_Value_SFINAE(5)" << std::endl;
}

template <typename T, std::enable_if_t<!std::is_arithmetic<T>{}> * = nullptr>
auto get_value_SFINAE(T)
{
    std::cout << "get_Value_SFINAE(five)" << std::endl;
}

// Tag dispatch

template <typename T>
auto get_value_TAG_DISPATCH(T, std::true_type)
{
    std::cout << "get_Value_TAG_DISPATCH(5)" << std::endl;
}

template <typename T>
auto get_value_TAG_DISPATCH(T, std::false_type)
{
    std::cout << "get_Value_TAG_DISPATCH(five)" << std::endl;
}

template <typename T>
auto get_value_TAG_DISPATCH(T t)
{
    return get_value_TAG_DISPATCH(t, std::is_arithmetic<T>{});
}

// constexpr if

template <typename T>
auto get_value_CONSTEXPR_IF(T)
{
    if constexpr (std::is_arithmetic_v<T>)
    {
        std::cout << "get_Value_CONSTEXPR_IF(5)" << std::endl;
    }
    else
    {
        std::cout << "get_Value_CONSTEXPR_IF(five)" << std::endl;
    }
}

int main()
{

    std::cout << std::endl;

    get_value_SFINAE(5);
    get_value_SFINAE("five");

    std::cout << std::endl;

    get_value_TAG_DISPATCH(5);
    get_value_TAG_DISPATCH("five");

    std::cout << std::endl;

    get_value_CONSTEXPR_IF(5);
    get_value_CONSTEXPR_IF("five");

    std::cout << std::endl;
    std::cin.get();
    return 0;
}
