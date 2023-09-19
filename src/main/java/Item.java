package main.java;

public class Item {
    private String product;
    private double price;
    private int amount;
    
    //Constructor 
    public Item(String product, double price, int amount){
        this.price = price;
        this.product = product;
        this.amount = amount;
    }

    //Getter methods for the attributes of the class Item 
    public String getProduto() {
        return product;
    }


    public double getPreco() {
        return price;
    }

    public int getQuantidade() {
        return amount;
    }

    //Setter methods for the attributes of the class Item
    @Override
    public String toString(){
        return "Item{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';  
    }


    
}
