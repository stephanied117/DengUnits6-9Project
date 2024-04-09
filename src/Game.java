import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    private Player you;
    private Bot bob;
    private Deck create;
    public Game() {
    }
    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println(Colors.white + Colors.redHigh + "              " + Colors.white + Colors.bluHigh + "              " + Colors.def);
        System.out.println(Colors.white + Colors.redHigh + "       " + Colors.white + Colors.whiHigh + "              " + Colors.white + Colors.bluHigh + "       " + Colors.def);
        System.out.println(Colors.white + Colors.redHigh + "       " + Colors.white + Colors.whiHigh + " " + Colors.white + Colors.blaHigh + "| o  vv  o |" + Colors.white + Colors.whiHigh + " " + Colors.bluHigh + "       " + Colors.def);
        System.out.println(Colors.white + Colors.redHigh + "       " + Colors.white + Colors.whiHigh + " " + Colors.white + Colors.blaHigh + "|----------|" + Colors.white + Colors.whiHigh + " " + Colors.bluHigh + "       " + Colors.def);
        System.out.println(Colors.white + Colors.yelHigh + "       " + Colors.white + Colors.whiHigh + " " + Colors.white + Colors.blaHigh + "| " + Colors.red + Colors.whiHigh + " OOHNOO " + Colors.white + Colors.blaHigh + " |" + Colors.white + Colors.whiHigh + " " + Colors.green + Colors.greHigh + "       " + Colors.def);
        System.out.println(Colors.white + Colors.yelHigh + "       " + Colors.white + Colors.whiHigh + " " + Colors.white + Colors.blaHigh + "|----------|" + Colors.white + Colors.whiHigh + " " + Colors.green + Colors.greHigh + "       " + Colors.def);
        System.out.println(Colors.white + Colors.yelHigh + "       " + Colors.white + Colors.whiHigh + " " + Colors.white + Colors.blaHigh + "|          |" + Colors.white + Colors.whiHigh + " " + Colors.green + Colors.greHigh + "       " + Colors.def);
        System.out.println(Colors.white + Colors.yelHigh + "       " + Colors.white + Colors.whiHigh + "              " + Colors.green + Colors.greHigh + "       " + Colors.def);
        System.out.println();
        System.out.println("    {" + Colors.red + Colors.whiHigh + "Enter (e) to play!" + Colors.def + "}");
        String enter = scan.nextLine();
        if (enter.equals("e")) {
            System.out.println();
            menu();
        }
    }
    public void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println(Colors.red + Colors.whiHigh + " " + Colors.red + Colors.blaHigh + " " + Colors.red + Colors.whiHigh + "      {MAIN MENU}      " + Colors.red + Colors.blaHigh + " " + Colors.red + Colors.whiHigh + " " + Colors.def);
        System.out.println(Colors.red + Colors.whiHigh + " " + Colors.red + Colors.blaHigh + " " + Colors.red + Colors.whiHigh + " P) Play               " + Colors.red + Colors.blaHigh + " " + Colors.red + Colors.whiHigh + " " + Colors.def);
        System.out.println(Colors.red + Colors.whiHigh + " " + Colors.red + Colors.blaHigh + " " + Colors.red + Colors.whiHigh + " R) Game Rules         " + Colors.red + Colors.blaHigh + " " + Colors.red + Colors.whiHigh + " " + Colors.def);
        System.out.println(Colors.red + Colors.whiHigh + " " + Colors.red + Colors.blaHigh + " " + Colors.red + Colors.whiHigh + " D) Deck Info          " + Colors.red + Colors.blaHigh + " " + Colors.red + Colors.whiHigh + " " + Colors.def);
        System.out.println(Colors.red + Colors.whiHigh + " " + Colors.red + Colors.blaHigh + " " + Colors.red + Colors.whiHigh + " Q) Quit               " + Colors.red + Colors.blaHigh + " " + Colors.red + Colors.whiHigh + " " + Colors.def);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        String enter = scan.nextLine();
        if (enter.equals("p") || enter.equals("P")) {
            round();
        } else if (enter.equals("r") || enter.equals("R")) {
            rules();
        } else if (enter.equals("d") || enter.equals("D")) {
            deckInfo();
        } else if (enter.equals("q") || enter.equals("Q")) {
            farewell();
        } else {
            menu();
        }
    }
    public void round() {
        Scanner scan = new Scanner(System.in);
        create = new Deck();
        create.shuffle();
        System.out.println(create.dealer());
        if (create.dealer().equals("The bot will be the dealer!")) {
            you = new Player(false);
            bob = new Bot(true);
        } else {
            you = new Player(true);
            bob = new Bot(false);
        }
        System.out.println("Enter a space to begin");
        String enter = scan.nextLine();
        if (enter.equals(" ")) {
            create.passOut();
            System.out.println(Colors.graHigh + "                    " + Colors.def);
            System.out.println(Colors.graHigh + "                    " + Colors.def);
            System.out.println(Colors.graHigh + "                    " + Colors.def);
            System.out.println(Colors.graHigh + "         " + create.startingCard() + Colors.graHigh + "     " + Colors.def + " " + Colors.graHigh + "    " + Colors.def);
            System.out.println(Colors.graHigh + "                    " + Colors.def);
            System.out.println(Colors.graHigh + "                    " + Colors.def);
            System.out.println(Colors.graHigh + "                    " + Colors.def);
            System.out.println();
            System.out.println();
            System.out.println();
            turns();
        }
    }
    public void rules() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How to Play OOHNOO:");
        System.out.println("The goal is to be the FIRST to get rid of all of their cards. You will be going against a bot.");
        System.out.println();
        System.out.println("1. Each player must randomly draw a card from the deck.The dealer must pass out 7 cards per player.");
        System.out.println("2. The player who draws the highest number becomes the dealer.");
        System.out.println("3. 7 cards must be passed to each player.");
        System.out.println("4. The top card of the remaining deck should be flipped over and used as the starting card.");
        System.out.println("5. The other player starts first unless the starting card is an action or wild card.");
        System.out.println(" - A skip or reverse will allow the dealer to start.");
        System.out.println(" - A draw two will require that the other player draw two cards. It also allows the dealer to start.");
        System.out.println(" - A wild will allow the other player to choose a color and start first.");
        System.out.println(" - A draw four will be put back into the deck and another starting card should be drawn.");
        System.out.println("6. When drawing a card from the remaining deck, the player can only choose to use the card immediately or keep it.");
        System.out.println("7. Wild cards can be used even if the player has cards that match the top card on the disposed pile.");
        System.out.println("8. Draw four cards can only be used if the player has no other matching cards.");
        System.out.println("9. Players who use wild cards must choose a color.");
        System.out.println("9. Players cannot exchange cards with each other.");
        System.out.println("10. Reverse cards have the same function as skip cards.");
        System.out.println();
        System.out.println("Enter (x) to go back to menu");
        String enter = scan.nextLine();
        if (enter.equals("x") || enter.equals("X")) {
            System.out.println();
            System.out.println();
            System.out.println();
            menu();
        }
    }
    public void deckInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("The OOHNOO deck contains...");
        System.out.println(" - 25 cards per color");
        System.out.println(" - 2 cards per number type and action type card (0 only has one card)");
        System.out.println(" - 4 cards per wild type card");
        System.out.println(" - 108 total cards");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Enter (x) to go back to menu");
        String enter = scan.nextLine();
        if (enter.equals("x") || enter.equals("X")) {
            System.out.println();
            System.out.println();
            System.out.println();
            menu();
        }
    }
    public void farewell() {
        System.out.println("buh byee~");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public void turns() {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (create.getBotDeck().size() != 0 || create.getPlayerDeck().size() != 0) {
            if (count % 2 == 0) {
                if (bob.getDealer() == true) {
                    int temp = 0;
                    for (int i = 0; i < create.getBotDeck().size(); i++) {
                        if (create.getBotDeck().get(i).getColor() == create.getPlacedPile().get(create.getPlacedPile().size() - 1).getColor() && create.getBotDeck().get(i).getSymbol() == create.getPlacedPile().get(create.getPlacedPile().size() - 1).getSymbol()) {
                            temp = i;
                        }
                    }
                } else {
                    int t = -1;
                    for (int i = 0; i < create.getPlayerDeck().size(); i++) {
                        System.out.print(create.getPlayerDeck().get(i).getForm() + " ");
                    }
                    System.out.println();
                    System.out.println("Enter the symbol of the card you want to place");
                    String s = scan.nextLine();
                    System.out.println("Enter the color of the card you want to place");
                    String c = scan.nextLine();
                    for (int i = 0; i < create.getPlayerDeck().size(); i++) {
                        if (create.getPlayerDeck().get(i).getColor().equals(c) && create.getPlayerDeck().get(i).getSymbol().equals(s)) {
                            if (create.getPlayerDeck().get(i).getColor() == create.getPlacedPile().get(create.getPlacedPile().size() - 1).getColor() && create.getPlayerDeck().get(i).getSymbol() == create.getPlacedPile().get(create.getPlacedPile().size() - 1).getSymbol()) {
                                create.pileCard(create.getPlayerDeck().get(i));
                                if (create.getPlayerDeck().get(i).getSymbol().equals("R") || create.getPlayerDeck().get(i).getSymbol().equals("S")) {
                                    count++;
                                }
                                if (create.getPlayerDeck().get(i).getSymbol().equals("2+")) {
                                    for (int j = 1; j < 3; j++) {
                                        create.getBotDeck().add(create.getDeck().get(create.getDeck().size() - j));
                                    }
                                    if (create.getPlayerDeck().get(i).getSymbol().equals("4+")) {
                                        for (int j = 1; j < 5; j++) {
                                            create.getBotDeck().add(create.getDeck().get(create.getDeck().size() - j));
                                        }
                                    }
                                    if (create.getPlayerDeck().get(i).getSymbol().equals("W")) {
                                        for (int j = 1; j < 5; j++) {
                                            create.getBotDeck().add(create.getDeck().get(create.getDeck().size() - j));
                                            System.out.println("Enter the symbol of the card you want to place");
                                            s = scan.nextLine();
                                            if (create.getPlayerDeck().get(j).getColor().equals(j) && create.getPlayerDeck().get(j).getSymbol().equals(j)) {
                                                if (create.getPlayerDeck().get(j).getColor() == create.getPlacedPile().get(create.getPlacedPile().size() - 1).getColor() && create.getPlayerDeck().get(j).getSymbol() == create.getPlacedPile().get(create.getPlacedPile().size() - 1).getSymbol()) {
                                                    create.pileCard(create.getPlayerDeck().get(j));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (count % 2 == 1) {
                                if (bob.getDealer() == false) {
                                    int temp = 0;
                                    for (int a = 0; a < create.getPlayerDeck().size(); a++) {
                                        if (create.getPlayerDeck().get(i).getColor() == create.getPlacedPile().get(create.getPlacedPile().size() - 1).getColor() && create.getPlayerDeck().get(i).getSymbol() == create.getPlacedPile().get(create.getPlacedPile().size() - 1).getSymbol()) {
                                            temp = a;
                                        }
                                    }
                                } else {
                                    for (int b = 0; b < create.getPlayerDeck().size(); b++) {
                                        System.out.print(create.getPlayerDeck().get(i).getForm() + " ");
                                    }
                                    System.out.println();
                                    System.out.println("Enter the symbol of the card you want to place");
                                    String d = scan.nextLine();
                                    System.out.println("Enter the color of the card you want to place");
                                    String e = scan.nextLine();
                                    int ind = -1;
                                    for (int f = 0; f < create.getPlayerDeck().size(); f++) {
                                        if (create.getPlayerDeck().get(f).getColor().equals(e) && create.getPlayerDeck().get(f).getSymbol().equals(d)) {
                                            if (create.getPlayerDeck().get(f).getColor() == create.getPlacedPile().get(create.getPlacedPile().size() - 1).getColor() && create.getPlayerDeck().get(f).getSymbol() == create.getPlacedPile().get(create.getPlacedPile().size() - 1).getSymbol()) {
                                                ind = f;
                                                create.pileCard(create.getPlayerDeck().get(f));
                                                if (create.getPlayerDeck().get(f).getSymbol().equals("R") || create.getPlayerDeck().get(f).getSymbol().equals("S")) {
                                                    count++;
                                                }
                                                if (create.getPlayerDeck().get(f).getSymbol().equals("2+")) {
                                                    for (int j = 1; j < 3; j++) {
                                                        create.getBotDeck().add(create.getDeck().get(create.getDeck().size() - j));
                                                    }
                                                    if (create.getPlayerDeck().get(f).getSymbol().equals("4+")) {
                                                        for (int j = 1; j < 5; j++) {
                                                            create.getBotDeck().add(create.getDeck().get(create.getDeck().size() - j));
                                                        }
                                                    }
                                                    if (create.getPlayerDeck().get(f).getSymbol().equals("W")) {
                                                        for (int j = 1; j < 5; j++) {
                                                            create.getBotDeck().add(create.getDeck().get(create.getDeck().size() - j));
                                                            System.out.println("Enter the symbol of the card you want to place");
                                                            d = scan.nextLine();
                                                            if (create.getPlayerDeck().get(f).getColor().equals(e) && create.getPlayerDeck().get(f).getSymbol().equals(d)) {
                                                                if (create.getPlayerDeck().get(f).getColor() == create.getPlacedPile().get(create.getPlacedPile().size() - 1).getColor() && create.getPlayerDeck().get(f).getSymbol() == create.getPlacedPile().get(create.getPlacedPile().size() - 1).getSymbol()) {
                                                                    ind = f;
                                                                    create.pileCard(create.getPlayerDeck().get(f));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    create.getPlayerDeck().remove(ind);
                                }
                                System.out.println(Colors.graHigh + "                    " + Colors.def);
                                System.out.println(Colors.graHigh + "                    " + Colors.def);
                                System.out.println(Colors.graHigh + "                    " + Colors.def);
                                System.out.println(Colors.graHigh + "         " + create.getPileCard() + Colors.graHigh + "     " + Colors.def + " " + Colors.graHigh + "    " + Colors.def);
                                System.out.println(Colors.graHigh + "                    " + Colors.def);
                                System.out.println(Colors.graHigh + "                    " + Colors.def);
                                System.out.println(Colors.graHigh + "                    " + Colors.def);
                                System.out.println();
                                System.out.println();
                                System.out.println();
                                count++;
                            }
                            if (create.getPlayerDeck().size() == 0) {
                                victory();
                            } else if (create.getBotDeck().size() == 0) {
                                defeat();
                            }
                        }
                    }
                }
            }
        }
    }
    public void victory () {
        System.out.println(Colors.white + Colors.whiHigh + "4___________________________" + Colors.def);
        System.out.println(Colors.white + Colors.whiHigh + "_______" + Colors.white + Colors.whiHigh + "|            |" + Colors.white + Colors.whiHigh + "_______" + Colors.def);
        System.out.println(Colors.white + Colors.whiHigh + "3______" + Colors.white + Colors.whiHigh + "|" + Colors.white + Colors.blaHigh + "| q  ()  q |" + Colors.white + Colors.whiHigh + "|" + Colors.whiHigh + "_______" + Colors.def);
        System.out.println(Colors.white + Colors.whiHigh + "_______" + Colors.white + Colors.whiHigh + "|" + Colors.white + Colors.blaHigh + "|----------|" + Colors.white + Colors.whiHigh + "|" + Colors.whiHigh + "_______" + Colors.def);
        System.out.println(Colors.white + Colors.whiHigh + "2______" + Colors.white + Colors.oraHigh + " " + Colors.yellow + Colors.blaHigh + "|>" + Colors.red + Colors.whiHigh + " OOHNOO " + Colors.white + Colors.blaHigh + "<|" + Colors.white + Colors.oraHigh + " " + Colors.white + Colors.whiHigh + "_______" + Colors.def);
        System.out.println(Colors.white + Colors.whiHigh + "_______" + Colors.white + Colors.oraHigh + " " + Colors.yellow + Colors.oraHigh + "|----------|" + Colors.white + Colors.oraHigh + " " + Colors.white + Colors.whiHigh + "_______" + Colors.def);
        System.out.println(Colors.white + Colors.whiHigh + "1______" + Colors.white + Colors.oraHigh + " " + Colors.white + Colors.oraHigh + "|__________|" + Colors.white + Colors.oraHigh + " " + Colors.white + Colors.whiHigh + "_______" + Colors.def);
        System.out.println(Colors.white + Colors.whiHigh + "_______" + Colors.white + Colors.oraHigh + "              " + Colors.white + Colors.whiHigh + "_______" + Colors.def);
    }
    public void defeat () {
        System.out.println("You lost.");
    }
}
