package Charaters;
import Weapon.Shield;
public class Thief extends Fighter {
    public Thief(String name){
        super(name);
    }
    @Override
    public void initializeStats(){
        maxHP = 80 + 10*lvl;
        baseSpeed = 15 + 3*lvl;
        maxMana = 50 + 2*lvl;
        currentHP = maxHP;
        currentMana = maxMana;
        currentSpeed = baseSpeed;
        currentatk = 0;
        updateStats();
    }
    @Override
    public void setEquipShield(Shield newShield){
        equipShield = null;
        System.out.println("This character can't equip shield");
    }
}
