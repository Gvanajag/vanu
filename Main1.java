import java.util.*;
class Main{
public static void main(String args[]){
int[] numbers={2,-9,0,5,12,-25,22,9,8,12};
int sum=0;
Double avarege;
for(int number:numbers){
sum+=number;
}
int arrayLength=numbers.length;
avreage=((double)sum/(double)arrayLength);
System.out.println("Sum="+sum);
System.out.println("Avrage=")+avrage);
}
}
}
