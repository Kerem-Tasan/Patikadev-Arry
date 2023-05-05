import java.util.Arrays;
import java.util.Scanner;
public class dizisiralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu\t:");
        int i=input.nextInt();
        int[] list=new int[i];
        System.out.print("Dizinin elemanlarını giriniz:");
        for(int j=0;j< list.length;j++){
            list[j]=input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}