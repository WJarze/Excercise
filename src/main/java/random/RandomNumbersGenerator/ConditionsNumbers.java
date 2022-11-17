package random.RandomNumbersGenerator;

public class ConditionsNumbers {
    private int origin;
    private int bounds;
    private int size;

    public ConditionsNumbers(int size , int origin , int bounds) {
        this.size = size;
        this.origin = origin;
        this.bounds = bounds;
    }

    public int getOrigin() {
        return origin + 1;
    }

    public int getBounds() {
        return bounds + 1;
    }

    public int getSize() {
        return size;
    }
}
