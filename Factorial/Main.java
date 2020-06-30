#include<iostream>
using namespace std;
  long int multiplyNum(int n);
  int main()
  {
    int n;
    cin>>n;
    cout<<"The factorial of "<<n<<" is "<<multiplyNum(n);
    return 0;
  }
  //Type your code here.
long int multiplyNum(int n)
{
  if(n>=1)
    return n*multiplyNum(n-1);
  else
    return 1;
}