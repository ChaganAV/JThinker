public class Fork {
    volatile boolean state = false;

    /**
     * получаем вилку
     * @param msg
     */
    synchronized void get(String msg){
        System.out.println(msg+"взял вилку");
        setState(true);
    }

    /**
     * кладем вилку
     * @param msg
     */
    public void put(String msg){
        setState(false);
        System.out.println(msg+"положил вилку");
    }

    /**
     * состояние вилки
     * @return истина если взята
     */
    public boolean isState() {
        return state;
    }

    /**
     * изменяем состояние вилки
     * @param state
     */
    public void setState(boolean state) {
        this.state = state;
    }
}
