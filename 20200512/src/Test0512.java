import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student {
    public String name;
    public String classes;
    public Double grades;
    public Student(String name,String classes,Double grades) {
        this.name = name;
        this.classes = classes;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", grades=" + grades +
                '}';
    }
}

public class Test0512 {
    public static List<Character> func(String str1, String str2) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains(str1.charAt(i) + "")) {
                list.add(str1.charAt(i));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String str1 = "welcome to yuLin";
        String str2 = "come";
        List<Character> ret = func(str1,str2);
        System.out.println(ret);
    }
    public static void main2(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main1(String[] args) {
        Student student = new Student("bit","火箭2班",60.0);
        Student student2 = new Student("yangchuan","火箭2班",90.0);
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        System.out.println(list);
    }
}
