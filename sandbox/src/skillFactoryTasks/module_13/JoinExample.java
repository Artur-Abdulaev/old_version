package skillFactoryTasks.module_13;

public class JoinExample {
    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            public void run() {
                for (int i = 0; i < 1000000000; i++) {
                    JoinExample.counter++;
                }
            }
        };
        thread.start();
        thread.join(); // main() ����� ����������� � ����, ���� �� ���������� ����� thread
        System.out.println("Counter value: " + counter); // Counter value: 1000000000
    }
}
