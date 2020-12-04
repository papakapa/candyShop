package person.saler;
import except.CandyNotFound;
import candy.Candy;
import person.Person;

import java.util.List;
import java.util.Objects;

public class Saler extends Person implements ISaler {
    private int salary;

    public Saler(String street, int homeNumber, int room, int age, String name,int salary) {
        super(street, homeNumber, room, age, name);
        this.salary = salary;
    }

    @Override
    public void sellCandies(List<Candy> candies) throws CandyNotFound {
        if(candies==null)
        {
            throw new CandyNotFound("There're no candies");
        }
    }

    @Override
    public void startWorkDay() {

    }

    @Override
    public void finishWorkDay() {

    }

    @Override
    public void findCandies(Candy candy) {

    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Saler{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Saler saler = (Saler) o;
        return salary == saler.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

