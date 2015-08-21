/*Given a BST and 2 nodes in the BST, find the length of the path between the two given nodes.
Example:
Input: the below tree and node 3 & 7
Output: 5*/
import java.io.*;
class Node{

int info;
Node left; Node right;

Node(int i,Node l,Node r){
info=i;
left=l;
right=r;

}

}
public class PathBetweenNodesBST{

public static int findDepth(Node n,int el){
int d=0;
while( n!=null){

if(el<n.info){d++; n=n.left;}
if(el>n.info) {d++;n=n.right;}
if(el==n.info) return d;
}
return -1;

}
public static void main(String args[]){

Node n3=new Node(3,null,null);
Node n8=new Node(8,null,null);
Node n1=new Node(1,null,null);
Node n4=new Node(4,n3,null);
Node n2=new Node(2,n1,n4);
Node n7=new Node(7,null,n8);
Node n6=new Node(6,null,n7);
Node root=new Node(5,n2,n6);

try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=1;//Integer.parseInt(br.readLine());
int b=8;//Integer.parseInt(br.readLine());
Node n=root;
int ht=0;
boolean flag=true;
while(flag  && n!=null){
if(a==n.info && flag){
ht=findDepth(n,b);
flag=false;
}



else if(b==n.info && flag){
ht=findDepth(n,a);
flag=false;
}



else if (flag){

while(a<n.info && b<n.info && n!=null) n=n.left;
while(a>n.info && b>n.info && n!=null) n=n.right;
if(a<n.info && b>n.info || a>n.info && b<n.info){
int ht1=findDepth(n,a);
int ht2=findDepth(n,b);
ht= ht1+ht2;
flag=false;
}

} 


}//while1

System.out.println(ht);
}catch(Exception e){}

}
}
