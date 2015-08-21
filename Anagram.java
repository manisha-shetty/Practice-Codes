/* Check if two strings are anagram.*/
import java.io.*;
public class Anagram{


public static void main(String args[]){
try{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String a=br.readLine();
String b=br.readLine();

int i,j;
boolean flag=true;
if(a.length()!=b.length())
flag=false;
else{
for ( i=0;i<a.length();i++){
for( j=0;j<b.length();j++){
if(a.charAt(i)==b.charAt(j))
{b=b.substring(0,j)+"\0"+b.substring(j+1,b.length());break;}
}
if(j>=b.length())
{flag=false;break;}
}

if(i>=a.length()) flag=true;
}
System.out.println(flag);
}catch(Exception e){}

}
}
