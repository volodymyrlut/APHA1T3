import java.util.concurrent.ThreadLocalRandom;

public class CharacterFactory {

    public static Character createCharacter() {
        int type = ThreadLocalRandom.current().nextInt(0, 3 + 1);
        if (type == 0) {
            return new Hobbit();
        } else if (type == 1) {
            return new Elf();
        } else if (type == 2) {
            return new King();
        } else if (type == 3) {
            return new Knight();
        }
        return new Hobbit();
        // Hobbit is useless anyway;
    }
}