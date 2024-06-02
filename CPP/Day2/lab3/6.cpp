/*6:Write a program to print following pattern.
*
* *
* * *
* * * *
* * * * * 
*/

#include <iostream>

int main() {
    int rows;
    std::cout << "Enter the number of rows: ";
    std::cin >> rows;

    // Outer loop for rows
    for (int i = 1; i <= rows; ++i) {
        // Inner loop for columns
        for (int j = 1; j <= i; ++j) {
            std::cout << "* ";
        }
        std::cout << std::endl; // Move to the next line after each row
    }

    return 0;
}