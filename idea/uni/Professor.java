package idea.uni;

import java.util.ArrayList;

public class Professor {
    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<>();
    public int personID;
    public int majorID;

    public Professor(int personID, int majorID) {
        this.id = generateUniqueId();
        this.personID = personID;
        this.majorID = majorID;
        professorList.add(this);
    }

    public Professor(){

    }

    private int generateUniqueId() {
        int newId = 1;
        while (findById(newId) != null) {
            newId++;
        }
        return newId;
    }

    public static Professor findById(int id) {
        for (Professor professor : professorList) {
            if (professor.id == id) {
                return professor;
            }
        }
        return null;
    }
}