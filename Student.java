/**
 * @author JS
 * @creat 2021-03-19-17:43
 */

import java.text.DecimalFormat;

/**
 *类功能描述
 *@Authorkeyter
 *@Date 2021/3/19 17:43
 */
public class Student {
    public int id;
    public String name,clazz;
    public float usualPerformance,labResults,finalExam;
    public float finalScore;
    Student(){

    }
    public void updateGrade(){
/*最终成绩=平时成绩×30%+实验成绩×30%+期末考试×40%
                要输出最终成绩的计算结果（四舍五入到小数点后2位有效数字）
        及对应的“A”（>=90）、“B”（>=80 and <90）、“C”（>=70 and <80）、“D”(>=60 and <70)、“E”（<60）*/
        //finalScore = (float)(usualPerformance * 0.3) + (float)(labResults * 0.3) + (float)(finalExam * 0.4);
        finalScore = (float)(usualPerformance * 0.3 + labResults * 0.3 + finalExam * 0.4);
        if (finalScore >= 90){
            clazz = "A";
        }else if (finalScore >= 80 ){
            clazz = "B";
        }else if (finalScore >= 70){
            clazz = "C";
        }else if (finalScore >= 60){
            clazz = "D";
        }
        else {
            clazz = "E";
        }
    }
    public void  outputInfo(){
        DecimalFormat de = new DecimalFormat("0.00");
        System.out.println(name + "(" + id + ")" + "的课程\"Java面向对象程序设计\"的成绩评定如下:");
        System.out.println("平时成绩:" + de.format(usualPerformance));
        System.out.println("实验成绩:" + de.format(labResults));
        System.out.println("期末考试:" + de.format(finalExam));
        System.out.println("总评:" + de.format(finalScore) + ",等级:" + clazz);
    }
}
