#include<iostream>
using namespace std;
int main()
{
  int a,b,c,i,t,s;
  cin>>a>>b>>c;
  if(a>b && a>c)
  {
    if(b>c)
      s=b;
    else
      s=c;
  }
  else if(b>c && b>a)
  {
    if(a>c)
      s=a;
    else
      s=c;
  }
  else
  {
    if(a>b)
      s=a;
    else
      s=b;
  }
  cout<<"The treasure is in box which has number "<<s;
  for(i=1;i<=10;i++)
  {
    if(a%i==0 && b%i==0 && c%i==0)
    {
      t=i;
    }
  }
    cout<<"\nThe code to open the box is "<<t;
  
  //Type your code here.
}