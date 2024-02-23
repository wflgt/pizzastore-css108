import java.io.*;
import java.util.*;
import java.lang.String;

public class Pizza{
    private PizzaBase pizzaBase;
    private Topping topping;
    private String size;
    private double price;
    private String pizzaName;
    private int pizzaId;

    public Pizza(int pizzaId, String pizzaName, double price, String size, Topping topping, PizzaBase pizzaBase){
        this.pizzaId = pizzaId;
        this.pizzaName = pizzaName;
        this.price = price;
        this.size = size;
        this.topping = topping;
        this.pizzaBase = pizzaBase;
    }

    public int getPizzaId(){
        return pizzaId;
    }

    public void setPizzaId(int pizzaId){
        this.pizzaId = pizzaId;
    }

    public String getPizzaName(){
        return pizzaName;
    }

    public void setPizzaName(String pizzaName){
        this.pizzaName = pizzaName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }

    public Topping getTopping(){
        return topping;
    }

    public void setTopping(Topping topping){
        this.topping = topping;
    }

    public PizzaBase getPizzaBase(){
        return pizzaBase;
    }

    public void setPizzaBase(PizzaBase pizzaBase){
        this.pizzaBase = pizzaBase;
    }

    @Override
    public String toString(){
        return "ID: " + pizzaId + '\'' +
                ", Name: " + pizzaName + '\'' +
                ", Price: " + price + '\''
                + ", size: " + size;
    }
}

class Topping extends Pizza{

    private static final PizzaBase;
    private static final int pizzaId;
    private String description;
    private String spiceLevel;
    private String toppingName;

    public Topping(String toppingName, String spiceLevel, String description){
        super(pizzaId,pizzaName, price, size, topping, pizzaBase);
        this.toppingName = toppingName;
        this.spiceLevel = spiceLevel;
        this.description = description;
    }

    public String getToppingName(){
        return toppingName;
    }

    public void setToppingName(String toppingName){
        this.toppingName = toppingName;
    }

    public String getSpiceLevel(){
        return spiceLevel;
    }

    public void setSpiceLevel(String spiceLevel){
        this.spiceLevel = spiceLevel;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(){
        this.description = description;
    }

    @Override
    public String toString(){
        return "Topping name: " + toppingName + '\'' +
                ", Spice level: " + spiceLevel + '\'' +
                ", Description: " + description;
    }
}

class PizzaBase extends Pizza{
    private String description;
    private String baseType;
    private String baseName;

    public PizzaBase(String baseName, String baseType, String description){
        super();
        this.baseName = baseName;
        this.baseType = baseType;
        this.description = description;
    }

    public String getBaseName(){
        return baseName;
    }

    public void setBaseName(String baseName){
        this.baseName = baseName;
    }

    public String getBaseType(){
        return baseType;
    }

    public void setBaseType(String baseType){
        this.baseType = baseType;
    }

    public String detDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return "Name: " + baseName + '\'' +
                ", Type: " + baseType + '\'' +
                ", Description: " + description;
    }
}
