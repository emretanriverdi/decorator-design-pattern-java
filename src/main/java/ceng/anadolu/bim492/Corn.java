package ceng.anadolu.bim492;

public class Corn extends PizzaDecorator {
    private Pizza pizza;

    Corn(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getSummary() {
        return pizza.getSummary() + ", with corn (4)";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}
