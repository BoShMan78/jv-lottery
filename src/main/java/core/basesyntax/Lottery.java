package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);
        ColorSupplier color1 = new ColorSupplier();
        return Ball.toString(value, color1.getRandomColor());
    }
}
