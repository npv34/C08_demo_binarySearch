import src.Student;
import src.StudentManager;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        /*

        StudentManager studentManager = new StudentManager();
        Student student1 = new Student(1, "Nam", "nam@gmail.com", "Ha Noi");
        Student student2 = new Student(2, "Hung", "hung@gmail.com", "Ha Noi");
        Student student3 = new Student(3, "Long", "long@gmail.com", "Ha Noi");
        Student student4 = new Student(4, "Nam", "nam12@gmail.com", "Ha Noi");
        Student student5 = new Student(5, "Nam", "namblue@gmail.com", "Ha Noi");
        studentManager.insertStudent(student1);
        studentManager.insertStudent(student2);
        studentManager.insertStudent(student3);
        studentManager.insertStudent(student4);
        studentManager.insertStudent(student5);
        ArrayList<Student> studentsFilter = studentManager.search("Nam");
        studentManager.showList(studentsFilter);

         */

        int[] arr = {2,3,4,5,6,7,8,9,10,11};

        int index = binarySearch(arr, 100);
        if (index == -1) {
            System.out.println("Khong tim thay phan tu can tim");
        } else {
            System.out.println("Phan tu can tim o vi tri: " + index);
        }
    }


    public static Integer binarySearch(int[] data, int number) {
        int left = 0;
        int right = data.length - 1;
        int mid = 0;
        while(left < right) {
            mid = (int) Math.floor((double) (left + right) / 2);
            if(data[mid] == number) {
                return mid;
            }else if (data[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
