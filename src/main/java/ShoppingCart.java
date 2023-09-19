package main.java;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {

    //Atributes
    private List<Item> itemList;

    //Constructor
    public ShoppingCart(){
        this.itemList = new ArrayList();
    }

    //Method to add a product to the shopping cart
    public void addProduct(String product, double price, int amount){
        Item item = new Item(product, price, amount);
        this.itemList.add(item);
    }

    //Method to remove a product from the shopping cart
    public void removeProduct(String product){
        for(Item item : this.itemList){
            if(item.getProduct().equals(product)){
                this.itemList.remove(item);
                break;
            }else{
                System.out.println("Product not found");
            }
        }
    }

    //Method to calculate the total price of the shopping cart
    public double calculateTotalValue(){
        double totalValue = 0;
        for(Item item : this.itemList){
            totalValue += item.getPrice() * item.getAmount();
        }
        return totalValue;
    }

    //Method to show items in the shopping cart
    public void showItems(){
        for(Item item : this.itemList){
            System.out.println(item.toString());
        }
    }

    
    @Override
    public String toString(){
        return "ShoppingCart{" +
                "itemList=" + itemList +
                '}';
    }

    //Main method
    public static void main(String args[]){
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("milk", 3.42, 1);
        cart.addProduct("coffee", 5.99, 1);
        cart.addProduct("butter", 2.99, 2);
        cart.addProduct("cheese", 4.99, 1);
        cart.addProduct("bread", 1.99, 3);

        cart.showItems();
        System.out.println("Total value: " + cart.calculateTotalValue());

        cart.removeProduct("coffee");
        cart.removeProduct("cheese");

        cart.showItems();
        System.out.println("Total value: " + cart.calculateTotalValue());
    }






}