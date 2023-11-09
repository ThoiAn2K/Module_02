package animal1;

import Edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "Chicken: quat quat";
    }

    public String howToEat(){
        return "could be fried";
    }
}
