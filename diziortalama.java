public class diziortalama {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,};
        double result=0.0;
        double avarage=0.0;
        for(int i :arr){
            result+=i;
        }
      avarage=result/arr.length;
        System.out.println(avarage);

    }
}