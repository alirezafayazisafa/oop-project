package base;

import java.util.ArrayList;

public class Major {
    private static int nextId = 1;
    public static ArrayList<Major> majorList = new ArrayList<>();
    public String fieldName;
    private int capacity;
    private int numberOfStudents;
    public final int id;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Major(String fieldName, int capacity) {
        this.fieldName = fieldName;
        this.capacity = capacity;
        this.id = nextId++;
        majorList.add(this);
    }

    public int generateId() {
        int newId = 1; // Start with ID 1
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

    public void addStudent() {
        if (numberOfStudents < capacity) {
            numberOfStudents++;
        } else {
            System.out.println("Error: Maximum capacity reached for " + fieldName);
        }
    }
}