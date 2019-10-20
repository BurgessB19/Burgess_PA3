import java.security.SecureRandom;
import java.util.Scanner;

public class Burgess_P1 {

    public static int SecureRandom(int diffRange){
        SecureRandom r = new SecureRandom();

        int rand = 0;
        switch (diffRange){
            case 1:
                rand = r.nextInt(9)+1;
                break;

            case 2:
                rand = r.nextInt(100);
                break;

            case 3:
                rand = r.nextInt(1000);
                break;

            case 4:
                rand = r.nextInt(10000);
                break;
        }


        return rand;



    }

    public static int WhatArithmetic (){
        SecureRandom r = new SecureRandom();
        Scanner sc = new Scanner(System.in);

        int userArith = 0;

        if (userArith == 5) {
            userArith = r.nextInt(4)+1;
        }
        else {

            System.out.println("Choose arithmetic:");
            System.out.println("Addition - 1");
            System.out.println("Subtraction - 2");
            System.out.println("Multiplication -  3");
            System.out.println("Division -  4");
            System.out.println("Random - 5");
            userArith = sc.nextInt();

        }
        return userArith;
    }

    public static int Difficulty (){
        Scanner sc = new Scanner(System.in);

        int difficult;

        System.out.println("Choose a difficulty:");
        System.out.println("Difficulty 1");
        System.out.println("Difficulty 2");
        System.out.println("Difficulty 3");
        System.out.println("Difficulty 4");

        difficult = sc.nextInt();


        return difficult;
    }


    public static double Question(double j){
        Scanner sc = new Scanner(System.in);
        int diffRange = Difficulty();
        int userArith = WhatArithmetic();

        int i;
        //int j = 0;
        double k = 0;
        double userAns = 0;
        double ans = 0;

        if (userArith == 5 ) {
            SecureRandom rand = new SecureRandom();
            for (i = 0; i < 10; ++i) {
                userArith = rand.nextInt(4) + 1;
                switch (userArith) {

                    case 1:
                        int num1 = SecureRandom(diffRange);
                        int num2 = SecureRandom(diffRange);
                        System.out.println("How much is " + num1 + " plus " + num2 + "?");

                        userAns = sc.nextDouble();
                        ans = (double) num1 + num2;


                        break;


                    case 2:
                        int num3 = SecureRandom(diffRange);
                        int num4 = SecureRandom(diffRange);
                        System.out.println("How much is " + num3 + " minus " + num4 + "?");

                        userAns = sc.nextDouble();
                        ans = (double) num3 - num4;

                        break;

                    case 3:
                        int num5 = SecureRandom(diffRange);
                        int num6 = SecureRandom(diffRange);
                        System.out.println("How much is " + num5 + " times " + num6 + "?");

                        userAns = sc.nextDouble();
                        ans = (double) num5 * num6;


                        break;

                    case 4:
                        int num7 = SecureRandom(diffRange);
                        int num8 = SecureRandom(diffRange);
                        System.out.println("How much is " + num7 + " divided by " + num8 + "?");

                        ans = (double) num7 / num8;
                        ans = Math.round(ans * 100);
                        ans = ans / 100;
                        userAns = sc.nextDouble();




                        break;
                }

                if(userAns == ans) {
                    ++j;
                   System.out.println(Right());
                }
                else {
                    ++k;
                    System.out.println(Wrong());

                }

            }
            }

        else {
        for (i = 0; i < 10; ++i) {
            switch (userArith) {

                case 1:
                    int num1 = SecureRandom(diffRange);
                    int num2 = SecureRandom(diffRange);
                    System.out.println("How much is " + num1 + " plus " + num2 + "?");

                    userAns = sc.nextDouble();
                    ans = (double) num1 + num2;


                    break;


                case 2:
                    int num3 = SecureRandom(diffRange);
                    int num4 = SecureRandom(diffRange);
                    System.out.println("How much is " + num3 + " minus " + num4 + "?");

                    userAns = sc.nextDouble();
                    ans = (double) num3 - num4;

                    break;

                case 3:
                    int num5 = SecureRandom(diffRange);
                    int num6 = SecureRandom(diffRange);
                    System.out.println("How much is " + num5 + " times " + num6 + "?");

                    userAns = sc.nextDouble();
                    ans = (double) num5 * num6;


                    break;

                case 4:
                    int num7 = SecureRandom(diffRange);
                    int num8 = SecureRandom(diffRange);
                    System.out.println("How much is " + num7 + " divided by " + num8 + " to the nearest hundredth?");

                    ans = (double) num7 / num8;
                    ans = Math.round(ans * 100);
                    ans = ans / 100;
                    System.out.println(ans);
                    userAns = sc.nextDouble();



                    break;


            }



            if(userAns == ans){
                ++j;
                System.out.println(Right());

            }
            else {
                ++k;
                System.out.println(Wrong());

            }

        }
        }
        System.out.println(j + " Correct");
        System.out.println(k + " Wrong");

        return j;
    }

    public static String Wrong() {
        SecureRandom random = new SecureRandom();

            int caseNum2 = random.nextInt(4);
            int wrong;
            String wrongAns = "";

            wrong = caseNum2;

            switch (wrong) {
                case 0:
                    wrongAns = "No. Please try again.";
                    break;

                case 1:
                    wrongAns = "Wrong. Try once more.";
                    break;

                case 2:
                    wrongAns = "Don't give up!";
                    break;

                case 3:
                    wrongAns = "No. Keep trying.";
                    break;
            }
            return wrongAns;
        }

    public static String Right() {
        SecureRandom random = new SecureRandom();
            int caseNum1 = random.nextInt(4);
            int right;
            String rightAns = "";

            right = caseNum1;

            switch (right) {
                case 0:
                    rightAns = "Very good!";
                    break;

                case 1:
                    rightAns = "Excellent!";
                    break;

                case 2:
                    rightAns = "Nice work!";
                    break;

                case 3:
                    rightAns = "Keep up the good work!";
                    break;
            }
            return rightAns;



    }





    public static double Score () {
        double j = 0;

              j = (double)Question(j);

        double result = 0.0;
        result = (j / 10) * 100;
        System.out.println(result + "%");
        if (result < 75.0){
            System.out.println("Please ask your teacher for extra help.");
        }
        else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        return result;
    }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int j = 0;
        boolean StudentDone = true;
        String userIn;
        while (StudentDone == true) {

            Score();

            System.out.println("New Session?");
            userIn = sc.next();

            if (userIn.contentEquals("Yes") || userIn.contentEquals("yes")) {
                StudentDone = true;
            }
            else if (userIn.contentEquals("No") || userIn.contentEquals("no")) {
                StudentDone = false;
            }
            else {
                StudentDone = false;
            }
        }

    }
}


