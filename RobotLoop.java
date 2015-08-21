/*There is a robot that is initially at origin. A robot have three operations, he can either turn left or turn right, or he can move one unit ahead in the direction he is facing.
Given a string containing L (turn left), R (turn right), G (move one unit ahead).Find if the robot again reaches the point he has been before (find a loop).
Example: LGRGRGG
Initial co-ordinate is (0, 0), it turns left and moves one unit, updated coordinates (-1,0).
Then turns right and moves one unit, updated coordinates (-1, 1).Then turns right and moves two unit (two ‘G’s). Updated coordinates are (1, 1)*/

import java.io.*;
class RobotLoop{

public static void main(String args[]){
try{
int prevX=0;
int x=0;

int i=0;
int val=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String input=br.readLine();
char op[]=new char[input.length()];
op=input.toCharArray();
for(i=0;i<op.length;i++){
if(op[i]=='L')
val=-1; //val will be -1 
 else if(op[i]=='R')
val=1;
else if(op[i]=='G')
x+=val;
}

if(prevX==x)
System.out.println(x+" true");
else 
System.out.println(x+" false");
}catch(Exception e){}

}

}
