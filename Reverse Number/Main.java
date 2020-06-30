#include <iostream>
using namespace std;
int main() 
{
  int rem,rev=0,num;
  cin>>num;
  while(num>0)
  {
    rem=num%10;
    rev=rev*10+rem;
    num=num/10;
    
  }
  cout<<rev;
	// Type your code here
	return 0;
}