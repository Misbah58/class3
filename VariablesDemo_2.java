package Class3;

public class VariablesDemo_2 {
    public static void main(String[] args) {
        /*  to rename something right click refactor -> rename .

         */
        int num= 10;
        System.out.println(num);
        int age =12;
        System.out.println(age);
        age= 20;
        System.out.println(age);
        int number=10;
        age=number;// telling java to replace the value of age with the value of number variable.
        System.out.println(age);
        age=number+10;
        System.out.println(age);
        age=age+20;//
        System.out.println(age);

    }
}
