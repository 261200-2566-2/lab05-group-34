package Accessories.Ring;

public class Ring {
    double Ringatk;
    double baseatk;
    int lvl = 1;
    public Ring(double atk){
        Ringatk = atk;
        baseatk = atk;
    }
    public int atkring(){
        return (int)(Ringatk);
    }
    public void lvlUP(){
        lvl++;
        Ringatk = baseatk * (1 + 0.05 * lvl);
        System.out.println("Congrat! your ring is level UP!!");
    }
}
