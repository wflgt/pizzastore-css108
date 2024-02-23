import java.util.*;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Order> orders = new ArrayList<Order>();
    private Address address;
    private long mobile;
    private String email;
    private String customerName;
    private int customerId;

    public Customer(int customerId, String customerName, String email, long mobile, Address address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public Customer() {
        ArrayList<Order> order = new ArrayList<Order>();
        this.orders = order;
    }

    public void addOrder(Order order) {
        System.out.println("Enter your door number, street, city, district, state: ");
        String customer = scanner.nextLine();
        String[] array = customer.split(",");
        System.out.println("Enter your details as name, email, mobile: ");
        String details = scanner.nextLine();
        orders.add(order);
    }

    public double getPayableAmount() {
        double totalAmount = 0.0;
        for (Order order : orders) {
            totalAmount += order.getPayableAmount();
        }
        System.out.println("Total Payment Amount: " + totalAmount);
        return totalAmount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void getEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }


    public String toString() {
        return "Customer Id: " + customerId + '\'' +
                ", Customer name: " + customerName + '\'' +
                ", Email: " + email + '\'' +
                ", Mobile: " + mobile + '\'' +
                ", Address: " + address + '\'' +
                ", Order: " + orders;
    }
}

class Address extends Customer {
    private String state;
    private String district;
    private String city;
    private String street;
    private int doorNumber;

    public Address(int doorNumber, String street, String city, String district, String state) {
        this.doorNumber = doorNumber;
        this.street = street;
        this.city = city;
        this.district = district;
        this.state = state;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Door number: " + doorNumber + '\'' +
                ", Street: " + street + '\'' +
                ", City: " + city + '\'' +
                ", District: " + district + '\'' +
                ", State: " + state;
    }
}



