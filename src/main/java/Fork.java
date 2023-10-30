public class Fork {
    boolean state = false;
    synchronized void get(){
        while (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("взял вилку");
            state = false;
            notify();
        }
    }
    synchronized void put(){
        while (state){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            state = true;
            System.out.println("положил вилку");
        }
    }
}
