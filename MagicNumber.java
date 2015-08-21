/*A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5. First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….

Write a function to find the n’th Magic number.*/

import java.io.*;
class MagicNumber{

public static void main(String args[]){

try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
double a[]=new double[n+1];
int i=1;

int power=1;
for(i=1;i<=n;){
a[i++]=Math.pow(5,power);

for(int j=1;j<=power-1 && i<=n;j++){
	a[i++]=Math.pow(5,power)+Math.pow(5,j);

}

power++;
}

System.out.println(a[n]);
} catch(Exception e){}



}
}
