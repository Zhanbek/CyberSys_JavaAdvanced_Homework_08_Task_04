package Homework_08_Task_04;

public class FirstClass implements Runnable {

    private final SyncPrinter printer;

    public FirstClass(SyncPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 9; i++) {
            printer.printFirst(i);
        }
    }
}