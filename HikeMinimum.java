/*There are n employees in a company, each having some ratings. The employees are given a hike in their salary based on their ratings, i.e employee with higher rating will get the higher raise. An employee can only know the hike and rating of two of his neighbors, one on the left and other on the right. Given an array of size n, specifying the ratings of n employees, find the minimum hike that should be raised for each employee, such that no employee feels unfair.
Example: 1 3 5 4 (ratings for 4 employees)
Output: 1+2+3+2 = 8
Example: 5 3 4 2 1 6
Output: 2+1+3+2+1+2 = 11.
The hikes are positive integers only. The ratings are greater than zero.
Size of input array: 1-1000000*/

import java.io.*;

public class HikeMinimum{

    public static void main(String args[])

{
try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());


int a[] = new int[n];
String str[]=br.readLine().split(" ");
for (int i=0;i<n;i++){
   
    a[i]=Integer.parseInt(str[i]);
}

int hike[]=new int[n];

 hike[0]=1;
 for (int i=1;i<n;i++){

if(a[i]==a[i-1])
    hike[i]=hike[i-1];
else if(a[i]>a[i-1])
    hike[i]=hike[i-1]+1;
else if (a[i]<a[i-1]){
    if(hike[i-1]-1 !=0)
        hike[i]=hike[i-1]-1;
    else {
        hike[i]=hike[i-1];
        for(int j=i-1;a[j]>a[j+1] && hike[j]<=hike[j+1];)
            {hike[j]++; if (--j<0) break;}
    }
           
}
}
int total=0;

for (int i=0;i<n;i++){
   total+=hike[i];
    System.out.print(hike[i]+"+");
}
    System.out.println("="+total);
}catch(Exception e){}
}
}
