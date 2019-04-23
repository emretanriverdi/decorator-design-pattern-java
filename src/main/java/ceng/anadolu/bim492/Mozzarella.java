package ceng.anadolu.bim492;

public class Mozzarella extends PizzaDecorator {
    private Pizza pizza;

    Mozzarella(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getSummary() {
        return pizza.getSummary() + ", with mozzarella (4)";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}