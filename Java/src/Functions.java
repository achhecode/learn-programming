public class Functions {

    public static String greet(String name){
        System.out.println("Hello " + name);
        return "Hello   " + name;
    }

    public static double twoNumCal(double a, double b){
        double temp1 = a * b;
        temp1 = temp1/(a+b);
        return temp1*2;
    }

    static void main() {

        System.out.println(greet("Abdul"));

        double ans = twoNumCal(3,4);
        System.out.println(ans);

        System.out.println(twoNumCal(6,8));

        System.out.println(twoNumCal(9.5,6.7));
//        System.out.println(greet("Abdul"))


    }
}
