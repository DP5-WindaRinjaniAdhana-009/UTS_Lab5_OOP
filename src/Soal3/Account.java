package Soal3;

public class Account {
    private String id, name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this(id, name, 0);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance!");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance!");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id = " + id +
                ", name = " + name +
                ", balance = " + balance +
                ']';
    }

    public static void main(String[] args) {
        // test constructor and toString()
        Account a1 = new Account("A101", "Ligma", 88);
        System.out.println(a1); // toString()

        Account a2 = new Account("A102", "Deezma"); // default balance
        System.out.println(a2);

        // test getter
        System.out.println("ID      : " + a1.getId());
        System.out.println("Name    : " + a1.getName());
        System.out.println("Balance : " + a1.getBalance());

        // test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500); // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100); // toString()
        System.out.println(a1);
        System.out.println(a2);
    }
}
