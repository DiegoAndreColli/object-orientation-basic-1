package object.orientation.basic;

/**
 *
 * @author User
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Diego Colli";
        person.height = 1.80;
        person.walk();
        // Receives a payment
        person.receivePayment(10100.00);
        System.out.println(person.speak());
        // Creates a bill to pay
        Double billToPay = 10000.00;
        System.out.println("Balance before paying the bill:");
        person.shoMoneyInBank();
        // Tries to pay the bill
        person.payBill(billToPay);
        System.out.println("Balance after paying the bill:");
        person.shoMoneyInBank();
    }
}
