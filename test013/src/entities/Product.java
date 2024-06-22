/*
*  Na classe Product fornecida, o atributo quantity é designado como privado e não possui um método setter.
*  Isso é feito com o objetivo de proteger a integridade dos dados e garantir que
*  a quantidade de produtos em estoque só seja alterada de maneira controlada,
*  por meio dos métodos addProducts() e removeProducts().
*/
package entities;

public class Product {
    String name;
    private double price;
    private int quantity;

    // construtor padrão
    public Product(){
    }
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", " + quantity
                + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }

}
