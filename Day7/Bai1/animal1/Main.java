package animal1;

import Edible.Edible;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal x : animals ){
            System.out.println(x.makeSound());

            if (x instanceof Chicken) {
                Edible edibler = (Chicken) x;
                System.out.println(edibler.howToEat());
            }

        }
    }

}
