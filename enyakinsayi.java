import java.util.Arrays;
import java.util.Scanner;
public class enyakinsayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] list={20,10,21,76,24,51,67};
        System.out.print("Bir sayı girin:");
        int sayi=input.nextInt();
        int max=sayi;
       int min=sayi;
        Arrays.sort(list);
        System.out.println("Dizimiz:"+Arrays.toString(list));
        for(int i:list){
            if(max<i){
                max=i;
                break;
            }}
         for(int i=list.length-1;i>=0;--i){
             if(sayi>list[i]){
                 min=list[i];
                 break;
             }
        }
        System.out.println("Girilen sayi:"+sayi);
        System.out.println("Girelen sayıdan büyük en yakın sayi:"+max);
        System.out.println("Girelen sayıdan küçük en yakın sayi:"+min);
 }
}