public class SubstringAsAnagram{
public static void main(String args[]){
String s1="geeksforgeeks";

String s2="geeksabcdsgegeekeksforabcd";

if(s2.length()>s1.length()){ //swap so that s1 has longer
String temp=s1;
s1=s2;
s2=temp;
}
boolean isAnagram=false; int charCount=0;

for(int i=0;i<s1.length();i++){
if(s2.indexOf(s1.charAt(i))==-1){
isAnagram=false;
charCount=0;
}else {
isAnagram=true;
charCount++;
}
if(charCount==s2.length())
break;
}


System.out.println(isAnagram);
}


}
