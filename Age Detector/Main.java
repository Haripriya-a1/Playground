#include<iostream>
using namespace std;
int main()
{
  int x,y,a,b;
  cin>>a>>b;
  if(a>b)
  {
    x=1900+a;
    y=2000+b;
    cout<<y-x;
  }
  else
  {
    x=2000+a;
    y=2000+b;
    cout<<y-x;
  }
  //Type your code here.
}