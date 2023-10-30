public class Cutlery {
    private String forkRight;
    private String forkLeft;
    private boolean dish;

    public void getForkRight() {
        System.out.println("взял правую вилку");
    }


    public boolean isDish() {
        return dish;
    }

    public void setDish(boolean dish) {
        this.dish = dish;
    }
}
