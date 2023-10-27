public class Thinker {
    private boolean think;
    private boolean eat;
    private String name;
    private boolean leftFork;
    private boolean rightFork;

    public Thinker(String name) {
        this.name = name;
    }

    // region getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLeftFork() {
        return leftFork;
    }

    public void setLeftFork(boolean leftFork) {
        this.leftFork = leftFork;
    }

    public boolean isRightFork() {
        return rightFork;
    }

    public void setRightFork(boolean rightFork) {
        this.rightFork = rightFork;
    }

    public boolean isThink() {
        return think;
    }

    public void setThink(boolean think) {
        this.think = think;
    }

    public boolean isEat() {
        return eat;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }
    // endregion
}
