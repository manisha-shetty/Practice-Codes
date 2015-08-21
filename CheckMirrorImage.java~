/*Check if two given trees are mirror iamges of each other*/

class Node{
	int info;
	Node left;
	Node right;
	Node(int i, Node l, Node r){
		info=i;	
		left=l;
		right=r;	
	}
}


class CheckMirrorImage{
	static boolean checkIfMirror(Node root1, Node root2){
		

		if(root1==null && root2==null){

			return true;}
		if(root1!=null && root2==null || root1==null && root2!=null)
			return false;
		if(root1.info!=root2.info){

			return false;}

		return checkIfMirror(root1.left,root2.right) && checkIfMirror(root1.right,root2.left);
		

	}
	public static void main(String args[]){
		Node root1=new Node(1,new Node(2,new Node (4,new Node(7,null,null),null),null),new Node(3,new Node (5,null,null),new Node (6,null,null)));
		Node root2=new Node(1,new Node(3,new Node (6,null,null),new Node (5,null,null)),new Node(2,null,new Node (4,new Node(7,null,null),null)));


		System.out.println(checkIfMirror(root1,root2));
}

}
