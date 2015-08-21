/*Given a matrix of size m*n of all 1s and 0s find a sub square matrix of all 1s*/

class MinSubSquareMatrix{


public static void main(String args[]){
int a[][]={{0,1,1,1,1},
	   {1,0,1,1,1},
	   {0,1,1,1,1},
	   {1,1,1,1,1}};

int b[][]=new int[a.length+1][a[0].length+1];
int starti=-1,startj=-1,max=Integer.MIN_VALUE;
for(int i=0;i<b.length;i++){
for(int j=0;j<b[0].length;j++){
if(i==0 || j==0){
b[i][j]=0;
}

else{
if(a[i-1][j-1]==0)
	b[i][j]=0;
else{
	b[i][j]=a[i-1][j-1]+ Math.min(b[i-1][j],Math.min(b[i-1][j-1],b[i][j-1]));
	if(max<b[i][j]){
		max=b[i][j];
		starti=i-b[i][j];
		startj=j-b[i][j];
	}

	
}

}
System.out.print(b[i][j]+" ");
}//for j
System.out.println();
}//for i
//answer matrix print
for(int i=0;i<max;i++){
for(int j=0;j<max;j++){
	System.out.print(" "+a[i+starti][j+startj]);
}
System.out.println();
}

}}
