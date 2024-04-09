public class NumberCard extends Card {
    private int number;
    public NumberCard(String color, String symbol, int hiearchy, int number) {
        super(color, symbol, hiearchy);
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
}
