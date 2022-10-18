package skillFactoryTasks.module_9;

public class Mathematics {


    public static double abs(double num) {
        return (num < 0) ? - num : num;
    }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static int min(int a, int b) {
       return (a <= b) ? a : b;
    }

    public static void main(String[] args) {

        int a = -6, b = -3;

        System.out.println(abs(a));
        System.out.println(Math.max(a, b));
        System.out.println(min(a, b));
    }

}
