#include <iostream>
#include <string>
using namespace std;
int main() {
    string fruits[5] = {"apple", "banana", "orange", "mango", "grape"};

    string names[4];
    names[0] = "Sok";
    names[1] = "Chan";
    names[2] = "Vannak";
    names[3] = "Kim";

    cout << "Fruits:\n";
    for(int i = 0; i < 5; i++) {
        cout << i << " -> " << fruits[i] << endl;
    }

    cout << "\nNames:\n";
    for(int i = 0; i < 4; i++) {
        cout << i << " -> " << names[i] << endl;
    }

    cout << "\nEnter 3 favorite colors:\n";
    string colors[3];

    for(int i = 0; i < 3; i++) {
        cout << "Color " << (i+1) << ": ";
        getline(cin, colors[i]);
    }

    cout << "\nYour colors:\n";
    for(int i = 0; i < 3; i++) {
        cout << i+1 << ". " << colors[i] << endl;
    }

    cout << "\nSearch fruit: ";
    string search;
    getline(cin, search);

    bool found = false;
    for(int i = 0; i < 5; i++) {
        if(fruits[i] == search) {
            cout << "Found at position " << i << endl;
            found = true;
        }
    }

    if(!found) {
        cout << "Not found" << endl;
    }

    cout << "\nDone.\n";
    return 0;
}
