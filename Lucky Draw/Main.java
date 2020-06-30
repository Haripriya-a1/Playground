#include<iostream>
using namespace std;
int main()
{
  int n,i,m=0,flag=0;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(n%i==0)
    {
      m++;
    }
  }
  switch(m)
  {
    case 2 : cout<<"Eligible"<<"\n";
      break;
    default:cout<<"Not eligible";
      break;
  }
  return 0;
}