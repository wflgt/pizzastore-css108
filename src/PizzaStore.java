import java.util.*;
import java.io.*;


public class PizzaStore{
    private List<Customer> customers;
    private List<Pizza> pizzas;
    private String storeLocation;
    private String storeName;
    private int storeId;

    public PizzaStore(int storedId, String storeName, String storeLocation){
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeLocation = storeLocation;
    }

    public PizzaStore(){
        this.customers = new ArrayList<>();
        this.pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void deletePizza(Pizza pizza){
        pizzas.remove(pizza);
    }

    public int getSroteId(){
        return storeId;
    }

    public void setStoreId(int storeId){
        this.storeId = storeId;
    }

    public String getStoreName(){
        return storeName;
    }

    public void setStoreName(String storeName){
        this.storeName = storeName;
    }

    public String getStoreLocation(){
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation){
        this.storeLocation = storeLocation;
    }

    public List<Pizza> getPizzas(){
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas){
        this.pizzas = pizzas;
    }

    public List<Customer> getCustomers(){
        return customers;
    }

    public void setCustomers(List<Customer> cuctomers){
        this.customers = customers;
    }

    @Override
    public String toString(){
        return "Store Id: " + storeId + '\'' +
                ", Store name: " + storeName + '\'' +
                ", Store location: " + storeLocation;
    }
}
