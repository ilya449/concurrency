public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread extendsThread = new ExtendsThreadClass(counter);
        Runnable implementsRunnable = new ImplementsRunnableClass(counter);
        extendsThread.start();
        new Thread(implementsRunnable).start();
    }
}
