/*Reverse a stack using recursion*/
class Stack{
int top;
int size;
int val[];

Stack(int s){
size=s;
val=new int[size];
top=-1;
}
void push(int a){
//System.out.println("push"+top);
if(top+1!=size)
val[++top]=a;
else
return;
}

int pop(){
//System.out.println("pop"+top);
if(top==-1)
return -1;
else
return val[top--];
}

int peek(){
//System.out.println("peek"+top);
if(top==-1)
return 0;
else
return val[top];
}

boolean isEmpty(){
return top==-1; 
}

}


class StackUsingRecursion{

static Stack s;
static void insertAtBottom(int data){
if (s.isEmpty()) s.push(data);
else{
int temp=s.pop();
insertAtBottom(data);
s.push(temp);
}


}
static void remove(){
if(s.isEmpty()) return;
int temp = s.pop();
//System.out.println(temp);
remove();
insertAtBottom(temp);
}

public static void main(String args[]){
s=new Stack(5);
s.push(2);
s.push(3);
s.push(5);
while(!s.isEmpty()){
System.out.println(s.pop());
}
s.push(2);
s.push(3);
s.push(5);
remove();


while(!s.isEmpty()){
System.out.println(s.pop());
}

}
}
