package idea.uni;

import java.util.ArrayList;

public class Student {

    public int id;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personID;
    public final int entranceYear ;
    public int majorID;
    public String studentID;


    public Student(int personID, int entranceYear, int majorID) {
        this.id = generateUniqueId();
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;
        studentList.add(this);
        setStudentID();
    }

    private int generateUniqueId() {
        int newId = 1;
        while (findId(newId) != null) {
            newId++;
        }
        return newId;
    }

    public static Student findId(int id) {
        for (Student student : studentList) {
            if (student.id == id) {
                return student;
            }
        }
        return null;
    }

    private void setStudentID() {
        Major major = Major.findId(majorID);
        if (major != null) {
            int studentCount = 0;
            for (Student student : studentList) {
                if (student.majorID == majorID && student.entranceYear == entranceYear) {
                    studentCount++;
                }
            }
            this.studentID = String.format("%d%d%02d%02d", majorID, entranceYear % 100, studentCount / 100, studentCount % 100);
        }
    }
}

class Major {
    public int id;
    public static ArrayList<Major> majorList = new ArrayList<>();
    public String name;
    public final int capacity;
    public int numberOfStudents;

    public Major(String name, int capacity) {
        this.id = generateUniqueId();
        this.name = name;
        this.capacity = capacity;
        majorList.add(this);
    }

    private int generateUniqueId() {
        int newId = 1;
        while (findId(newId) != null) {
            newId++;
        }
        return newId;
    }

    public static Major findId(int id) {
        for (Major major : majorList) {
            if (major.id == id) {
                return major;
            }
        }
        return null;
    }
}