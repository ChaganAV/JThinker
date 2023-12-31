
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Fork fork1 = new Fork();
        Fork fork2 = new Fork();
        Fork fork3 = new Fork();
        Fork fork4 = new Fork();
        Fork fork5 = new Fork();
        List<Thinker> thinkers = new ArrayList<>();
//        Thinker thinker1 = new Thinker("thinker1",fork1,fork2);
//        Thinker thinker2 = new Thinker("thinker2",fork2,fork3);
//        Thinker thinker3 = new Thinker("thinker3",fork3,fork4);
//        Thinker thinker4 = new Thinker("thinker4",fork4,fork5);
//        Thinker thinker5 = new Thinker("thinker5",fork5,fork1);
        Pair pair1 = new Pair(fork1,fork2);
        Pair pair2 = new Pair(fork2,fork3);
        Pair pair3 = new Pair(fork3,fork4);
        Pair pair4 = new Pair(fork4,fork5);
        Pair pair5 = new Pair(fork5,fork1);
        Thinker thinker1 = new Thinker("thinker1",pair1);
        Thinker thinker2 = new Thinker("thinker2",pair2);
        Thinker thinker3 = new Thinker("thinker3",pair3);
        Thinker thinker4 = new Thinker("thinker4",pair4);
        Thinker thinker5 = new Thinker("thinker5",pair5);
        thinkers.add(thinker1);
        thinkers.add(thinker2);
        thinkers.add(thinker3);
        thinkers.add(thinker4);
        thinkers.add(thinker5);

        Table table = new Table(thinkers);
        table.thread.start();
    }
}
