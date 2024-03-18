import java.util.ArrayList;

public class Game {

    public static void play(GameWheel game) {
        int total = 0;
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            String color;
            int amount;
            Slice roll = game.spinWheel();

            color = roll.getColor();
            amount = roll.getPrizeAmount();
            total += amount;

            list.add(color);
            System.out.println("Spin " + i + ": " + roll.toString());
        }
    }
}