package person.customer;

import candy.Candy;

import java.util.List;

public interface ICustomer {
    void buyCandy(List<Candy>candies);
    void visitShop();
    void leaveShop();
}
