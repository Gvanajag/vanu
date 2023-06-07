import java.util.*;
class Pattern1{
public static void printPattern(char c,int n){
for(int j=0;j<=col;j++)System.out.print(i);

for(int i=0;i<=n;i++){
System.out.println();
for(int j=0;j<=col;j++)System.out.print(i);
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printPattern(ch,row);
}}