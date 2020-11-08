import lombok.extern.log4j.Log4j;

@Log4j
public class ImplementsRunnableClass implements Runnable {
    private Counter counter;

    public ImplementsRunnableClass(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.isNotEnough()) {
            counter.increment();
            log.info("Value from ImplementsRunnable " + counter.getCurrentValue());
        }
    }
}
