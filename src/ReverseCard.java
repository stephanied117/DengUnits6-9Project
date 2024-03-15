public class ReverseCard extends Card {
    private boolean reverse;
    public ReverseCard(String color, int hiearchy, boolean reverse) {
        super(color, hiearchy);
        this.reverse = reverse;
    }
    public boolean getReverse() {
        return reverse;
    }
}
