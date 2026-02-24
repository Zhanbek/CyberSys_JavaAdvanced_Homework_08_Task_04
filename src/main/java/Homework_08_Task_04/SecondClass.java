package Homework_08_Task_04;

class SecondClass implements Runnable {

    private final SyncPrinter printer;

    public SecondClass(SyncPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 9; i++) {
            printer.printSecond(i);
        }
    }
}