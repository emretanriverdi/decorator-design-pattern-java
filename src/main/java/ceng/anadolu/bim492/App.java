package ceng.anadolu.bim492;

public class App {

    public static void main(String[] args) {

        Pizza pizza = new StandardPizza();

        pizza = new Salami(pizza);

        System.out.println("Summary: " + pizza.getSummary());
        System.out.println("Price: " + pizza.getPrice() + " Liras");


        pizza = new StandardPizza();

        pizza = new Olive(pizza);
        pizza = new Salami(pizza);
        pizza = new Mushrooms(pizza);

        System.out.println("Desc: " + pizza.getSummary());
        System.out.println("Price: " + pizza.getPrice()+ " Liras");


        pizza = new SpecialPizza();

        pizza = new Corn(pizza);
        pizza = new Olive(pizza);
        pizza = new Mushrooms(pizza);

        System.out.println("Desc: " + pizza.getSummary());
        System.out.println("Price: " + pizza.getPrice()+ " Liras");


        pizza = new SpecialPizza();

        pizza = new Mozzarella(pizza);
        pizza = new Sausage(pizza);
        pizza = new Salami(pizza);
        pizza = new Mushrooms(pizza);

        System.out.println("Desc: " + pizza.getSummary());
        System.out.println("Price: " + pizza.getPrice()+ " Liras");
    }
}