package Charaters;
import Weapon.Sword;
import Weapon.Shield;
public class Tank extends Fighter {
    public Tank(String name, Sword sword, Shield shield){
        super(name , sword, shield);
    }
    @Override
    public void initializeStats(){
        maxHP = 130 + 10*lvl;
        baseSpeed = 8 + 3*lvl;
    }
}