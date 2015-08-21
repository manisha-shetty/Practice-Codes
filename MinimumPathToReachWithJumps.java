/*Given an array of integers where each element represents the max number of steps that can be made forward from that element. Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then cannot move through that element.

Example:

Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
Output: 3 (1-> 3 -> 8 ->9)

First element is 1, so can only go to 3. Second element is 3, so can make at most 3 steps eg to 5 or 8 or 9.
*/

class MinimumPathToReachWithJumps{
static boolean flag=false;

static int diff(int a, int b){
if(a<0 && b<0 || a>0 && b>0)
return Math.abs(a-b);
else
return Math.abs(a)+Math.abs(b);
}


static String jump(int cur,int dest, int jumpLen, int pathLen,String path){
if(diff(cur,dest)==jumpLen){

	pathLen+=jumpLen;
	path= path+" "+dest;
	flag=true;
return path;
}
else {
	if(dest>0){

	path=jump(cur+jumpLen,dest,jumpLen+1,pathLen+jumpLen,path+" " + (cur+jumpLen) + " ");
	if(flag)
		return path;

	} else{
	path=jump(cur-jumpLen,dest,jumpLen+1,pathLen+jumpLen,path+" " + (cur-jumpLen) + " ");

	if(flag)
		return path;
	
	}
}


return path;
} 

public static void main(String args[]){

int dest=-10;
int cur=0,pathLen=0,jumpLen=1;
String path="0";
System.out.println(jump(cur,dest,jumpLen,pathLen,path));
}
}
