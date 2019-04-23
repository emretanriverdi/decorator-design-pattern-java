package ceng.anadolu.bim492;

public class Olive extends PizzaDecorator {

    private Pizza pizza;

    Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getSummary() {
        return pizza.getSummary() + ", with olives (3)";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 3;
    }
}
