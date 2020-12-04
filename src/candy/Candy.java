package candy;

import java.util.Objects;
public class Candy {
    private int price;
    private int length;

    public Candy(int price, int length) {
        this.price = price;
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return price == candy.price &&
                length == candy.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, length);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "price=" + price +
                ", length=" + length +
                '}';
    }
}
