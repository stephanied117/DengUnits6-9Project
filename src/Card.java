public class Card {
    private String color;
    private String symbol;
    private int hiearchy;
    public Card(String color, String symbol, int hiearchy) {
        this.color = color;
        this.symbol = symbol;
        this.hiearchy = hiearchy;
    }
    public String getColor() {
        return color;
    }
    public String getSymbol() {
        return symbol;
    }
    public int getHiearchy() {
        return hiearchy;
    }
    public String getForm() {
        if (color.equals("red")) {
            return Colors.black + Colors.redHigh + symbol + Colors.def;
        } else if (color.equals("yellow")) {
            return Colors.black + Colors.bluHigh + symbol + Colors.def;
        } else if (color.equals("green")) {
            return Colors.black + Colors.greHigh + symbol + Colors.def;
        } else if (color.equals("blue")) {
            return Colors.black + Colors.bluHigh + symbol + Colors.def;
        } else {
            return Colors.white + Colors.blaHigh + symbol + Colors.def;
        }
    }
}
