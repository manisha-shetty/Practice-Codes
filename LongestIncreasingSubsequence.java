class LongestIncreasingSubsequence{


public static void main(String args[]){
int n=10;
int arr[]={12,24,35,11,55,61,11,8,65,77};
int len[]=new int[n];
int i=0,j=0;
for(i=0;i<n;i++){
len[i]=1;
}

for(i=1;i<n;i++)
for(j=i-1;j>=0;j--)
if(len[i]<len[j]+1 && arr[j]<arr[i])
len[i]=len[j]+1;

int max=-Integer.MAX_VALUE;
for(i=0;i<n;i++)
if(max<len[i])
max=len[i];

System.out.println(max);


}

}
