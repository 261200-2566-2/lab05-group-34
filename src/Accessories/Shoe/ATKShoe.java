package Accessories.Shoe;

import Accessories.Shoe.Shoes;

public class ATKShoe extends Shoes {


    public ATKShoe(double speed ,double atk){
        super(speed);
        this.baseATK = atk;

    }
    @Override
    public void lvlUP(){
        Shoeatk = baseATK * (1 + 0.1 * lvl);
    }


}
