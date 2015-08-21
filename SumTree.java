class SumTree{

class Node{
int info;
Node left;
Node right;

Node(int i,Node l, Node r){
info=i;
left=l;
right=r;
}

} //class node

public static  int findSum(Node root){

if(root==null) return 0;

int oldInfo=root.info;
root.info=findSum(root.left)+findSum(root.right);
return oldInfo+root.info;


}

public static void printOrder(Node root){
	
if(root==null) return;
printOrder(root.left);
System.out.print(root.info + " ");
printOrder(root.right);
}

public static void main(String args[]) {

SumTree s=new SumTree();
SumTree.Node node=s.new Node(10,s.new Node (-2,s.new Node(8,null,null), s.new Node(-4,null,null)),
			  s.new Node (6,s.new Node(7,null,null), s.new Node(5,null,null)));
printOrder(node);
if(findSum(node)!=0)
printOrder(node);
}



}
