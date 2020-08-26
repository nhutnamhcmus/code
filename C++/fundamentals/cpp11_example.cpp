#include <iostream>
#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
#include <functional>
#include <cctype>

// the language focus on functional programming

// Shared, unique pointers (smart pointers)
// Null pointers
// Automatic type deduction
// Lambda expressions

int main()
{
    std::vector<int> vec{1, 2, 3, 4, 5, 6, 7, 8, 9};
    std::vector<std::string> str{"Programming", "in", "a", "functional", "style."};

    std::accumulate(vec.begin(), vec.end(), 1, [](int a, int b) { return a * b; }); // 362880

    std::accumulate(str.begin(), str.end(), std::string{},
                    [](std::string a, std::string b) { return a + ":" + b; });
    // "Programming:in:a:functional:style."

    std::transform(vec.begin(), vec.end(), vec.begin(),
                   [](int i) { return i * i; }); // {1, 4, 9, 16, 25, 36, 49, 64, 81}

    auto it = std::remove_if(vec.begin(), vec.end(),
                             [](int i) { return ((i < 3) || (i > 8)); }); // {3, 4, 5, 6, 7, 8}

    auto it2 = std::remove_if(str.begin(), str.end(),
                              [](std::string s) { return (std::tolower(s[0])); }); // "Programming"
}