import java.awt.desktop.OpenURIEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    static List<Student> studentList = new ArrayList<>();
    public static void main(String[] args) {

        int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Quantity:");
        n = scanner.nextInt();


        for(int i = 1;i<=n;i++){
            input();
        }
        System.out.println("IN DANH SACH SV:");
        output();
    }
    public static void input()
    {

        System.out.println("Enter student information:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student's code:");
        String code = scanner.nextLine();
        System.out.println("Enter Student's name:");
        String name = scanner.nextLine();
        System.out.println("Enter Student's Grade:");
        float grade = scanner.nextFloat();
        Student student = new Student(code, name, grade);
        studentList.add(student);
    }
    // In danh sach sinh vien
    public static void output(){

        for(Student student: studentList){

            System.out.println(student.toString());
        }
    }
    public static void removeByCode(String code)
    {

    }
    public static  void sortByGradeDesc()
    {

    }
    public static Student findByCodeOrName(String keyword){
        return null;
    }
    public static List<Student> filterByGrade(float x){
        return  null;
    }
}
