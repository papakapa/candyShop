package candy.waffle;

import candy.Candy;

import java.util.Objects;

public class Waffle extends Candy {

    private int amountOfSugar;

    public Waffle(int price, int length, int amountOfSugar) {
        super(price, length);
        this.amountOfSugar = amountOfSugar;
    }

    public int getAmountOfSugar() {
        return amountOfSugar;
    }

    public void setAmountOfSugar(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Waffle that = (Waffle) o;
        return amountOfSugar == that.amountOfSugar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountOfSugar);
    }

    @Override
    public String toString() {
        return "Waffle{" +
                "amountOfSugar=" + amountOfSugar +
                '}';
    }
}
