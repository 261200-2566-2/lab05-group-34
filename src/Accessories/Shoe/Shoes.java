package Accessories.Shoe;

public class Shoes {
    public int lvl = 1;
    public double basespeed;
    public double Shoesspeed;
    protected double baseATK;
    protected double Shoeatk;
    public Shoes(double basespeed){
        this.basespeed = basespeed;
        Shoesspeed = basespeed;
    }
    public int Speed(){
        return (int)(Shoesspeed);
    }
    public void lvlUP(){
        lvl++;
        Shoesspeed = basespeed * (1 + 0.05 * lvl);
        System.out.println("Congrat! your shoes is level UP!!");
    }
    public int atkShoe(){
        return (int)(Shoeatk);
    }
}

