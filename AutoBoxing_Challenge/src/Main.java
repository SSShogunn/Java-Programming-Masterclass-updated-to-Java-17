import java.sql.SQLOutput;
import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){
    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(),
                new ArrayList<Double>( 500));
        transactions.add(initialDeposit);
    }
}

public class Main {
    public static void main(String[] args) {
        Customer aman = new Customer("Aman S",10000);
        System.out.println(aman);

        Bank bank = new Bank("AStar");
        bank.addNewCustomer("Aman Singh", 100.0);
        System.out.println(bank);

        bank.addTransaction("Aman Singh", -10.92);
        bank.addTransaction("Aman Singh", -15.00);
        bank.printStatement("Aman Singh");
    }
}

class Bank {
    private final String name;

    private final ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName){
        for(var customer : customers){
            if(customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't Found %n", customerName);

        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit){
        if(getCustomer(customerName) == null){
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer Added: "+ customer);
        }
    }

    public void addTransaction(String name, double transactionAmount){
        Customer customer = getCustomer(name);
        if(getCustomer(name) == null){
            assert customer != null;
            customer.transactions().add(transactionAmount);
        }
    }
    public void printStatement ( String customerName){
        Customer customer = getCustomer(customerName);
        if(customer == null){
            return;
        }
        System.out.println("-".repeat(40));
        System.out.println("Customer Name : "+ customer.name());
        System.out.println("Transaction : ");
        for (double d : customer.transactions()){
            System.out.printf("$%10.2f (%s)%n",d, d < 0 ? "debit" : "credit");
        }
    }
}