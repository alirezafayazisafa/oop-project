package idea.uni;

import java.util.ArrayList;

public class PresentedCourse {
    public int id;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();
    public int courseId;
    public int professorId;
    public int capacity;
    public ArrayList<Integer> studentIds;

    public PresentedCourse(int courseId, int professorId, int capacity) {
        this.courseId = courseId;
        this.professorId = professorId;
        this.capacity = capacity;
        this.studentIds = new ArrayList<>(capacity);
        presentedCourseList.add(this);
        this.id = presentedCourseList.size(); // ID برابر با سایز لیست است
    }

    public static PresentedCourse findById(int id) {
        for (PresentedCourse presentedCourse : presentedCourseList) {
            if (presentedCourse.id == id) {
                return presentedCourse;
            }
        }
        return null;
    }

    public void addStudent(int studentId) {
        if (studentIds.size() < capacity) {
            studentIds.add(studentId);
        } else {
            System.out.println("Error: Class is full.");
        }
    }
}