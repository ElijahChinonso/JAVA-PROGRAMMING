package arrayAndArrayList;

public class StudentGrade1 {
    private String subName;
    private int[][] grades;

    public StudentGrade1(String subName, int[][] grades) {
        this.subName = subName;
        this.grades = grades;
    }

    public void subNames(String subNames) {
        this.subName = subNames;
    }

    public String subName() {
        return subName;
    }

    public void processGrades() {
        outputGrades();

        System.out.printf("%n%s %d%n%s %d%n%n", "Lowest scoring student is: Student 1 scoring", getMinimum(),
                "Highest scoring student is: Student 3 scoring", getMaximum());
        outputBarChart();
    }

    private void outputBarChart(){
        System.out.println("Overall grade distribution:");

        int[] frequency = new int[11];

        for(int[] studentGrades : grades){
            for(int grade : studentGrades) {
                ++frequency[grade / 10];
            }
        }
    }

    public void outputGrades(){
        System.out.printf("The grades are:%n%n");
        System.out.print("                ");

        for(int sub = 0; sub < grades[0].length; sub++){
            System.out.printf("SUB %d  ", sub + 1);
        }
        System.out.println("AVE");

        for (int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d", student +1);

            for(int sub : grades[student]){
                System.out.printf("%8d", sub);
            }

            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }

    public int getMinimum(){
        int lowGrade = grades[0][0];

        for(int[] studentGrade : grades){
            for(int grade : studentGrade){
                if(grade < lowGrade){
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    public int getMaximum(){
        int highGrade = grades[0][0];

        for(int[] studentGrade : grades){
            for(int grade : studentGrade){
                if(grade > highGrade){
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }


    public double getAverage(int[] setOfGrades){
        int total = 0;

        for(int grade : setOfGrades){
            total += grade;
        }
        return (double) total / setOfGrades.length;
    }
}

