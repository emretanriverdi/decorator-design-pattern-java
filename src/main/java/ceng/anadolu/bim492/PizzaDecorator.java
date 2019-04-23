package ceng.anadolu.bim492;

abstract class PizzaDecorator implements Pizza {

    @Override
    public String getSummary() {
        return "Ingredients";
    }
}