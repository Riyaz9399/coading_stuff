#include <iostream>
using namespace std;

bool isVowel(char c) {
    char vowels[] = {'a', 'e', 'i', 'o', 'u'};
    int numVowels = 5;

    for (int i = 0; i < numVowels; i++) {
        if (c == vowels[i]) {
            return true;
        }
    }
    return false;
}

int main() {
    char input;

    cout << "Enter a character (a to z): ";
    cin >> input;

    if (input >= 'a' && input <= 'z') {
        if (isVowel(input)) {
            cout << input << " is a vowel." << endl;
        } else {
            cout << input << " is a consonant." << endl;
        }
    } else {
        cout << "Invalid input. Please enter a character from a to z." << endl;
    }

    return 0;
}
