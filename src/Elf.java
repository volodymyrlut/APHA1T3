public class Elf extends Character {

    public Elf(){
        super(10, 10);
        System.out.println("Elf is entering the battlefield. Power: 10 | HP: 10");
    }


    public void kick(Character c){
        int opponentPower = c.getPower();
        System.out.printf("Elf attacks. ");
        if (power > opponentPower){
            c.setHp(0);
            System.out.println("Elf kills opponent");
        } else {
            int finalPower = opponentPower - 1;
            c.setPower(finalPower);
            System.out.printf("Elf attack result in power loss. Opponent's power is %d \n", finalPower);
        }
    }

}
