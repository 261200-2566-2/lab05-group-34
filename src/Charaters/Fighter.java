package Charaters;

import Accessories.Ring.Ring;
import Accessories.Shoe.Shoes;
import Weapon.Sword;
import Weapon.Shield;

public class Fighter {
    String name;
    protected int lvl = 1;
    protected double maxHP = 100;
    protected double currentHP;
    protected double currentatk;
    protected double maxMana = 50;
    protected double currentMana;
    protected double baseSpeed = 20;
    protected double currentSpeed;
    public Sword equipSword;
    public Shield equipShield;
    public Shoes equipShoes;
    public Ring equipRing;

    public Fighter(String name){
        this.name = name;
        initializeStats();
    }
    public void initializeStats(){
        maxHP = 100 + 10*lvl;
        maxMana = 50 + 2*lvl;
        baseSpeed = 10 + 3*lvl;
        currentHP = maxHP;
        currentMana = maxMana;
        currentSpeed = baseSpeed;
        currentatk = 0;
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
        updateStats();
    }
    public void setEquipShoes(Shoes newShoes){
        equipShoes = newShoes;
        updateStats();
    }
    public void  setEquipRing(Ring newRing){
        equipRing = newRing;
        updateStats();
    }
    public void updateStats(){
        currentSpeed = baseSpeed;
        currentatk = 0;
        if (equipShoes != null){
            currentSpeed += equipShoes.Speed();
            currentatk += equipShoes.atkShoe();
        }
        if (equipShield != null){
            currentSpeed -= equipShield.SpeedDecrease();
        }
        if (equipSword != null){
            currentSpeed -= equipSword.SpeedDecrease();
            currentatk += equipSword.swordDMG;
        }
        if (equipRing != null){
            currentatk += equipRing.atkring();
        }
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
    public double getCurrentatk(){
        return currentatk;
    }
}

