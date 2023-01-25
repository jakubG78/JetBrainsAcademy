// You can experiment here, it won’t be checked

public class Task {
    public static void main(String[] args) {
        Pumpkin pumpkin = new Pumpkin(false);
        pumpkin.addCandle();
    }

}

class Pumpkin {

    private boolean forHalloween;

    public Pumpkin(boolean forHalloween) {
        this.forHalloween = forHalloween;
    }

    void addCandle() {
        if (Pumpkin.this.forHalloween) {
            new Candle().burning();
        } else {
            System.out.println("We don't need a candle.");
        }
    }

    class Candle {

        void burning() {
            System.out.println("The candle is burning! Boooooo!");
        }
    }
}
