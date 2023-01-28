import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int f, marks = 0, bill = 1000000;
        int g = 0, p = 0;
        String i, o;
        List<String> h = new ArrayList<>();
        while (true) {

            System.out.println("student name");
            i = scanner.next();
            o = i;
            list.add(i);

            System.out.println("marksof cs");
            int k = scanner.nextInt();
            marks += k;
            System.out.println("marks of os");
            k = scanner.nextInt();
            marks += k;
            System.out.println("marks of java");
            k = scanner.nextInt();
            marks += k;
            marks /= 3;

            if (marks >= 90 && marks <= 100) {
                System.out.println(o + " is grade A");
                h.add("A");
            } else if (marks < 90 && marks >= 70) {
                System.out.println(o + " is grade B");
                h.add("B");

            } else if (marks < 70 && marks >= 60) {
                System.out.println(o + " is grade C");
                h.add("c");
            } else if (marks < 60 && marks >= 50) {
                System.out.println(o + " is grade D");
                h.add("D");
            } else if (marks < 50 && marks > 0) {
                System.out.println(o + " is grade f");
                h.add("F");
            } else if (marks > 100 && marks < 0) {
                System.out.println("wrong input");
                break;
            } else {
                break;
            }
            System.out.println("exit for 1");
            k = scanner.nextInt();
            if (k == 1) {
                break;
            } else {

            }
            p += 1;
            g += marks;
            marks = 0;
        }
        g /= p;
        for (int u = 0; u < list.size(); u++) {
            System.out.println("students name" + list.get(u) + "" + h.get(u));
        }
        System.out.println("average of students" + g);

    }
}