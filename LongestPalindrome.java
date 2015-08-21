class LongestPalindrome{


static int max(int x,int y){
return x<y?y:x;
 
}
public static void main(String args[]){

String a="maamadamama";
int n=a.length();
int l[][]=new int[n][n];
int i,j,len;

//str len=1 are all palins
for(i=0;i<n;i++)
l[i][i]=1;

for(len=2;len<=n;len++){
for(i=0;i<=n-len;i++){
j=i+len-1;
if(a.charAt(i)==a.charAt(j) && len==2)
	l[i][j]=2;
else if(a.charAt(i)==a.charAt(j) )
	l[i][j]=l[i+1][j-1]+2;
else 	
	l[i][j]=max(l[i][j-1],l[i+1][j]);

}
}//for
System.out.println( l[0][n-1]);
}

}
