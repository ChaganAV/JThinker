public class Pair {
    private Fork forkRight;
    private Fork forkLeft;
    private boolean state;
    Thinker thinker;


    public Pair(Fork forkRight, Fork forkLeft) {
        this.forkRight = forkRight;
        this.forkLeft = forkLeft;
        this.state = false;
    }
    public void getForks(){
        getForkRight();
        getForkLeft();
    }
    public void putForks(){
        putForkRight();
        putForkLeft();
    }
    synchronized void getForkRight(){
        while (!forkRight.isState()) {
            forkRight.get(thinker.getName() + " правой рукой ");
        }
    }
    synchronized void getForkLeft(){
        while (!forkLeft.isState()) {
            forkLeft.get(thinker.getName() + " левой рукой ");
            setState(true);
        }
    }
    public void putForkRight(){
        forkRight.put(thinker.getName() + " правой рукой ");
    }
    public void putForkLeft(){
        forkLeft.put(thinker.getName() + " левой рукой ");
    }

    // region getters


    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Thinker getThinker() {
        return thinker;
    }

    public void setThinker(Thinker thinker) {
        this.thinker = thinker;
    }
    // endregion
}
