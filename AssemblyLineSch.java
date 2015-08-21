/*Dynamic prog geeksforgeeks set 34
A car factory has two assembly lines, each with n stations. A station is denoted by Si,j where i is either 1 or 2 and indicates the assembly line the station is on, and j indicates the number of the station. The time taken per station is denoted by ai,j. Each station is dedicated to some sort of work like engine fitting, body fitting, painting and so on. So, a car chassis must pass through each of the n stations in order before exiting the factory. The parallel stations of the two assembly lines perform the same task. After it passes through station Si,j, it will continue to station Si,j+1 unless it decides to transfer to the other line. Continuing on the same line incurs no extra cost, but transferring from line i at station j – 1 to station j on the other line takes time ti,j. Each assembly line takes an entry time ei and exit time xi which may be different for the two lines. Give an algorithm for computing the minimum time it will take to build a car chassis.*/

class AssemblyLineSch{

static int min(int a,int b){
return (a<b)?a:b;
}

public static void main(String args[]){	
int n=4;		//no of stations
int time[][]=   {{4, 5, 3, 2},
                {2, 10, 1, 4}};
int chg[][] = {{0, 7, 4, 5},
                {0, 9, 2, 8}};	
int e1=10;
int e2=12;
int x1=18;
int x2=7;

int minTime1[]=new int[n];
int minTime2[]=new int[n];
for(int i=0;i<n;i++){
if(i==0){
	minTime1[i]=e1+time[0][i];
	minTime2[i]=e2+time[1][i];
}
else{
minTime1[i]=min(minTime1[i-1]+time[0][i],minTime2[i-1]+time[0][i]+chg[1][i]); //chg[1] denotes changing from 2 to 1
minTime2[i]=min(minTime2[i-1]+time[1][i],minTime1[i-1]+time[1][i]+chg[0][i]); //chg[0] denotes changing from 1 to 2
}


}

System.out.println( min(minTime1[n-1]+x1,minTime2[n-1]+x2));
}
}
