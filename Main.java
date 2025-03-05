import base.Major;
import idea.uni.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ایجاد دو رشته
        Major major1 = new Major("ریاضی", 100);
        Major major2 = new Major("کامپیوتر", 80);

        // ایجاد پنج فرد


        // ایجاد سه دانشجو
        Student student1 = new Student(id, 1398, major1.id);
        Student student2 = new Student(person2., 1398, major1.id);
        Student student3 = new Student(person3., 1399, major2.id);

        // چاپ اسم و شماره دانشجویی دانشجویان
        System.out.println("دانشجویان:");
        System.out.println(student1.personID + " " + student1.studentID);
        System.out.println(student2.personID + " " + student2.studentID);
        System.out.println(student3.personID + " " + student3.studentID);

        // ایجاد دو استاد
        Professor professor1 = new Professor(person4., major1.id);
        Professor professor2 = new Professor(person5., major2.id);

        // چاپ اسم و شناسه اساتید
        System.out.println("\nاساتید:");
        System.out.println(professor1.personID + " " + professor1.id);
        System.out.println(professor2.personID + " " + professor2.id);

        // ایجاد سه درس
        Course course1 = new Course("ریاضی 1", 3);
        Course course2 = new Course("ریاضی 2", 3);
        Course course3 = new Course("برنامه‌نویسی پیشرفته", 4);

        // ایجاد سه درس ارائه شده
        PresentedCourse presentedCourse1 = new PresentedCourse(course1.id, professor1.id, 50);
        PresentedCourse presentedCourse2 = new PresentedCourse(course2.id, professor1.id, 40);
        PresentedCourse presentedCourse3 = new PresentedCourse(course3.id, professor2.id, 60);

        // ثبت‌نام دانشجویان در دروس ارائه شده
        presentedCourse1.addStudent(student1.id);
        presentedCourse1.addStudent(student2.id);
        presentedCourse2.addStudent(student1.id);
        presentedCourse2.addStudent(student2.id);
        presentedCourse2.addStudent(student3.id);
        presentedCourse3.addStudent(student3.id);

        // ایجاد کارنامه برای هر دانشجو
        Transcript transcript1 = new Transcript(student1.id);
        Transcript transcript2 = new Transcript(student2.id);
        Transcript transcript3 = new Transcript(student3.id);

        // ثبت نمرات در کارنامه‌ها
        transcript1.setGrade(presentedCourse1.id, 18.5);
        transcript1.setGrade(presentedCourse2.id, 19.0);
        transcript2.setGrade(presentedCourse1.id, 17.0);
        transcript2.setGrade(presentedCourse2.id, 18.5);
        transcript3.setGrade(presentedCourse2.id, 20.0);
        transcript3.setGrade(presentedCourse3.id, 19.5);

        // چاپ کارنامه‌ها
        System.out.println("\nکارنامه‌ها:");
        transcript1.printTranscript();
        transcript2.printTranscript();
        transcript3.printTranscript();

        // محاسبه و چاپ معدل
        System.out.println("\nمعدل‌ها:");
        System.out.println("معدل دانشجو 1: " + calculateAverage(transcript1));
        System.out.println("معدل دانشجو 2: " + calculateAverage(transcript2));
        System.out.println("معدل دانشجو 3: " + calculateAverage(transcript3));
    }

    // محاسبه معدل کارنامه
    private static double calculateAverage(Transcript transcript) {
        double sum = 0;
        for (double grade : transcript.grades.values()) {
            sum += grade;
        }
        return sum / transcript.grades.size();
    }
}