#include <iostream>
#include <string>
using namespace std;
int main() {
    string vowels[5] = {"a", "e", "i", "o", "u"};
    
    cout << ". sort index of letter\n";
    for(int i = 0; i < 5; i++) {
        cout << "index " << i << " → " << vowels[i] << endl;
    }
    return 0;
}