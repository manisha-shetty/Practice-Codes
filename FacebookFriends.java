/* Given some friends on Facebook say A, B, C, D. and their friendship as AB and B C
We need to find out the minimum Hops from a query say:- for A to C the hops should be 2 A to B and B to C , (Floyd Warshall Algorithm)*/

import java.io.*;
class FaceBookFriends{

public static void main(String args[]){
try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int i,j;
int g[][]=new int[n][n];
int newg[][]=new int[n][n];
String[] ch=new String[n];

for(i=0;i<n;i++){

	ch=br.readLine().split(" ");
	for(j=0;j<n;j++){
		g[i][j]=(ch[j]=="/0")?Integer.MAX_VALUE:Integer.parseInt(ch[j]);
		newg[i][j]=g[i][j];
	}
}
//query
ch=br.readLine().split(" ");
int a=Integer.parseInt(ch[0]);
int b=Integer.parseInt(ch[1]);
int k=0;
for(k=0;k<n;k++)
for(i=0;i<n;i++){
	for(j=0;j<n;j++){
		if(newg[i][j]>newg[i][k]+newg[k][j] || newg[i][j]==0)
			newg[i][j]=newg[i][k]+newg[k][j];
	}
}

System.out.println(newg[a][b]);
}catch(Exception e){}
}
}
