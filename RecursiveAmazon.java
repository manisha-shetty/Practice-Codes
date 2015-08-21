class RecursiveAmazon{

static int funcRiverCrossing(int n){

if(n==0) return 0;
if(n==1) return 1;

return funcRiverCrossing(n-1)+funcRiverCrossing(n-2);
}

static int funcLogarithm(int i,int j){

if(i==1)
return 0;

return 1+funcLogarithm(i/j,j);

}

public static void main(String args[]){

//System.out.println(funcLogarithm(29,3) +" "+ Math.log(29.0)/Math.log(3));
int count=0;
int n=30000;
for(int j=n;j>0;j--)
for(int k=1;k<=j;k=k+k)
count++;

//System.out.println(count+" "+Math.pow(2,n)+" "+n*n+" "+ n*Math.log(n)/Math.log(2));

System.out.println(funcRiverCrossing(7));
}



}
