#include <iostream>
#include <string>
using namespace std;
int main() {
    string vowels[5] = {"a", "e", "i", "o", "u"};
    cout << "Vowels array:\n";
    for(int i = 0; i < 5; i++) {
        cout << "index " << i << " -> " << vowels[i] << endl;
    }

    cout << "\n";

    int index;
    cout << "បញ្ចូល index (0 ដល់ 4): ";
    cin >> index;
    
    if(index >= 0 && index < 5) {
        cout << "តម្លៃនៅ index " << index << " គឺ: " << vowels[index] << endl;
    }
    else {
        cout << "Index មិនត្រឹមត្រូវ! ត្រូវតែបញ្ចូលចន្លោះពី 0 ដល់ 4 ប៉ុណ្ណោះ។" << endl;
    }
    
    cout << "\nរួចរាល់។\n";
    return 0;
}