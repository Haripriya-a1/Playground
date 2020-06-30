#include<iostream>
using namespace std;
int main()
{
  int f1,f2,f3,s1,s2,s3,a1,a2,a3,x,y,z,p,q,r;
  cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
  x=(f1*f2)/100;
  p=f1-x+f3;
  cout<<"In Flipkart Rs."<<p;
  y=(s1*s2)/100;
  q=s1-y+s3;
  cout<<"\nIn Snapdeal Rs."<<q;
  z=(a1*a2)/100;
  r=a1-z+a3;
  cout<<"\nIn Amazon Rs."<<r;
  if(p<=q && p<=r)
    cout<<"\nHe will prefer Flipkart";
  else if(q<=p && q<=r)
    cout<<"\nHe will prefer Snapdeal";
  else
    cout<<"\nHe will prefer Amazon";
  //Type your code here.
}