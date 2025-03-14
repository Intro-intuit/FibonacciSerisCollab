public class Main {

    public static void main(String[] args) {

        int[] fibonacci = new int[10];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i=2; i<10; ++i)
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];

        System.out.println("Fibonacci sequence:");
        for (int num : fibonacci)
            System.out.print(num + " ");
    }
}
