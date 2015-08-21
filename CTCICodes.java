import java.util.*;
public class CTCICodes {


public static void removeDuplicates(char[] strArr){
if(strArr==null)
return;
char tmp;
int i,j,mark;
for(i=0;i<strArr.length;i++){
mark=i+1;
for(j=i+1;j<strArr.length;j++){
if(strArr[i]!=strArr[j]){
strArr[mark++]=strArr[j];
} else
strArr[j]='\0';
}
}
System.out.print("length:"+strArr.length+" New String:");
for(i=0;i<strArr.length;i++){
System.out.print(strArr[i]);
}
System.out.println();
}
 	
public static void identifyAnagrams(char[] s1, char[] s2){
int i,j;
if( s1.length!=s2.length || s1==null || s2==null)
{
System.out.println("Not anagrams due to len");
return;
}
for (i=0;i<s1.length;i++){
for(j=0;j<s2.length;j++){
if(s1[i]==s2[j]){
s2[j]='\0'; 
break;
}
}
if(j==s2.length){
System.out.println("Not anagrams");
return;
}
}
System.out.println("Anagrams");
}

public static void rotateBy90(int[][] a,int n){
int i,j,tmp;
//print input array
System.out.println("Input array is:");
for(i=0;i<n;i++){
for(j=0;j<n;j++){
System.out.print(a[i][j]+" ");
}
System.out.println();
}
for(i=0;i<n;i++){
for(j=0;j<(n/2);j++){
tmp=a[i][j];
a[i][j]=a[i][n-j-1];
a[i][n-j-1]=tmp;
}
}
for(i=0;i<n;i++){
for(j=0;j<(n-1-i);j++){
tmp=a[i][j];
a[i][j]=a[n-j-1][n-i-1];
a[n-j-1][n-i-1]=tmp;
}
}
//print output array
System.out.println("Output array is:");
for(i=0;i<n;i++){
for(j=0;j<n;j++){
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
//char[] s1=sc.next().toCharArray();
//char[] s2=sc.next().toCharArray();
//removeDuplicates(strArr);
//identifyAnagrams(s1,s2);

int n=4;
int[][] a= new int[n][n];
System.out.println("Enter array:");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
a[i][j]=sc.nextInt();
}
}
rotateBy90(a,n);
}

}

