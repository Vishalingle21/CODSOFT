package Student_Grade_Calculator;

import java.util.*;

public class student_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- GRADE CALCULATOR ---");

        System.out.println("Enter no. of subjects your academics have : ");
        int subjects = sc.nextInt();

        String sub[] = new String[subjects];

        // System.out.println("Enter the name of subjects :");
        for (int i = 0; i <= subjects; i++) {

            System.out.println("Enter name of subject " + (i+1));
            sub[i] = sc.nextLine();
            if (i ==0 ) {
                sc.nextLine();
            }

        }

        for (int i = 0; i <= subjects; i++) {
            System.out.println(sub[i]);
        }
        


    }

}
