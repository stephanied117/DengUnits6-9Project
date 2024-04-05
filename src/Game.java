import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    public Game() {
    }
    public void start() {
        Deck create = new Deck();
        for (int i = 0; i < (int)Math.random(); i++) {
            create.shuffle();
        }
        create.passOut();
        create.startingCard();
    }
}
