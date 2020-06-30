#include<iostream>
using namespace std;
int main()
{
 int a,b;
  cin>>a;
  if(a<=200)
  {
    b=a*0.5;
    cout<<"Rs."<<b;
  }
  else if((a<=400)&&(a>200))
  {
    b=100+(a*0.65);
    cout<<"Rs."<<b;
  }
  else if((a<=600)&&(a>400))
  {
    b=200+(a*0.80);
    cout<<"Rs."<<b;
  }
  else
  {
    b=425+(a*1.25);
    cout<<"Rs."<<b;
  }
  //Type your code here.
}