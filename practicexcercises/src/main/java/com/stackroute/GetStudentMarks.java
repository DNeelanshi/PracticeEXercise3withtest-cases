package com.stackroute;

public class GetStudentMarks {

    private int numOfStudents; //instance variable
    private  int [] studentGrades;


    public boolean checkGrades(int numOfStudents, int[] studentGrades){
        this.numOfStudents = numOfStudents;
        this.studentGrades = studentGrades;


        for (int i=0;i<studentGrades.length;i++) {
            if(studentGrades[i] < 0 || studentGrades[i] >100){
                return false;
            }
        }
        return true;
    }

}