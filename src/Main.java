public class Main {

    public static void main(String[] args) {
        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();
        GameManager.fight(character1, character2);
    }

}
