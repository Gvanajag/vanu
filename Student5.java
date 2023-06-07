class Student5{
int id;
String name;
int age;
Student5(int i,String n){
id=i;
name=n;
}
Student5(int i,String n,int a){
id=i;
name=n;
age=a;
}
void display(){System.out.print(id+""+name+""+age);}
public static void main(String args[]){
Student5 s1=new Student5(222,"vanu");
Student5 s2=new Student5(227,"ranu");
s1.display();
s2.display();

}
}