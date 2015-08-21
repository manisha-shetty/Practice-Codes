class FinalTest{

public static void main(String args[]){

Parent p=new Parent();

p.show();
Child c=new Child();
c.showDerived();
}
}



class Parent{

final int a=10;

final void show(){
System.out.println("i m a final method with a="+ a);
}
}

/* if Parent was final then this class throws compile error*/
class Child extends Parent{

/* will throw compile error
void show(){
System.out.println("i m a derived method with a="+a);

}*/

void showDerived(){
/*  will throw compile error 
a=50;*/

System.out.println("i m a derived method with a="+a);

}
}


