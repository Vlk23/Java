import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add (new Customer(1,"Volkan","Günel"));
        customers.add (new Customer(2,"Tuba","Günel"));
        customers.add (new Customer(3,"Volkan","Günel"));


        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
