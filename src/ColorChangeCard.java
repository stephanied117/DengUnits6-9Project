public class ColorChangeCard extends Card {
    private boolean change;
    public ColorChangeCard(String color, String symbol, int hiearchy, boolean change) {
        super(color, symbol, hiearchy);
        this.change = change;
    }
    public boolean getChange() {
        return change;
    }
}
