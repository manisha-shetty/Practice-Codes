/*In one of Amazon fulfilment centres, there are a no. of empty boxes kept in increasing order in a row. Kiva robots are designed to put a product in a box. The product size is given. Design a program to find the best fit box for given product size. First line contains no. of empty boxes and next line contains size of boxes with space. The next line contains size of given product. The output shows the best fit box size and -1 otherwise. */
import java.io.*;
public class BestFitBox{
 public static void main(String args[]) throws IOException{
try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int bestIndex=-1;
	int boxes[]=new int[n];

String str[]=br.readLine().split(" ");
for (int i=0;i<n;i++){
boxes[i]=Integer.parseInt(str[i]);

}

int size=Integer.parseInt(br.readLine());

for (int i=0;i<n;i++){
boolean cond2=bestIndex==-1?true:(boxes[i]<=boxes[bestIndex]);
if(size<=boxes[i] && cond2){
bestIndex=i;

}}

System.out.println(bestIndex==-1?bestIndex:boxes[bestIndex]);

}catch(Exception e){}
}

}
