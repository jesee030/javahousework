/**
 * @author JS
 * @creat 2021-03-19-17:43
 */

import java.util.Scanner;

/**
 *类功能描述
 *@Authorkeyter
 *@Date 2021/3/19 17:43
 */
public class Teacher {
     public static void inputInfo(Student stu, Scanner sc){
        System.out.print("学号=");
        stu.id = sc.nextInt();
        System.out.print("姓名=");
        stu.name = sc.next();
        System.out.print("平时成绩=");
        stu.usualPerformance = sc.nextFloat();
        System.out.print("实验成绩=");
        stu.labResults = sc.nextFloat();
        System.out.print("期末考试=");
        stu.finalExam = sc.nextFloat();
    }
}
