import java.util.Arrays;

public class tekraredensayi {
    static boolean isFind(int arr[], int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {1, 53, 6, 8, 2, 1, 6, 98, 345, 2534, 345};
        Arrays.sort(list);
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                        break;

                    }
                }
            }
        }
        for(int value: duplicate){
            if(value!=0 && value%2==0){
                System.out.println(value);
            }
        }


    }
}