package Charaters;

import Accessories.Shoe.Shoes;
import Weapon.Sword;
import Weapon.Shield;

public class Fighter {
    String name;
    protected int lvl = 1;
    protected double maxHP = 100;
    protected double currentHP;
    protected double maxMana = 50;
    protected double currentMana;
    protected double baseSpeed = 20;
    protected double currentSpeed;
    public Sword equipSword;
    public Shield equipShield;
    public Shoes equipShoes;

    public Fighter(String name, Sword sword, Shield shield){
        this.name = name;
        this.equipSword = sword;
        this.equipShield = shield;
        initializeStats();
    }
    public void initializeStats(){
        maxHP = 100 + 10*lvl;
        maxMana = 50 + 2*lvl;
        baseSpeed = 10 + 3*lvl;
        currentHP = maxHP;
        currentMana = maxMana;
        currentSpeed = baseSpeed;
        updateStats();
    }
    public void takeDMG(int damage){
        int reducedDMG = (int) (damage - equipShield.shieldDEF);
        reducedDMG = Math.max(reducedDMG, 0);
        currentHP -= reducedDMG;
        currentHP = Math.max(currentHP, 0); // check if HP < 0 to set HP = 0
    }
    public void lvlUP(){
        lvl++;
        initializeStats();
    }
    public void setEquipSword(Sword newSword){
        equipSword = newSword;
        updateStats();
    }
    public void setEquipShield(Shield newShield){
        equipShield = newShield;
    }
    public void updateStats(){
        currentSpeed = baseSpeed - equipSword.SpeedDecrease() - equipShield.SpeedDecrease();
    }
    public double getMaxHP(){
        return maxHP;
    }
    public double getMaxMana(){
        return maxMana;
    }
    public double getCurrentHP(){
        return currentHP;
    }
    public double getCurrentMana(){
        return currentMana;
    }
    public double getCurrentSpeed(){
        return currentSpeed;
    }
}

