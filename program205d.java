import java.util.*;
public class Program205d
{
public static void main(String[]args)
{char ch;
System.out.print("Enter the number:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.print();
if(ch>='0'&&ch<='9')
System.out.print("ch+"is a digit");
else
System.out.print("ch+"is not a digit");
}}