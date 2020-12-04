package person.customer;

import candy.Candy;
import person.Person;

import java.util.List;
import java.util.Objects;

public class Customer extends Person implements ICustomer {
    private int money;

    public Customer(String street, int homeNumber, int room, int age, String name,int money) {
        super(street,homeNumber,room, age, name);

    }

    public void buyCandy(List<Candy>candies) {

    }

    @Override
    public void visitShop() {

    }

    @Override
    public void leaveShop() {

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return money == customer.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), money);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "money=" + money +
                '}';
    }
}