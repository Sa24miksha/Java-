package JML1.ShallowCopyDeepCopy;

class Address {
    String city;
    public Address(String city) {
        this.city = city;
    }

    // Shallow copy constructor for Address class
    public Address(Address other) {
        this.city = other.city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy method
    public Object shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep copy method
    public Person deepCopy() {
        return new Person(this.name, new Address(this.address.city));
    }
}

public class Main {
    public static void main(String[] args) {
        Person original = new Person("John", new Address("New York"));

        // Creating a shallow copy
        Person shallowCopy = null;
        try {
            shallowCopy = (Person) original.shallowCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Creating a deep copy
        Person deepCopy = original.deepCopy();

        // Modify the address in the original object
        original.address.city = "Los Angeles";

        // Output
        System.out.println("Original Name: " + original.name + ", Address: " + original.address.city);
        System.out.println("Shallow Copy Name: " + shallowCopy.name + ", Address: " + shallowCopy.address.city);
        System.out.println("Deep Copy Name: " + deepCopy.name + ", Address: " + deepCopy.address.city);
    }
}
