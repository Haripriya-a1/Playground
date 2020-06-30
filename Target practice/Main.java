#include<iostream>
using namespace std;
int main()
{
  int target,score,tt=0,sum=0;
  cin>>target;
  while(sum<target)
  {
    cin>>score;
    sum=sum+score;
    tt++;
  }
  cout<<"The number of turns is "<<tt;
  //Type your code here.
}