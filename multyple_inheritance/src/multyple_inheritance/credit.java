package multyple_inheritance;

import java.util.Scanner;

interface CreditCardInterface{
    void viewCreditAmount();
    void viewPin();
    void changePin();
    void useCard();
    void payBalance();
}

class Customer implements CreditCardInterface{
    int cardNum,pin,creditA,cpin,amt;
    String name;
    Customer(String name,int cardNum,int pin,int creditA){
        this.name = name;
        this.cardNum = cardNum;
        this.pin = pin ;
        this.creditA = creditA;
    }
    
    public void viewCreditAmount() {
        System.out.println("Credit Amount is Rs "+creditA);
    }

   
    public void changePin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new pin : ");
        cpin =sc.nextInt();
        pin = cpin;
        System.out.println("Pin change successfully");
    }

 
    public void payBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount : ");
        amt = sc.nextInt();
        if(amt < creditA){
            creditA = amt - creditA;
            System.out.println("Available balance is "+creditA);
        }else {
            System.out.println("Insufficient balance");
        }

    }
    
    public void useCard() {
        System.out.println("Card number is "+cardNum);
    }

  
    public void viewPin() {
        System.out.println("Pin is "+pin);
    }

}
class RegularCardHolder extends Customer implements CreditCardInterface{
    int maxCL;
    RegularCardHolder(String name,int cardNum,int pin,int creditA,int maxCL){
        super(name, cardNum, pin, creditA);
        this.maxCL = maxCL;
    }

}
class GoldCardHolder extends Customer implements CreditCardInterface{
    String speacialP;
    GoldCardHolder(String name,int cardNum,int pin,int creditA,String speacialP){
        super(name, cardNum, pin, creditA);
        this.speacialP = speacialP;
    }

}
public class credit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, specialP;
        int cardNum, pin, creditA, choice, type, n, ch = 0, maxCl;
        System.out.println("Enter number of Customers:");
        n = sc.nextInt();
        GoldCardHolder[] gcd = new GoldCardHolder[n];
        RegularCardHolder[] rcd = new RegularCardHolder[n];
        for (int i = 0; i < n; i++) {
            System.out.println("<-- New Customer -->");
            System.out.println("Enter name : ");
            name = sc.next();
            System.out.println("Enter card number : ");
            cardNum = sc.nextInt();
            System.out.println("Enter pin : ");
            pin = sc.nextInt();
            System.out.println("Enter Credit Amount : ");
            creditA = sc.nextInt();
                System.out.println("\n1.Golden Card Holder\n2.Regular Card Holder");
                type = sc.nextInt();
                if (type == 1) {
                    specialP = "Free 20% discount";
                    gcd[i] = new GoldCardHolder(name, cardNum, pin, creditA, specialP);
                    do {
                    System.out.println("\n1.View Credit Amount\n2.Change Pin\n3.Pay Balance\n4.View Pin\n5.Use Card\n6.Exit");
                    ch = sc.nextInt();
                        switch (ch) {
                            case 1 : {
                                gcd[i].viewCreditAmount();
                            }
                            case 2 :{
                                gcd[i].changePin();
                            }
                            case 3 : {
                                gcd[i].payBalance();
                            }
                            case 4 : {
                                gcd[i].viewPin();
                            }
                            case 5 : {
                                gcd[i].useCard();
                            }
                            case 6 : {
                                System.out.println("Bye");
                            }
                            default : {
                                System.out.println("Enter proper choice");
                            }
                        }
                    }while (ch == 6);
                } else if (type == 2) {
                    maxCl = 5000;
                    rcd[i] = new RegularCardHolder(name, cardNum, pin, creditA, maxCl);
                    do {
                        System.out.println("\n1.View Credit Amount\n2.Change Pin\n3.Pay Balance\n4.View Pin\n5.Use Card\n6.Exit");
                        ch = sc.nextInt();
                        switch (ch) {
                            case 1 : {
                                rcd[i].viewCreditAmount();
                            }
                            case 2 : {
                                rcd[i].changePin();
                            }
                            case 3 : {
                                rcd[i].payBalance();
                            }
                            case 4 : {
                                rcd[i].viewPin();
                            }
                            case 5 :{
                                rcd[i].useCard();
                            }
                            case 6 : {
                                System.out.println("Bye");
                            }
                            default : {
                                System.out.println("Enter proper choice");
                            }
                        }
                    }while (ch == 6);
                } else {
                    System.out.println("Enter proper choice");
                }
            }
        }
    }





