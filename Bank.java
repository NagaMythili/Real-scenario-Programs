import java.util.*;
abstract class BankOperations{
abstract void Credit();
abstract void Debit();
abstract void bankbalance();
}
class Bank extends BankOperations
{
Scanner sc=new Scanner(System.in);
int bbalance=0;
public void Credit(){
System.out.println("Enter amount :");
int Credit=sc.nextInt();
bbalance=bbalance+Credit;
System.out.println("Credited amount is   "+Credit);
System.out.println("Your Bbalance now is  "+bbalance);
}
public void Debit(){
System.out.println("Enter amount:");
int Debit=sc.nextInt();
if(Debit>bbalance)
{
System.out.println("Sorry to say !! you are not having sufficient funds,Please check your Balance");
}
else{
bbalance=bbalance-Debit;
System.out.println("Debited amount is:  "+Debit);
System.out.println("Your Bbalance now is:  "+bbalance);
}
}
public void bankbalance(){
System.out.println("Your BankBalance amount:   "+bbalance);
}
public void Operations()
{
System.out.println("Choose Operations to act \n 1.Credit\n 2.Debit \n 3.bankbalence \n 4.Exit");
System.out.println("enter a number t operform operations 1 / 2 / 3 / 4");
int ch=sc.nextInt();
switch(ch)
{
case 1:
        Credit();
        Operations();
        break;
case 2 :
        Debit();
        Operations();
        break;
case 3 :
       bankbalance();
       Operations();
        break;
case 4:
          System.out.println("Successfully Completed");
          break;
default:
    System.out.println("Choose valid Operation");
}
}
public static void main(String...m){
Bank bb=new Bank();
String Name="Myths";
String IFSC="SBIN00014123";
int accountno=12345;
int balance=0;
Scanner sc=new Scanner(System.in);
System.out.println("Hello!! Welcome---Do you have a bankAccount  1. Yes  2. No");
int Bankaccount=sc.nextInt();
switch(Bankaccount)
{
case 1:
System.out.println("Enter your valid Account Number:");
int accountnum=sc.nextInt();
if(accountnum ==accountno)
{
System.out.println("Welcome   "+Name);
System.out.println("Your IFSC number is:   "+IFSC);
System.out.println("Your Account no. :   "+accountno);
System.out.println("Your BankBalance Amount you have right now is:   "+balance);
bb.Operations();
}
break;
case 2:
System.out.println("Enter your Details correctly");
System.out.println("Enter your Full Name: ");
String NewName=sc.next();
System.out.println( "Enter your valid IFSC barcode");
String IFSC1=sc.next();
System.out.println("Enter your valid Account number: ");
String newAccount=sc.next();
System.out.println("Successfully your Account was Created with 0 balnace,now you can choose operations to act..");
bb.Operations();
break; 
}
}
}

