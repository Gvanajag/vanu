class Student{
int rollno;
String name;
float fee;
Student(int rollno ,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){System.out.println(rollno+""+name+""+fee);}
}
class TestThis2{
public static void main(String args[]){
Student s1=new Student(222,"vanu",10000);
Student s2=new Student(227,"ranu",20000);
Student s3=new Student(227,"nanu",30000);
Student s4=new Student(227,"panu",40000);
s1.display();
s2.display();
s3.display();
s4.display();

}
}