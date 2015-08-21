/*given an array of pos and neg integers you have to arrange them alternatively. 0 is considered positive*/

class AlternatePositiveNegativeArray{

public static void main(String args[]){
int a[]={9,5,-2,0,-4,-7,9,-3};
int pos[]=new int[a.length];
int neg[]=new int[a.length];
int p=0,n=0;

for(int i=0;i<a.length;i++){
if(a[i]>=0) pos[p++]=a[i]+1;
else neg[n++]=a[i];
}


p=0;n=0;
if(a[0]>=0)
for(int i=0;i<a.length;){
if(p<pos.length && pos[p]!=0) a[i++]=pos[p++]-1;
if(n<neg.length) a[i++]=neg[n++];
}

else
for(int i=0;i<a.length;){
if(n<neg.length) a[i++]=neg[n++];
if(p<pos.length && pos[p]!=0)a[i++]=pos[p++]-1;
}

for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
}

}
