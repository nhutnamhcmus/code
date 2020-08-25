#include <iostream>
#include <string>
#include <map>

int main(){
    std::map<std::string, int> mapUsersAge{{"Alex", 45}, {"John", 25}};

    std::map mapCopy{mapUsersAge};

    if (auto [iter, wasAdded] = mapCopy.insert_or_assign("John", 26); !wasAdded)
        std::cout << iter->first << " reassigned...\n";

    for (const auto &[key, value] : mapCopy) {
        std::cout << key << ", " << value << std::endl;
    }
    // stop console
    std::cin.get();
    return 0;
}