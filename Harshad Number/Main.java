#include<iostream>
using namespace std;
int main()
{
  int sum=0,num,temp;
  cin>>num;
  temp=num;
  while(temp)
  {
    sum+=temp%10;
    temp=temp/10;
  }
  int res=num%sum;
  if(res==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  //Type your code here.
}