package Caijingjin.Chapter30.UglyDucking;

public class Decorator implements Swan {
    private  Swan swan;

    public Decorator(Swan swan) {
        this.swan = swan;
    }

    @Override
    public void fly() {
        this.swan.fly();
    }

    @Override
    public void cry() {
        this.swan.cry();
    }

    @Override
    public void desAppearance() {
        this.swan.desAppearance();
    }
}
