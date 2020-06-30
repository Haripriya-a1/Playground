#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2,d,c;
  cin>>d1>>c1>>d2>>c2;
  d=d1+d2;
  c=c1+c2;
  while(c>100)
  {
    c=c-100;
    d=d+1;
    break;
  }
  cout<<d<<"\n"<<c;
  return 0;
  //Type your code here.
}