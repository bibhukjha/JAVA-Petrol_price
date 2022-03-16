package com.harman.batch4;

    abstract class PetrolPrices{

        abstract void ChangePrice();
}

class Govt extends PetrolPrices{
    void ChangePrice()
    {
        System.out.println("Price increased by 2%!!");
    }

    public static void main(String[] args) {
        PetrolPrices price=new Govt();
        price.ChangePrice();

    }
}
