class Account{
int accno;
String name;
float amount;
void insert(int a,String n,float amt){
accno=a;
name=n;
amount=amt;
}
void deposite(float amt){
amount=amount+amt;
System.out.println(amt+"deposited");
}
void withdraw(float amt){
if (amount<amt){
System.out.println("Insuffisent Balance");
}else{
amount=amount-amt;
System.out.println(amt+"withdrawn");
}
}
void checkBalance(){System.out.println("Balance is"+amount);}
void display(){System.out.println(accno+""+name+""+amount);}
}
class TestAccount{
public static void main(String[]args){
Account a1=new Account();
a1.insert(9876543,"mouni",2000);
a1.display();
a1.checkBalance();
a1.deposite(5000);
a1.checkBalance();
a1.withdraw(200000);
a1.checkBalance();
}}

 
