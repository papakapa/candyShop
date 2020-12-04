package person;

import java.util.Objects;

public abstract class Person {
    private Address address;
    private int age;
    private String name;

    public Person(String street, int homeNuber, int room, int age, String name) {
        this.address = new Address(street,homeNuber,room);
        this.age = age;
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                address.equals(person.address) &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, age, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address.toString() +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Address{
    private String street;
    private int homeNumber;
    private int room;

    public Address(String street, int homeNumber, int room) {
        this.street = street;
        this.homeNumber = homeNumber;
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return homeNumber == address.homeNumber &&
                room == address.room &&
                Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, homeNumber, room);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", homeNumber=" + homeNumber +
                ", room=" + room +
                '}';
    }
}
