package ceng.anadolu.bim492;

public class StandardPizza implements Pizza {
    @Override
    public String getSummary() {
        return "Standard Pizza (25)";
    }

    @Override
    public int getPrice() {
        return 25;
    }
}
