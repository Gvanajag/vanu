
import java.util.Scanner;
class PatternDiamod{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
}
public static void printPattern(char c,int n){
for(int i=n/2;j=1;j==n;i--;j++2){printLine(c,i,j);

int x,y;
if (row%2==0)x=y=row/2;
else
{
x=row/2;
y=row/2+1;
}
printPattern(ch,x);
printReversePattern(ch,y);
}
public static void printReversePattern(char c,int n){
for(int i=n;i>=1;i--){printLine(c,i);}
}
public static void printPattern(char c,int n){
for(int i=1;i<=n;i++)
}
public static void printLine(char c,int col){
System.out.print("\n");
char c='#';
for(int i=0;i<=nch1;i++)System.out.print(ch);
for(int i=0;i<=nch2;i++)System.out.print(c);
for(int i=0;i<=nch1;i++)System.out.print(ch);

}
}
