/*Check if a given string is made up of all words from a given dictionary*/

class DictionaryCheck{


static 	boolean checkDict(String s,int start,int end,String[] dict){
if(s==null || s.equals("/0") || s.length()==0) return true;
boolean s1=false,s2=false;


for(int i=start;i<end;i++){
			System.out.println("out");
	for(int j=end;j>=i;j--){
			System.out.println("in");
		for(String ds:dict){
		if(s.substring(i,j).equals(ds)){
			System.out.println(ds);
			if(i>start) s1=checkDict(s,start,i-1,dict);
			else s1=true;
			if(j<end)  s2= checkDict(s,j,end,dict);
			else s2=true;
			return s1 && s2;
		}

}
}
}
return false;

}

public static void main(String args[]){

String dict[]={"i","like","myself","and","geeks","for","geeks"};

String s="igeeklike";

//System.out.println(s.substring(0,0).length());
System.out.println(checkDict(s,0,s.length(),dict));

}
}
