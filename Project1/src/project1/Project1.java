package project1;
import java.util.Scanner;

class ATM{
    float balance=146000;
    int pin=2702;
    
    public void checkpin(){
        
        System.out.println("Enter Your 4 Digit Pin: ");
        Scanner sc=new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==pin){
            menu();
        }
        else{
            System.out.println("Enter A Valid Pin");
            checkpin();
        }
    }
    
    public void menu(){
        System.out.println("Select Any One Option");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit");
        
        Scanner sc=new Scanner(System.in);
        int opt = sc.nextInt();
        
        switch (opt) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositeMoney();
                break;
            case 4:
                break;
            default:
                System.out.println("Enter A Valid Choice");
                break;
        }
    }
    
    public void checkBalance(){
        System.out.println("Balance: "+balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount To Withdraw");
        Scanner sc=new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>balance){
            System.out.println("Balance Insufficient");
        }
        else{
            balance = balance-amount;
            System.out.println("Money Withdrawn Successfully");
        }
        menu();
    }
    
    public void depositeMoney(){
        System.out.println("Enter The Amount: ");
        Scanner sc=new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance+amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
    
}
public class Project1
{
    public static void main(String[] args)
    {
        ATM obj = new ATM();
        obj.checkpin();
    }
    
}