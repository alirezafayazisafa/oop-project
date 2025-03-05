package idea.uni;

import java.util.HashMap;
import java.util.Map;

public class Transcript {
    public int studentId;
    public Map<Integer, Double> grades;

    public Transcript(int studentId) {
        this.studentId = studentId;
        this.grades = new HashMap<>();
    }

    public void setGrade(int presentedCourseId, double grade) {

        grades.put(presentedCourseId, grade);
    }

    public void printTranscript() {
        System.out.println("Transcript for Student ID: " + studentId);
        for (Map.Entry<Integer, Double> entry : grades.entrySet()) {
            System.out.println("Presented Course ID: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}