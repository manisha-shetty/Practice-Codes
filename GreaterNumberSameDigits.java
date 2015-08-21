/*Given a no, find no greater than n and having same digits. */
import java.io.*;
class GreaterNumberSameDigits{

public static void main(String args[]){

try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String n=br.readLine();
int[] num= new int[n.length()];
int i,j;
for(i=0;i<n.length();i++)
num[i]=Integer.parseInt(String.valueOf(n.charAt(i)));


for(i=0;i<n.length();i++)
System.out.print(num[i]);
System.out.println();
for( j=n.length()-2;j>=0;j--)
{
if(num[j]<num[j+1]) break;
}
int min=Integer.MAX_VALUE;
int key=-1;
for(i=j;i<=n.length()-1;i++){
if(num[i]>num[j] && num[i]<min)
{min=num[i];key=i;}
}


num[j]+=num[key];
num[key]=num[j]-num[key];
num[j]=num[j]-num[key];

for(i=0;i<n.length();i++)
System.out.print(num[i]);
System.out.println();

for(i=j+2;i<n.length();i++){
for(int k=i;k>j+1;k--){
if(num[k-1]>num[k]){
num[k-1]+=num[k];
num[k]=num[k-1]-num[k];
num[k-1]=num[k-1]-num[k];
}
}
}

for(i=0;i<n.length();i++)
System.out.print(num[i]);
}catch(Exception e){}
}
}
