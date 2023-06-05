import java.util.Scanner;
class polindrome
{
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
String  reverse;
String rs="";
System.out.print("Enter a string:");
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}
System.out.println(rs);
}
}
