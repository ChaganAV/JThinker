public class Fork {
    volatile boolean state = false;
    synchronized void get(String msg){
        System.out.println(msg+"взял вилку");
        setState(true);
    }
    public void put(String msg){
        setState(false);
        System.out.println(msg+"положил вилку");
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
