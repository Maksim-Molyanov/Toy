import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PrizeDrawer {
    private List<Toy> toys;

    public PrizeDrawer(List<Toy> toys) {
        this.toys = toys;
    }

    public Toy getToy() {
        PrizeSelection random = new PrizeSelection();
        Toy toy = random.select(toys);
        return toy;
    }

    public void toyRaffle() {
        Toy toy = getToy();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("Toys.txt", true))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}