package ceng.anadolu.bim492;

public class SpecialPizza implements Pizza {
    @Override
    public String getSummary() {
        return "Thin Crust Pizza (30)";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
