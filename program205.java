//Java program to input a string
import java.util.*;
public class Program205_readString
{
public static void main(String[]args)
{
System.out.print("Enter the number:");
Scanner sc=new Scanner(System.in);
String n=sc.next();
char ch=n.charAt(0);
System.out.println("Welcome"+n+ch);
}
}
