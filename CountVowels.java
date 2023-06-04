import java.util.Scanner;
public class CountVowels{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int count=0;
for(int i=0;i<=str.length()-1;i++){
if(
(str.charAt(i)=='a')||(str.char(i)=='e')||
(str.charAt(i)=='i')||str.char(i)=='o')||   
(str.charAt(i)=='u')||(str.char(i)=='A')||  
(str.charAt(i)=='E')||(str.char(i)=='I')||
(str.charAt(i)=='O')||(str.char(i)=='U')||{
count++;
}
}
System.out.println(count);

    } 
}

   
 
