/*
Given two integers n and k. Find n raised to k (without using inbuilt function). [ If your

algorithm’s runtime is O(k) improve the algorithm to O(log(k)) ]*/

public class PowerOfN{

static int power(int n,int p){
if(p==1)
return n;
else if(p%2==0)
return (power(n,p/2)*power(n,p/2));
else
return (power(n,p/2)*power(n,p/2+1));
}

public static void main(String args[]){
int n=2,p=10;
System.out.println(power(n,p));

}
}
