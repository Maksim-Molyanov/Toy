import java.util.List;

public class PrizeSelection {
    public Toy select(List<Toy> toys) {
        double rateC = 0.0;
        for (Toy toy : toys)
            rateC += toy.getFrequency();
        double i = Math.random() * rateC;
        double countR = 0.0;
        for (Toy toy : toys) {
            countR += toy.getFrequency();
            if (countR >= i)
                return toy;
        }
        throw new RuntimeException();
    }
}