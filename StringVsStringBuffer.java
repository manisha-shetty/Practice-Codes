class StringVsStringBuffer{

public static void main(String[] args){

String str=new String("firstString");
StringBuffer strbuf=new StringBuffer("firstStringBuffer");
System.out.println("Str:"+str+" Strbuf:"+strbuf);

 str=new String("secondString");
 strbuf=new StringBuffer("secondStringBuffer");
System.out.println("Str:"+str+" Strbuf:"+strbuf);

char c[] ="first char array".toCharArray(); //16 chars
c[c.length]=null;
System.out.println(c[16]);
System.out.println("length:"+c.length);



}
}
