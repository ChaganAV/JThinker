public class Thinker implements Runnable{
    private String name;
    private Fork forkRight;
    private Fork forkLeft;
    Thread thread;

    public Thinker(String name, Fork fork1, Fork fork2) {
        this.name = name;
        this.forkRight = fork1;
        this.forkLeft = fork2;
        this.thread = new Thread(this);
    }
    public void run(){
        for (int i = 0; i < 3; i++) {
            if(getRightFork() && getLeftFork()) {
                eat();
            }else {
                think();
            }
        }

    }
    private boolean getRightFork(){
        forkRight.put();
        return true;
    }
    private boolean getLeftFork(){
        forkLeft.put();
        return true;
    }
    private void eat(){

        System.out.println(this.name + " кушаю...");
    }
    private void think(){
        System.out.println(this.name + " think...");
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
