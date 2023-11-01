import java.util.Random;

public class Thinker implements Runnable{
    private String name;
    private Fork forkRight;
    private Fork forkLeft;
    private Pair pair;
    Thread thread;
    private Random random;

    public Thinker(String name, Fork fork1, Fork fork2) {
        this.name = name;
        this.forkRight = fork1;
        this.forkLeft = fork2;
        this.thread = new Thread(this);
        random = new Random();
    }
    public Thinker(String name, Pair pair){
        this.name = name;
        this.pair = pair;
        this.thread = new Thread(this);
        pair.setThinker(this);
        random = new Random();
    }
    public void run(){
        for(int i = 0; i < 3; i++) {
            System.out.println(getName() + " думаю...");
            try {
                Thread.sleep(random.nextInt(2, 5) * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            pair.getForks();
            System.out.println(getName() + " кушаю...");
            pair.putForks();
        }
    }
    public void run2(){
        for (int i = 0; i < 3; i++) {
            if(getRightFork() && getLeftFork()) {
                eat();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                putRightFork();
                putLeftFork();
            }
//            }else {
//                think();
//            }
        }

    }
    private boolean getRightFork(){
        forkRight.get(getName()+" правой рукой ");
        return true;
    }
    private boolean getLeftFork(){
        forkLeft.get(getName() + " левой рукой ");
        return true;
    }
    private void putRightFork(){
        forkRight.put(getName() + " правой рукой ");
    }
    private void putLeftFork(){
        forkLeft.put(getName() + " левой рукой ");
    }
    private void eat(){

        System.out.println(getName() + " кушаю...");
    }
    private void think(){
        System.out.println(getName() + " think...");
    }
    // region getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // endregion
}
