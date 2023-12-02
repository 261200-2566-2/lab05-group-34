import Accessories.Ring.AtkRing;
import Accessories.Ring.Ring;
import Accessories.Shoe.ATKShoe;
import Accessories.Shoe.Shoes;
import Accessories.Shoe.SpeedShoe;
import Charaters.Fighter;
import Charaters.Tank;
import Charaters.Thief;
import Weapon.Shield;
import Weapon.Sword;

public class Main {
    public static void main(String[] args) {
        // Create a sword and a shield
        Sword LongSword = new Sword(100);
        Shield HeavyShield = new Shield(50);
        Ring HolyRing = new AtkRing(20);
//        ATKShoe is increase SwordDMG;
        Shoes AShoe = new ATKShoe(10 , 10);
//        SpeedShoe
        Shoes SShoe = new SpeedShoe(10);
        // Create an RPG character with initial level and equipment
        Fighter Knack = new Fighter("Knack");
        Knack.setEquipShield(HeavyShield);
        Knack.setEquipSword(LongSword);
        // Display initial character stats
        displayCharacterStats(Knack);
        System.out.println("\nTank without Equipment stats:");
        Tank Tiger300 = new Tank("Tiger300");
        displayCharacterStats(Tiger300);
        System.out.println("\nThief without Equipment stats:");
        Thief lupang = new Thief("lupang");
        displayCharacterStats(lupang);
        lupang.setEquipShield(HeavyShield);
        displayCharacterStats(lupang);

        System.out.println("\nEquipped ring and  atk shoes:");
        Knack.setEquipShoes(AShoe);
        Knack.setEquipRing(HolyRing);
        displayCharacterStats(Knack);
        // Simulate a level up
        Knack.lvlUP();
        System.out.println("\nLevel up!");
        displayCharacterStats(Knack);

        // Simulate equipping a new sword ,shield and Speed shoes
        Sword newSword = new Sword(500);
        Shield newShield = new Shield(1000);

        Knack.setEquipSword(newSword);
        Knack.setEquipShield(newShield);
        Knack.setEquipShoes(SShoe);

        System.out.println("\nEquipped  new sword ,shield and Speed shoes");
        displayCharacterStats(Knack);

        // Simulate taking damage
        int damageTaken = 2000;
        Knack.takeDMG(damageTaken);

        System.out.println("\nAfter taking damage:");
        displayCharacterStats(Knack);
    }

    private static void displayCharacterStats(Fighter character) {
        System.out.println("\nCharacter Stats:");
        System.out.println("Max HP: " + character.getMaxHP());
        System.out.println("Max Mana: " + character.getMaxMana());
        System.out.println("Current HP: " + character.getCurrentHP());
        System.out.println("Current Mana: " + character.getCurrentMana());
        System.out.println("Current Run Speed: " + character.getCurrentSpeed());
        System.out.println("--------------------------------------------------");
        System.out.println("Equipment Stats:");
        System.out.println("SwordDMG: " + character.getCurrentatk());
        if (character.equipShield != null){
            System.out.println("ShieldDEF: " + character.equipShield.shieldDEF);
        }else {
            System.out.println("Not wearing a shield");
        }
        System.out.println("--------------------------------------------------");
        if(character.getCurrentHP() == 0){
            System.out.println("You're dead ");
        }
    }
}