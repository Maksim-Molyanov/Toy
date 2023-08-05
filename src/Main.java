
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Мяч", 10.5);
        Toy toy2 = new Toy(1, "Кукла", 33.2);
        Toy toy3 = new Toy(2, "Робот", 19.8);
        Toy toy4 = new Toy(3, "Юла", 76.1);
        Toy toy5 = new Toy(4, "Машинка", 51.5);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        PrizeDrawer toyShop = new PrizeDrawer(toys);
        toyShop.toyRaffle();
        toyShop.toyRaffle();
        toyShop.toyRaffle();
        toyShop.toyRaffle();
        toyShop.toyRaffle();
    }
}