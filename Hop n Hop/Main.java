#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a=3,b=4,x,y;
  double p,p1,p2,sqr;
  cin>>x>>y;
  p1=pow((x-a),2);
  p2=pow((y-b),2);
  p=p1+p2;
  sqr=sqrt(p);
  cout<<int(sqr);//Type your code here.
}