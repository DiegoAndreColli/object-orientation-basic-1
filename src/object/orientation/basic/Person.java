package object.orientation.basic;

/**
 *
 * @author User
 */
class Person {

    String name;
    Double height;
    Double moneyInBank;

    public Person() {
        moneyInBank = 0.0;
    }

    String speak() {
        return "I am talking.";
    }
    void walk() {
        System.out.println("I am walking.");
    }
    void receivePayment(Double payment) {
        this.moneyInBank = this.moneyInBank + payment;
    }
    void payBill(Double billToPay) {
        if (moneyInBank >= billToPay) {
            moneyInBank = moneyInBank - billToPay;
        } else {
            System.out.println("Insufficient money to pay the bill.");
        }
    }
    public void shoMoneyInBank() {
        System.out.println("Money in bank: " + moneyInBank);
    }
}