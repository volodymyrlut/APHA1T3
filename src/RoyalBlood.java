import java.util.concurrent.ThreadLocalRandom;

public class RoyalBlood extends Character {

    public static int minValue;
    public static int maxValue;
    public static String characterType;

    public RoyalBlood(int minimum, int maximum, String t ){
        super(1, 1);
        minValue = minimum;
        maxValue = maximum;
        characterType = t;
        int pwr = randomizedValue();
        int health = randomizedValue();
        setHp(health);
        setPower(pwr);
        System.out.println(characterType + String.format(" is entering the battlefield. Power: %d | HP: %d", pwr, health));
    }

    private static int randomizedValue(){
        int randomNum = ThreadLocalRandom.current().nextInt(minValue, maxValue + 1);
        return randomNum;
    }

    public void kick(Character c){
        int h = c.getHp();
        int attackValue = randomizedValue();
        int resultingHp = h - attackValue;
        if (resultingHp > 0){
            System.out.println(characterType + String.format(" attacks and removes %d hp. Opponent hp is %d", attackValue, resultingHp));
        } else {
            System.out.println(characterType + " kills opponent.");
        }
        c.setHp(resultingHp);
    }

}