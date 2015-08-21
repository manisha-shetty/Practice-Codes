/*dynamic prog set 6
Given a cost matrix cost[][] and a position (m, n) in cost[][], write a function that returns cost of minimum cost path to reach (m, n) from (0, 0). Each cell of the matrix represents a cost to traverse through that cell. Total cost of a path to reach (m, n) is sum of all the costs on that path (including both source and destination). You can only traverse down, right and diagonally lower cells from a given cell, i.e., from a given cell (i, j), cells (i+1, j), (i, j+1) and (i+1, j+1) can be traversed. You may assume that all costs are positive integers.

*/

class MinCostPathInMatrix{


static int minimum(int a, int b, int c){
int min=a<b?a:b;
min=min<c?min:c;
return min;
}
public static void main(String args[]){

int cost[][]={{1,2,3},{4,8,2},{1,5,3}};

int minCost[][]=new int[3][3];
int x=2,y=2;


for(int i=0;i<=x;i++){
for(int j=0;j<=y;j++){
if(i==0&&j==0)
	minCost[i][j]=cost[i][j];
else if(i==0)
	minCost[i][j]=cost[i][j]+minCost[i][j-1];
else if(j==0)
	minCost[i][j]=cost[i][j]+minCost[i-1][j];
else
	minCost[i][j]= cost[i][j]+minimum(minCost[i][j-1],minCost[i-1][j],minCost[i-1][j-1]);
}}

System.out.println(minCost[0][0]+" "+ minCost[0][1]+" "+minCost[0][2]);
System.out.println(minCost[1][0]+" "+ minCost[1][1]+" "+minCost[1][2]);
System.out.println(minCost[2][0]+" "+ minCost[2][1]+" "+minCost[2][2]);

}

}
