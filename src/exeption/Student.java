package exeption;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String name;
    private String lastName;
    private int score;
    private ArrayList<Integer> ocjene;

    public Student(String name, String lastName, int score) {
        this.name = name;
        this.lastName = lastName;
        this.score = score;
    }

    public ArrayList<Integer> getOcjene() {
        return ocjene;
    }

    public void setOcjene(ArrayList<Integer> ocjene) {
        this.ocjene = ocjene;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getScore() == student.getScore() && Objects.equals(getName(), student.getName()) && Objects.equals(getLastName(), student.getLastName()) && Objects.equals(getOcjene(), student.getOcjene());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastName(), getScore(), getOcjene());
    }

    @Override
    public String toString() {
        return name + " " + lastName + " " + score;
    }

}
