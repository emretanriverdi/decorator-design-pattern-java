package ceng.anadolu.bim492;

public class Mushrooms extends PizzaDecorator {

    private Pizza pizza;

    Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getSummary() {
        return pizza.getSummary() + ", with mushrooms (6)";
    }


    @Override
    public int getPrice() {
        return pizza.getPrice() + 6;
    }
}

