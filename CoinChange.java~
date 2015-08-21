/*
Dynamic Programming | Set 7 (Coin Change)

Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? The order of coins doesn’t matter.

For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4. For N = 10 and S = {2, 5, 3, 6}, there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output should be 5.*/

class Coinchange{

public static void main(String args[]){

int s[]={1,2,3,4};
int n=4;

int t[][]=new int[s.length+1][n+1];


for(int i=0;i<=s.length;i++){
for(int j=0;j<=n;j++){
if(j==0)
	t[i][j]=1;
else if(i==0)
	t[i][j]=0;
else{
 if(j-s[i-1]>=0)
	t[i][j]+=t[i][j-s[i-1]];

	t[i][j]+=t[i-1][j];
	
}
}
}//for

System.out.println(t[s.length][n]);
}
}
