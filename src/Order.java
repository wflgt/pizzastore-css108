import java.util.*;
import java.io.*;
import java.lang.String;

public class Order{
    private List<Pizza> pizzas;
    private String orderDescription;
    private double payableBillAmount;
    private String orderDate;
    private int orderId;

    public Order(){

    }

    public Order(int orderId, String orderDate, double payableBillAmount, String orderDescription){
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.payableBillAmount = payableBillAmount;
        this.orderDescription = orderDescription;
    }

    public Order(){
        this.pizzas = new ArrayList<>();
    }

    public void getOrder(Pizza pizza){
        pizzas.add(pizza);
    }

    public int getOrderId(){
        return orderId;
    }

    public void setOrderId(int orderId){
        this.orderId = orderId;
    }

    public String getOrderDate(){
        return orderDate;
    }

    public void setOrderDate(String orderDate){
        this.orderDate = orderDate;
    }

    public double getPayableBillAmount(){
        return payableBillAmount;
    }

    public void setPayableBillAmount(double payableBillAmount){
        this.payableBillAmount = payableBillAmount;
    }

    public String getOrderDescription(){
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription){
        this.orderDescription = orderDescription;
    }

    public List<Pizza> getPizzas(){
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas){
        this.pizzas = pizzas;
    }

    @Override
    public String toString(){
        return "Order Id: " + orderId + '\'' +
                ", Order date: " + orderDate + '\'' +
                ", Payable bill amount: " + payableBillAmount + '\'' +
                ", Order description: " + orderDescription;
    }

}
