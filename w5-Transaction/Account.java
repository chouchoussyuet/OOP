import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    /**
     * Nap tien vao. 
     * 
     * @param amount : so tien giao dich.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            this.balance += amount;
            transitionList.add(new Transaction(Transaction.DEPOSIT, amount, this.balance));
        }
    }

    /**
     * Withdraw. 
     * 
     * @param amount : so tien giao dich. 
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            this.balance = this.balance - amount;
            transitionList.add(new Transaction(Transaction.WITHDRAW, amount, this.balance));
        }
    }
    
    /**
     * Them giao dich vao danh sach giao dich. 
     * 
     * @param amount : so tien.
     * @param operation : loai giao dich. 
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Print.
     */
    public void printTransaction() {
        int n = 1;
        for (Transaction first : transitionList) {
            double a = first.getAmount();
            double b = first.getBalance(); 
            if (first.getOperation().equals(Transaction.DEPOSIT)) {
                System.out.printf("Giao dich %d: Nap tien $%.2f. So du luc nay: $%.2f.\n", n, a, b);
            } else {
                System.out.printf("Giao dich %d: Rut tien $%.2f. So du luc nay: $%.2f.\n", n, a, b);
            }
            n++;
        }
    }

    /**
     * Constructor.
     */
    Account() {
        this.balance = 0;
        this.transitionList = new ArrayList<Transaction>();
    }
}
