package Homework_07_Task_04;

public class SyncPrinter {

    private boolean firstTurn = true;

    public synchronized void printFirst(int i) {
        while (!firstTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Перший клас: " + i);

        firstTurn = false;
        notify();
    }

    public synchronized void printSecond(int i) {
        while (firstTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Другий клас: " + i);

        firstTurn = true;
        notify();
    }
}
