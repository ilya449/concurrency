import lombok.Data;

@Data
public class Counter {
    private static final int COUNT = 100;
    private int currentValue;

    public void increment() {
        currentValue++;
    }

    public boolean isNotEnough() {
        return currentValue < COUNT;
    }
}
