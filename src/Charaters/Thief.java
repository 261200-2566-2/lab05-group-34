package Charaters;
import Weapon.Sword;
import Weapon.Shield;
public class Thief extends Fighter {
    public Thief(String name, Sword sword, Shield shield){
        super(name , sword, shield);
    }
    @Override
    public void initializeStats(){
        maxHP = 80 + 10*lvl;
        baseSpeed = 15 + 3*lvl;
    }
    @Override
    public void setEquipShield(Shield newShield){
        equipShield = null;
        System.out.println("This character can't equip shield");
    }
}
