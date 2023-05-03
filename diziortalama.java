
public class diziortalama {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        double result = 0.0;
     
        for (double i : arr) {
            result += 1 / i;
        }

        System.out.println(arr.length / result);

    }
}