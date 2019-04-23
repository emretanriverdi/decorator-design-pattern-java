package ceng.anadolu.bim492;

public class Salami extends PizzaDecorator {
    private Pizza pizza;

    Salami(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getSummary() {
        return pizza.getSummary() + ", with salami (5)";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }
}
