public class Pair {
    private Fork forkRight;
    private Fork forkLeft;
    volatile private boolean state;
    Thinker thinker;

    /**
     * пара столовых приборов (вилок)
     * @param forkRight правая вилка
     * @param forkLeft левая вилка
     */
    public Pair(Fork forkRight, Fork forkLeft) {
        this.forkRight = forkRight;
        this.forkLeft = forkLeft;
        this.state = false;
    }

    /**
     * получаем пару вилок
     */
    public void getForks(){
        getForkRight();
        getForkLeft();
    }

    /**
     * кладем вилки
     */
    public void putForks(){
        putForkRight();
        putForkLeft();
    }

    /**
     * берем правую вилку
     */
    synchronized void getForkRight(){
        while (!forkRight.isState()) {
            forkRight.get(thinker.getName() + " правой рукой ");
        }
    }

    /**
     * берем левую вилку
     */
    synchronized void getForkLeft(){
        while (!forkLeft.isState()) {
            forkLeft.get(thinker.getName() + " левой рукой ");
            setState(true);
        }
    }

    /**
     * кладем правую вилку
     */
    public void putForkRight(){
        forkRight.put(thinker.getName() + " правой рукой ");
    }

    /**
     * кладем левую вилку
     */
    public void putForkLeft(){
        forkLeft.put(thinker.getName() + " левой рукой ");
    }

    // region getters

    /**
     * состояние столовых приборов (пары вилок)
     * @return
     */
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
