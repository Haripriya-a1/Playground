#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a,b,x,y;
  cin>>a>>b>>x>>y;
  float m=a/6;
  int n=y/6;
  int p=y%6;
  float k=((float)n+(float)p/10);
  float d=x/k;
  float f=b/m;
  cout<<m<<"\n"<<fixed<<setprecision(1)<<k<<"\n"<<d<<"\n"<<f;
  if(d>f)
    cout<<"\nEligible to Win";
  else
    cout<<"\nNot Eligible to Win";
  //Type your code here.
}