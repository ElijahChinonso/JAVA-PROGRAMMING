package arrayAndArrayList;

public class StudentGradeTest1 {
    public static void main(String[] args) {
        int[][] gradesArray= {{23, 12, 34}, {13, 67, 12}, {99, 98, 100}};

        StudentGrade1 myStudentGrade = new StudentGrade1("Java Programming",gradesArray);
        System.out.printf("Pamphlet of Student record for%n%s%n%n", myStudentGrade.subName());
        myStudentGrade.processGrades();
    }
}
