/*Given a set of words inan alien language. Find out the precedence of letters*/

import java.util.*;

class Graph{
int size;
Map<Integer,List<Integer>> adjList;
int vis[];
Stack stk;


Graph(int s){
size=s;
adjList=new HashMap<Integer,List<Integer>>();
vis=new int[s];
for ( int i=0;i<s;i++){
adjList.put(i,new LinkedList<Integer>());
vis[i]=0;
}
stk=new Stack(size);
}


void addEdge(Integer a, Integer b){
List<Integer> aList=adjList.get(a);
if(!aList.contains(b))
aList.add(b);

}

void print(){
for(int i=0;i<size;i++){
List<Integer> temp=adjList.get(i);
System.out.print("\n"+(char)(i+'a')+"-->");
for(int j=0;j<temp.size();j++)
System.out.print((char)(temp.get(j)+'a')+"-->");
}

}


void 	topoSortRec(int v,int[] vis,Stack stk){

vis[v]=1;
List<Integer> vList=adjList.get(v);

for(int j=0;j<vList.size();j++)
	if(vis[vList.get(j)]!=1 )
		topoSortRec(vList.get(j),vis,stk);

stk.push(v);

}

void toposort(){
for(int i=0;i<size;i++){
	if(vis[i]!=1 && adjList.get(i).size()!=0)
	topoSortRec(i,vis,stk);
}

while(!stk.isEmpty()){
System.out.println((char)(stk.pop()+'a'));
}
}

} //end class Graph



public class DictionaryPrecedence{

public static void main(String args[]){

Graph g=new Graph(26); // ascii values 65 to 122. (acii value-'a' will go from 0 to 26)
String word[]={"aaa","abd","bcd","bddd","bdde"};

for(int i=0;i<word.length-1;i++){
char[] word1= word[i].toLowerCase().toCharArray(); char[] word2=word[i+1].toLowerCase().toCharArray();
for(int j=0;j<Math.min(word1.length,word2.length);j++){
	if(word1[j]!=word2[j])
	{g.addEdge(word1[j]-'a',word2[j]-'a'); break;}
}
}

g.print();

g.toposort();

}

}
