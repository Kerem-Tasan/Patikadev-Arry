import java.util.Arrays;
import java.util.Scanner;
public class dizisiralama {
    public static void main(String[] args) {
         int indexStart=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu\t:");
        int i=input.nextInt();
        int[] list=new int[i];
        System.out.print("Dizinin elemanlarını giriniz:");
        for(int j=0;j< list.length;j++){
            list[j]=input.nextInt();
        }
        Arrays.sort(list);
       for(int a:list){
            System.out.println("Dizinin "+ a +". elemanı :"+list[indexStart++]);
        }
    }
}
