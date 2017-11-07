public class Character {

    public static int power;
    public static int hp;
    public static boolean isAlive() {
        return (hp > 0);
    }

    public Character(int p, int h){
        power = p;
        hp = h;
    }

    public void kick(Character c){

    }

    public static void setPower(int p) {
        power = p;
    }
    public static void setHp(int h) {
        if (hp == 0){
            System.out.println("Character dies");
        }
        hp = h;
    }
    public static int getPower() {
        return power;
    }
    public static int getHp() {
        return hp;
    }

}
