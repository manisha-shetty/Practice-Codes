/*first non repeating character in given string*/

public class NonRepeatingChar{

public static void main(String args[]){

String s="googlelmemnngt";


char letter[] = s.toCharArray();
int asci[]=new int[256];
char nonr=' ';

for (int i=0;i<letter.length;i++){
if(asci[(int)letter[i]]=='\0'){
asci[(int)letter[i]]=1;
if(nonr==' ')
nonr=letter[i];

}
else {
asci[(int)letter[i]]+=1;
if(nonr==letter[i])
nonr=' ';
}
}
System.out.println(nonr);


}

}
