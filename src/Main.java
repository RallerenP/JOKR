import java.util.ArrayList;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Main m = new Main();

        m.displayRandom(m.getJokes());
    }

    private ArrayList<String> getJokes()
    {
        ArrayList<String> jokes = new ArrayList<>();
        jokes.add("How does a scientist freshen their breath? With experi-mints");
        jokes.add("What did the 0 say to the 8? Nice belt.");
        jokes.add("Knock knock.\nWho's there? \nHatch. \nHatch who? \nBless you!");
        jokes.add("Why did the melons plan a big wedding? Because they cantaloupe!");

        return jokes;
    }

    private void displayRandom(ArrayList<String> strings)
    {
        int index = new Random().nextInt(strings.size());
        System.out.println(strings.get(index));
    }
}
