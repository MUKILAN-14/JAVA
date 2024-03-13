interface Transaction{
    void deposit(int a);
    void withdraw(int a);
}
class SavingsAccount implements Transaction{
    int balance=10000;
    int amount;
    
    public void deposit(int amt){
        System.out.println("Savings Account Details");
        amount=amt;
        if (amount>100000){
            System.out.println("Crossed the per day limit");
            System.out.println("");
        }
        else{
        balance=balance+amount;
        System.out.println("Amount Credited :"+amount);
        System.out.println("Account balance :"+balance);
        System.out.println("");
        }
    }
    public void withdraw(int amt){
        System.out.println("Savings Account Details");
        amount=amt;
        if (amount>balance){
            System.out.println("insufficient balance");
            System.out.println("Account Blance :"+balance);
            System.out.println("");
        }
        else if(amount>40000){
            System.out.println("Crossed the Per day limit");
            System.out.println("");
        }
        else{
        balance=balance-amount;
        System.out.println("Amount Debited :"+amount);
        System.out.println("Account balance :"+balance);
        System.out.println("");
        }
    }
}

class CurrentAccount implements Transaction{
    int balance=1000;
    int amount;
    
    public void deposit(int amt){
        System.out.println("Current Account Details");
        amount=amt;
        if (amount>100000){
            System.out.println("Crossed the per day limit");
            System.out.println("");
        }
        else{
        balance=balance+amount;
        System.out.println("Amount Credited :"+amount);
        System.out.println("Account balance :"+balance);
        System.out.println("");
        }
    }
    public void withdraw(int amt){
        amount=amt;
        System.out.println("Current Account Details");
        if (amount>balance){
            System.out.println("insufficient balance");
            System.out.println("Account Blance :"+balance);
            System.out.println("");
        }
        else if(amount>40000){
            System.out.println("Crossed the Per day limit");
            System.out.println("");
        }
        else{
        balance=balance-amount;
        System.out.println("Amount Debited :"+amount);
        System.out.println("Account balance :"+balance);
        System.out.println("");
        }
    }

    public static void main(String[] args) {
        Transaction mem=new CurrentAccount();
        mem.deposit(2000);
        mem.withdraw(100);

        mem=new SavingsAccount();
        mem.deposit(4000);
        mem.withdraw(6000);
   }
}