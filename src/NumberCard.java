public class NumberCard extends Card {
    private int number;
    public NumberCard(String color, int hiearchy, int number) {
        super(color, hiearchy);
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
}
