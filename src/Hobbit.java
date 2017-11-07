public class Hobbit extends Character {

    public Hobbit(){
        super(0, 3);
        System.out.println("Hobbit is entering the battlefield. Power: 0 | HP: 3");
    }

    public void kick(Character c) {
        toCry();
    }
    private static void toCry(){
        System.out.println("Hobbit sit's in the corner and cry because he is a good boy and he cannot beat anyone even if he will die");
        setHp(0); // Will kill him just to finish the game.
    }
}
