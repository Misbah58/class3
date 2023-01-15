package Class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte  ShorterNumber= (byte)number;
        float f= 10.5f;
        int num= (int) f;
        System.out.println(ShorterNumber);
        System.out.println(f);
        /* if we try to store the content from a smaller box to a larger box , java will not complain. because
        the content can easily fit inside the larger box. if we try to store content from a larger box to a smaller
         box we will get an error. in this case we need to type cost to store the content.

         */
        float eggs= 12.5f;
        int wholePart= (int) eggs;
        System.out.println(eggs);
        System.out.println(wholePart);
    }

}
