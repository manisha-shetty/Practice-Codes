import java.io.*;

class FrequencyInArray{

public static int data[][];

class Node{
int info;
int count;
Node left;
Node right;

Node(int i){
info=i;
count=1;
left=null;
right=null;
}
}

static void printInorder(Node root,int index){
if(root==null) return;
printInorder(root.left,index);
data[0][index]=root.info;
data[1][index++]=root.count;
printInorder(root.right,index);
}

static void sortData(int left, int right){

if(left<right){
int mid=(left+right)/2;
sortData(left,mid);
sortData(mid+1,right);
int i,j;
int n1=mid-left+1;
int n2=right-mid;

int l[][]=new int[2][n1];
int r[][]=new int[2][n2];
for( i=0;i<n1;i++)
	{
		l[0][i]=data[0][left+i];
		l[1][i]=data[1][left+i];
	}
for( i=0;i<n2;i++)
	{
	r[0][i]=data[0][mid+1+i];
	r[1][i]=data[1][mid+1+i];
	}
int k=left;
for(i=0,j=0;i<n1 && j<n2;){

if(l[1][i]<=r[1][j])
	{

	data[0][k++]=l[0][i++];
	data[1][k++]=l[1][i++];
	}
else
	{	

	data[0][k++]=r[0][j++];
	data[1][k++]=r[1][j++];
	}

}//for

while(i<n1){

	data[0][k++]=l[0][i++];
	data[1][k++]=l[1][i++];
}
while(j<n2){

	data[0][k++]=r[0][j++];
	data[1][k++]=r[1][j++];
}

}//if





}

public static void main(String args[]){
try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
int i=0;
String s[]= new String[n];
s=br.readLine().split(" ");
for(i=0;i<n;i++){
a[i]=Integer.parseInt(s[i]);
}

FrequencyInArray f=new FrequencyInArray();
FrequencyInArray.Node root= f.new Node(a[0]);
FrequencyInArray.Node temp;
for(i=1;i<n;i++){
temp=root;
while(temp!=null){
if(a[i]==temp.info)
	{temp.count++; break;}
else if(a[i]<temp.info)
	if(temp.left==null) 
		{temp.left=f.new Node(a[i]); break;}
	else
		temp=temp.left;

else 
	if(temp.right==null) 
		{temp.right=f.new Node(a[i]);break;}
	else
		temp=temp.right;



}//while
} //for
data=new int[2][n];
printInorder(root,0);

sortData(0,data[0].length);
System.out.println(data[0].length);
for(i=0;i<data[0].length;i++)
	System.out.println(data[0][i]+ " "+data[1][i]);
}catch(Exception e){}

}
}

