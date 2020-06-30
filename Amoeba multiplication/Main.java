#include<iostream>
using namespace std;
int main()
{
  int f1=0,f2=1,f3,n,i;
  cin>>n;
  for(i=1;i<n;i++)
  {
    f1=f2;
    f2=f3;
    f3=f1+f2;
  }
  cout<<f3;
  //Type your code here.
}