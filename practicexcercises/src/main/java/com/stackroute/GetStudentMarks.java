package com.stackroute;

public class GetStudentMarks {

    private int numOfStudents; //instance variable
    private  int [] studentGrades;

//check grades of students
    public boolean checkGrades(int numOfStudents, int[] studentGrades){
        this.numOfStudents = numOfStudents;
        this.studentGrades = studentGrades;

//check if student grades are within renge or not
        for (int i=0;i<studentGrades.length;i++) {
            if(studentGrades[i] < 0 || studentGrades[i] >100){
                return false;
            }
        }
        return true;
    }

}