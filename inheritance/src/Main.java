public class Main {
    /*

	Customer ve Employee Adında 2 class oluşturduk
    Bu 2 class nerdeyse bire bir aynı sadece 1 argüman farklılık var
    Biz Person sınıfında ortak noktalarını bir araya getirip
    Customer ve Employee sınıflarının sonuna;
    public class Customer extends Person - extends Person ekledik
    public class Customer extends Person - extends Person ekledik

    */

    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

    }
}
