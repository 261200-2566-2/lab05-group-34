package Charaters;
import Weapon.Sword;
import Weapon.Shield;
public class Tank extends Fighter {
    public Tank(String name){
        super(name);
    }
    @Override
    public void initializeStats(){
        maxHP = 130 + 10*lvl;
        baseSpeed = 8 + 1*lvl;
        maxMana = 50 + 2*lvl;
        currentHP = maxHP;
        currentMana = maxMana;
        currentSpeed = baseSpeed;
        currentatk = 0;
        updateStats();
    }
}