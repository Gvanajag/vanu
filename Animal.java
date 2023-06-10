class Animal{
void eat(){System.out.println("eating..........");}
}
class  Animal{
String color="white";
}
class Dog extends Animal1{
String color="black";
void pritColor(){
System.out.println(color);
System.out.println(super.color);
}
}
class TestSuper1{
public static void main(String args[]){
Dog d=new Dog();
d.printColor();
}}
