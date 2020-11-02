import java.util.Scanner;

public class Main {

    /**
     * --문제
     * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
     * <p>
     * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
     * <p>
     * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
     * <p>
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
     * <p>
     * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
     * --조건
     * 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
     * --출력
     * 첫째 줄에 n번째 피보나치 수를 출력한다.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int insert = scanner.nextInt();

//        long[] arr = new long[insert + 1];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0) {
//                arr[0] = 0;
//            } else if (i == 1) {
//                arr[1] = 1;
//            } else {
//                arr[i] = arr[i- 1] + arr[i- 2];
//            }
//        }
//        System.out.print(arr[insert]);

        System.out.println(fibonacci(insert));
    }

    public static long fibonacci(long value) {
        if (value == 0) return 0;
        if (value == 1) return 1;

        return fibonacci(value - 1) + fibonacci(value - 2);
    }

}
