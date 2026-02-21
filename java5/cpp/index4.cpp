#include <iostream>
#include <string>
using namespace std;
int main() {
    int n;
    cout << ". element: ";
    cin >> n;
    
    string arr[100];
    
    cout << ". index " << n << " elements:\n";
    for(int i = 0; i < n; i++) {
        cout << "ទី " << (i+1) << ": ";
        cin >> arr[i];
    }
    
    cout << "\nreslut:\n";
    for(int i = 0; i < n; i++) {
        cout << arr[i] << "  ";
    }
    cout << endl;
    
    return 0;
}