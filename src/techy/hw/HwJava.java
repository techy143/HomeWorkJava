package techy.hw;

public class HwJava {


    public static void main (String [] args ) {

        // Displaying My Full Name ....

        System.out.println("Tauhid Elahi Chowdhury");

        myFirstMethod();
        myFirstMethod2();
        myFirstMethod3();
        mySecondMethod();
        mySecondMethod2();

    }

     // 1st Method ... int

        public static void myFirstMethod() {

            int techyFirstVariable = 40;
            int techySecondVariable = 30;

            System.out.println(techyFirstVariable + techySecondVariable);


    }


    public static void myFirstMethod2() {

        int techyFirstVariable = 100;
        int techySecondVariable = 80;

        System.out.println(techyFirstVariable - techySecondVariable);

    }


    public static void myFirstMethod3() {

        int techyFirstVariable = 5;
        int techySecondVariable = 6;

        System.out.println(techyFirstVariable * techySecondVariable);

    }



        // 2nd Method ... String

    public static void mySecondMethod(){

        String techyFirstString = "Let's Play with JAVA";

        System.out.println(techyFirstString);

    }

    public static void mySecondMethod2() {

        String techySecondString = "I know JAVA is very difficult language to learn but if u can do it, YES...I CAN DO IT for Sure.... In Sha ALLAH. ";

        System.out.println(techySecondString);


    }



}
