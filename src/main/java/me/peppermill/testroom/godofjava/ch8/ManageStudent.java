package me.peppermill.testroom.godofjava.ch8;


public class ManageStudent {

    public static void main(String[] args) {
        Student[] students = null;
        ManageStudent manageStudent = new ManageStudent();
        students = manageStudent.addStudent();
        manageStudent.printStudents(students);
    }

    private void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul", "010xxxxxxx", "adaf@dfad.com");
        return students;
    }
}
