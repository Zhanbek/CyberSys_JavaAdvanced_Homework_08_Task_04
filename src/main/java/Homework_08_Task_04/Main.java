package Homework_08_Task_04;

 public class Main {
    public static void main(String[] args) {

        SyncPrinter printer = new SyncPrinter();

        Thread t1 = new Thread(new FirstClass(printer));
        Thread t2 = new Thread(new SecondClass(printer));

        t1.start();
        t2.start();
    }
}