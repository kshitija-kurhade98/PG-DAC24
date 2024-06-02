/*2: Write a program to Accept a number and display its sum of digits.:ex 568    5+6+8*/

#include <iostream>
using namespace std;
int main() {
    int number;
    cout << "Enter a number: ";
    cin >> number;
    int sum = 0;

    int remainder;
    while (number > 0) {
        remainder = number % 10; // Extract the rightmost digit
        sum += remainder; // Add the digit to the sum
        number /= 10; // Remove the rightmost digit
    }

    cout << "Sum of digits: " << sum << std::endl;

    return 0;
}