/*
Display a letter pyramid given a string of characters.
Example 1: if given string is "ABC"
   A
  ABA
 ABCBA

 EXAMPLE 2: if given string is "123456789"
         1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
*/

#include <iostream>
using namespace std;
void letterPyramid(string str)
{
	for (int i = 0; i < str.length(); i++)
	{
		// handles white spaces
		for (int spaces = 0; spaces < str.length() - 1 - i; spaces++)
		{
			cout << " ";
		}
		// handles leftside
		for (int forward = 0; forward <= i; forward++)
		{
			cout << str.at(forward);
		}
		// handles rightside
		for (int reverse = i - 1; reverse >= 0; reverse--)
		{
			cout << str.at(reverse);
		}
		cout << endl;
	}
}
int main()
{
	string testcase1 = "abdefghijklmnop";
	return 0;
}

