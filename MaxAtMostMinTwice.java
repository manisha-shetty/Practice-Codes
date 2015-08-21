/*find the min number of elements to delete in an array such that the max is at most twice the minimum*/
import java.io.*;

class MaxAtMostMinTwice{

public static void main(String args[]){

try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
int i=0,j=0;
String s[]=new String[n];
s=br.readLine().split(" ");
for(i=0;i<n;i++){
a[i]=Integer.parseInt(s[i]);
}
int fstart=0,fend=0,lstart=0,lend=0,total=Integer.MAX_VALUE,temp=0;
for(i=0;i<n;i++){
	j=n-1;
	while(2*a[i]<a[j])
		j--;

	if(i>0)
		 temp=i; //no of els to dlete from start
	if(j<n-1) temp+=(n-1)-j;	
	if(total>temp){
		fstart=(i>0)?0:-1;
		fend=i-1;
		lstart=j+1;
		lend=(j<n-1)?n-1:n;
		total=temp;
	}
}
System.out.println(total+" From" +fstart+" to " +fend +" and from "+ lstart +" to "+ lend);
} catch(Exception e){}

}

}
