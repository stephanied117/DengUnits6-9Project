public class ReverseCard extends Card {
    private boolean reverse;
    public ReverseCard(String color, String symbol, int hiearchy, boolean reverse) {
        super(color, symbol, hiearchy);
        this.reverse = reverse;
    }
    public boolean getReverse() {
        return reverse;
    }
}
