#include<iostream>
using namespace std;
int main()
{
  int n,div,a,i,b,sum=0;
  cin>>a>>b;
  n=a+b;
  for(i=1;i<n;i++)
  {
    div=n%i;
    if(div==0)
      sum=sum+i;
  }
  if(sum==n)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}