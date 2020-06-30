#include<iostream>
using namespace std;
int main()
{
  int a,b,c,r;
  cin>>a>>b>>c;
  r=c%3;
  if(c<a || c<b || b%c==0 || c%b==1)
  {
    cout<<"Yes";
  }
  else
    cout<<"No";
  //Type your code here.
}