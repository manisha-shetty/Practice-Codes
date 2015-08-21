import java.util.*;

class Node{

String info;
int level;
Node left;
Node right;
boolean visited;
Node(String i, int l,Node lt,Node rt){
info=i;
level=l;
left=lt;
right=rt;
visited=false;
}

}


public class LongestPathTree{

static Node root=new Node();
String path=new String();

public static int height(Node n){
if (n==null) return 0;
int lht=height(n.left);
int rht=height(n.right);
path=path + ""+ (lht==rht==0)? n.info:(lht>rht ?n.left.info:n.right.info);
return  1+max(lht,rht);
}

public static void main(String args[]){
 
Node d=new Node("D",0,null,null);
Node e=new Node("E",0,d,null);
Node c=new Node("C",0,null,null);
Node g=new Node("G",0,null,null);
Node f=new Node("F",0,g,null);
Node b=new Node("B",0,c,e);
Node a=new Node("A",0,b,f);

root=a;

Stack s=new Stack();
s.push(root);
int depth=0;

while(root.left!=null){
s.push(root)
depth++;
root=root.left;
}

}


}
}
