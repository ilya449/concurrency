import lombok.extern.log4j.Log4j;

@Log4j
public class ExtendsThreadClass extends Thread {
    private Counter counter;

    public ExtendsThreadClass(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.isNotEnough()) {
            counter.increment();
            log.info("Value from ExtendsThread " + counter.getCurrentValue());
        }
    }
}
