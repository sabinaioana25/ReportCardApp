package com.example.android.reportcardapp;

/**
 * Created by Sabina on 6/1/2017.
 */

public class ReportCard {

    /**
     * ArrayList to store Subjects and their Grades
     */

    //Student's name //
    private String mStudentName;

    //Student's unique ID number //
    private char mStudentID;

    //Mark received at Maths //
    private int mGradeMaths;

    //Mark received at Physics //
    private int mGradePhysics;

    //Mark received at Programming //
    private int mGradeProgramming;

    //Mark received at English //
    private int mGradeEnglish;

    /**
     * The Constructor. Create a new ReportCard object.
     *
     * @param mStudentName      Name of the student
     * @param mStudentID        ID of the student
     * @param mGradeMaths       Maths grade
     * @param mGradePhysics     Physics grade
     * @param mGradeProgramming Programming grade
     * @param mGradeEnglish     Enlgish grade
     */

    public ReportCard(String name, char id, int gradeM, int gradeP, int gradePr, int gradeE) {

        mStudentName = name;
        mStudentID = id;
        mGradeMaths = gradeM;
        mGradePhysics = gradeP;
        mGradeEnglish = gradeE;
    }

    /* ---------getter and setter of student's name---------- */
    public String getStudentName() {
        return mStudentName;
    }

    public void setStudentName(String name) {
        mStudentName = name;
    }

    /* ---------getter and setter of student's id---------- */
    public char getStudentID() {
        return mStudentID;
    }

    public void setStudentID(char id) {
        mStudentID = id;
    }

    /* ---------getter and setter of maths grade---------- */
    public int getGradeMaths() {
        return mGradeMaths;
    }

    public void setGradeMaths(int gradeM) {
        mGradeMaths = gradeM;
    }

    /* ---------getter and setter of physics grade---------- */
    public int getGradePhysics() {
        return mGradePhysics;
    }

    public void setGradePhysics(int gradeP) {
        mGradePhysics = gradeP;
    }

    /* ---------getter and setter of pogramming grade---------- */
    public int getGradeProgramming() {
        return mGradeProgramming;
    }

    public void setGradeProgramming(int gradePr) {
        mGradeProgramming = gradePr;
    }

    /* ---------getter and setter of english grade---------- */
    public int getGradeEnglish() {
        return mGradeEnglish;
    }

    public void setGradeEnglish(int gradeE) {
        mGradeEnglish = gradeE;
    }

    //Return a representation of the ReportCard
    @Override
    public String toString() {
        return "Student Name: " + mStudentName + "\n" +
                "Student ID: " + mStudentName + " " + "\n" +
                "Math: " + mGradeMaths + "\n" +
                "Physics: " + mGradePhysics + "\n" +
                "Programming: " + mGradeProgramming + "\n" +
                "English: " + mGradeEnglish;
    }
}

