import java.util.List;

public class Table implements Runnable{
    List<Thinker> thinkers;
    Thread thread;
    public Table(List<Thinker> thinkers){
        this.thinkers = thinkers;
        thread = new Thread(this);
    }
    public void run(){
        lunch();
    }
    private void lunch(){
        for(Thinker thinker: thinkers){
            thinker.thread.start();
        }
    }
}
