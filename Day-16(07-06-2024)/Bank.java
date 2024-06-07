class BankAccount{
    private double balance;
    
        public double getbalance(){
            return balance;
        }
        public double getdeposit(){
            return balance;   
        }
        public double getWithdrow(){
            return balance;
        }
        public void setBalance(double newbalance){
            this.balance=newbalance;
        }
        public void setDeposit(double amount){
         
                balance=balance+amount;
                System.out.println("new balance :"+balance);   
        }
        public void setWithdrow(double amount){
           
                balance=balance-amount;
                System.out.println("Withdrawal of new balance:"+balance);
        }
    }
    public class Bank{
        public static void main(String[] args) {
            BankAccount myobj =new BankAccount();
            myobj.setBalance(100000);
            myobj.setDeposit(50000);
            myobj.setWithdrow(2000);
        }
    
    }