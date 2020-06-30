#include<iostream>
#include<cmath>
using namespace std;
int power(int m,int n)
{
    int i,j;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int main()
{
    int num,f,rem,sum=0,temp,a=0;
    cin>>num;
     temp=num;
  while(temp!=0)
  {
    temp=temp/10;
    a=a+1;
  }
  f=num;
  while(f!=0)
  {
    rem=f%10;
    sum=sum+pow(rem,a);
    f=f/10;
  }
    if(sum==num)
        cout<<"Kindly proceed with encrypting";
    else
        cout<<"It is not an Armstrong number";
    
}