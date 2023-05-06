import java.util.Arrays;


public class kactekrar {

    

    public static void main(String[] args) {
        int[] list = {3, 5, 6, 8, 12, 5, 123, 12, 5, 12, 12, 65432, 21, 65432};
        int sayac = 1;
        int[] duplicate = new int[list.length];
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sıralı hali:\n" + Arrays.toString(list));
        System.out.println("Tekrar sayıları:");
        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
                for (int j=0;j< list.length;j++) {
                    if (i != j && list[i] == list[j]) {
                        sayac++;
                    }
                }
                System.out.println(list[i] + " sayısı " + sayac + " defa tekrar edildi.");
            } else if (list[i] != list[i - 1]) {
                for (int j = 0; j < list.length; j++) {
                    if (i != j && list[i] == list[j]) {
                        sayac++;
                    }
                }
                System.out.println(list[i] + " sayısı " + sayac + " kadar tekrar edildi.");
            }
                sayac = 1;
        }
    }
}
