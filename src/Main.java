//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int input = 19;
        online();
        dayOfTheWeek(input);

    }



    public static void online (){

        boolean isOnline = true;

        if (!isOnline){
            System.out.println("User is online");
        }

    }

    public static void dayOfTheWeek (int day){

        if (day==1) {

            System.out.println("Monday");

        } else if (day==2){

            System.out.println("Tuesday");

        } else if (day==3){

            System.out.println("Wednesday");

        } else if (day==4){

            System.out.println("Thursday");

        }else if (day==5){

            System.out.println("Friday");

        }else if (day==6){

            System.out.println("Saturday");

        }else if (day==7){

            System.out.println("Sunday");

        }else{

            System.out.println("null");

        }



    }




}

