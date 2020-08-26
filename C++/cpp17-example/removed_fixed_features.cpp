#include <iostream>

// Removing Deprecated Exception Specifications
/*void fooThrowsInt(int a) throw(int)
{
    printf("can throw ints\n");
    if (a == 0)
        throw 1;
}*/

// Removing Trigraphs

// Trigraph     |   Replacement
// ??=          |   #
// ??(          |   [
// ??<          |   {
// ??/          |   \
// ??)          |   ]
// ??>          |   }
// ??’          |   ˆ
// ??!          |   |
// ??           |   ~

int main()
{
    // Removing the 'register' Keyword
    // register int a;
    // when we compile by the command: g++ -std=c++17 removed_fixed_features.cpp
    // Terminal warning: ISO C++17 does not allow 'register' storage class specifier [-Wregister]

    // Removing Deprecated Operator ++ (bool)
    bool b;
    // b++; we got an orror here
    // when we compile this file by the command: g++ -std=c++17 removed_fixed_features.cpp -> error: use of an operand of type 'bool' in 'operator++' is forbidden in C++17

    // call function
    // fooThrowsInt(0); //  error: ISO C++17 does not allow dynamic exception specifications

    // Fixes
    auto x1 = {1, 2};   // decltype(x1) is std::initializer_list<int>
    // auto x2 = {1, 2.0}; // error: cannot deduce element type
    // auto x3{1, 2};      // error: not a single element
    auto x4 = {3};      // decltype(x4) is std::initializer_list<int>
    auto x5{3};         // decltype(x5) is int

    std::cin.get();
    return 0;
}