package lambda.celebrity;

public class Celebrity {
    private String name;
    private boolean canDance;
    private boolean canSing;
    private boolean canAct;

    public Celebrity(String name , boolean canDance , boolean canSing , boolean canAct) {
        this.name = name;
        this.canDance = canDance;
        this.canSing = canSing;
        this.canAct = canAct;
    }

    public String getName() {
        return name;
    }

    public boolean isCanDance() {
        return canDance;
    }

    public boolean isCanSing() {
        return canSing;
    }

    public boolean isCanAct() {
        return canAct;
    }

    @Override
    public String toString() {
        return getName ();
    }
}
