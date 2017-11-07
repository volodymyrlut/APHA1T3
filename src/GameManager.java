public class GameManager {

    public static void fight(Character character1, Character character2){
        character1.kick(character1);
        character2.kick(character2);
        checkWhetherThereIsAnybodyAlive(character1, character2);
    }

    private static void checkWhetherThereIsAnybodyAlive(Character character1, Character character2) {
        if(character1.isAlive() && character2.isAlive()){
            fight(character1, character2);
        } else {
            System.out.println("Game finished. Exiting.");
            System.exit(0);
        }
    }

}

