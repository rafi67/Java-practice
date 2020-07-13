package Aggregation;

class Address{
    String city;
    String district;
    String country;
    Address(String district, String city, String country){
        this.city = city;
        this.district = district;
        this.country = country;
    }
}

public class Employee4 {
    int id;
    String name;
    Address address;
    Employee4(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("Employee name is "+name);
        System.out.println("Employee id is "+id);
        System.out.println("Employee Address is "+address.district+", "+address.city+", "+address
                .country);
    }

    public static void main(String [] args){
        Address ad1 = new Address("Dhanmondi", "Dhaka", "Bangladesh");
        Address ad2 = new Address("Mohammadpur", "Dhaka", "Bangladesh");

        Employee4 e1 = new Employee4(1, "Arif", ad1);
        Employee4 e2 = new Employee4(2, "Shafil", ad2);

        e1.display();
        e2.display();
    }
}
