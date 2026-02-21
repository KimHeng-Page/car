#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main() {
    string line;
    cout << "Enter a sentence: ";
    getline(cin, line);

    stringstream ss(line);
    string word;
    string result;
    int count = 0;

    while (ss >> word) {
        if (count > 0) {
            result += " ";
        }
        result += word;
        count++;
    }

    if (count == 0) {
        result = "(empty)";
    }

    cout << "\nOutput:\n";
    cout << "o " << result << endl;
    cout << "o Number of words: " << count << endl;

    return 0;
}