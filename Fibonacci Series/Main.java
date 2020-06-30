#include<iostream>
using namespace std;
int fib(int);
int main()
{
  int n,i=0,res;
  cin>>n;
  res=fib(n-1);
  cout<<"The term "<<n<<" in the fibonacci series is "<<res; 
  return 0;
  //Type your code here.
}
int fib(int n)
{
  if(n==0)
  {
    return 0;
  }
  else if(n==1)
  {
    return 1;
  }
  else
  {
    return(fib(n-1)+fib(n-2));
  }
 
}