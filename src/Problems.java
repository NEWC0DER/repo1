public class Problems {


    public static void main(String[] args){
        System.out.println("Working with if-else");
        System.out.println("===========================================");
        problem1();
        System.out.println("===========================================");
        problem2();
        System.out.println("===========================================");
        problem3();
        System.out.println("===========================================");
        problem4();
        System.out.println("===========================================");
        problem5();
        System.out.println("===========================================");
        problem6();
        System.out.println("===========================================");
        problem7();
        System.out.println("===========================================");
        problem8();
        System.out.println("===========================================");
        System.out.println("Working with switch-case");

    }

    public static void problem1(){
        checkIfCorrect(1);
        checkIfCorrect(0);
        checkIfCorrect(-3);
    }

    public static void problem2(){
        checkIfCorrectBigger(1);
        checkIfCorrectBigger(0);
        checkIfCorrectBigger(-3);
    }

    public static void problem3(){
        checkIfCorrectSmaller(1);
        checkIfCorrectSmaller(0);
        checkIfCorrectSmaller(-3);
    }

    public static void problem4(){

        checkIfCorrectBiggerEquals(1);
        checkIfCorrectBiggerEquals(0);
        checkIfCorrectBiggerEquals(-3);
    }

    public static void problem5(){

        checkIfCorrectSmallerEquals(1);
        checkIfCorrectSmallerEquals(0);
        checkIfCorrectSmallerEquals(-3);
    }

    public static void problem6(){
        checkIfNotEquals(1);
        checkIfNotEquals(0);
        checkIfNotEquals(-3);
    }

    public static void problem7(){
        checkIfTest("test");
        checkIfTest("тест");
        checkIfTest("3");
    }

    public static void problem8(){

    }

    

    public static void checkIfTest (String a){
        if (a=="test"){
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    public static void checkIfNotEquals (int a){
        if (a!=0){
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    public static void checkIfCorrectSmallerEquals(int a){
        if (a<=0){
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    public static void checkIfCorrectBiggerEquals(int a){
        if (a>=0){
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    public static void checkIfCorrectSmaller(int a){
        if (a<0){
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }


    public static void checkIfCorrectBigger(int a){
        if (a>0){
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    public static void checkIfCorrect (int a) {

        if (a == 0) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }
}
