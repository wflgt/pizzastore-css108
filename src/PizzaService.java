import java.util.*;
import java.io.*;

public class PizzaService implements PizzaInterface{
    private String PizzaNotFoundMessage;
    private PizzaStore pizzaStore;

    public PizzaService(PizzaStore pizzaStore){
        this.pizzaStore = pizzaStore;
    }

    public Pizza AddNewPizza(Pizza pizza){

    }
    public void deletePizza(Pizza pizza){

    }
    public Pizza updatePrice(Pizza pizza, double newPrice){

    }
    public List<Pizza> getAllPizzas(){

    }
    public Pizza orderNewPizza(Pizza pizza, Customer customer){

    }
    public Pizza getPizzaByName(String pizzaName){

    }
    public Pizza getPizzaById(int pizzaId){

    }
    public Pizza getOizzaBySize(String size){

    }
}

public interface PizzaInterface{
    public Pizza getPizzzaBySize(String size){

    }

    public Pizza getPizzaById(int pizzaId){

    }

    public Pizza getPizzaByName(String pizzaName){

    }

    public Pizza orderNewPizza(Pizza pizza, Customer customer){

    }

    public List<Pizza> getAllPizzas(){

    }

    public Pizza ipdatePrice(Pizza pizza, double newPrice){

    }

    public void deletePizza(Pizza pizza){

    }

    public Pizza addNewPizza(Pizza pizza){

    }
}
