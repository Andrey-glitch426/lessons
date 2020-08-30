package lessons;

public class Main {

    public static void main(String[] args) {
        int aa = 5;
        long bb = 5;
        char cc = 5;
        float dd = 5f;
        int a = 1;
        int b = 5;
        int c = 4;
        int d = 2;
        System.out.println("task3");
        System.out.println(task3( a, b, c, d));
        int x1 = 10;
        int x2 = 9;
        System.out.println("task4");
        System.out.println(task4(x1, x2));
        int y = -20;
        System.out.println("task5");
        System.out.println(task5(y));
        int z = 7;
        System.out.println("task6");
        System.out.println(task6(z));
        String str = "Виталя";
        System.out.println("task7");
        System.out.println( task7() + str);


    }
    public static float task3(int a, int b, int c, int d){
        float e = a * (b + (c / d));
        return e;
    }

    public static boolean task4(int x1, int x2){
        boolean check = true;
        if ( x1 + x2 >= 10 & x1 + x2 <= 20 )
            check = true;
        else
            check = false;
        return check;
    }

    public static String task5(int y){
        String str1 = "число положительное";
        String str2 = "число отрицательное";
        if(y>=0)
            return str1;
        else
            return str2;
    }
    public static boolean task6(int z){
        boolean check = true;
        if(z < 0)
            return check;
        else{
            check = false;
            return check;
        }
    }

    public static String task7(){
        String string = "Привет, ";
        return string;
    }

}
