package Threads;

public class CarThread extends Thread {
    private int speed;

    public CarThread(String name, int speed) {
        setName(name);
        this.speed = speed;

        if (speed > 60) {
            throw new RuntimeException("Tezlik 60 dan baland");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        int roadLength = 10;

        for (int i = 0; i < roadLength; i++) {
            System.out.printf("[%s] %s with speed %s \n", i, getName(), speed);

            try {
                sleep(speed);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
