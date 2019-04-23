package ceng.anadolu.bim492;

public class Sausage extends PizzaDecorator {
    private Pizza pizza;

    Sausage(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getSummary() {
        return pizza.getSummary() + ", with sausage (7)";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 7;
    }

}