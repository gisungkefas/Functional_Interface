import org.example.Customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        System.out.println("//Using Imperative Approach");
        Customer customer1 = new Customer("Love", +2348131243083l);
        greetings(customer1);

        System.out.println("\n //Using Consumers Function");
        greetingCustomer.accept(customer1);

        System.out.println("\n //Using BiConsumers Function");
        greetCustomers.accept(customer1, false);

    }

    static void greetings(Customer customer){
        System.out.println("Hello " + customer.getName() + ", thank you for applying this position "
                + customer.getPhoneNumber());
    }

    static Consumer<Customer> greetingCustomer = customer -> System.out.println("Hello " + customer.getName()
            + ", thank you for applying this position " + customer.getPhoneNumber());

    static BiConsumer<Customer, Boolean> greetCustomers = (customer, showPhoneNumber) -> System.out.println("Hello " + customer.getName()
            + ", thank you for applying this position " + (showPhoneNumber ? customer.getPhoneNumber() : "++++++++++"));
}