package com.example.demo;
import javax.swing.JFrame;
import java.awt.Color;

public class StudentFormTest {
    public static void main(String[] args) {
        StudentInfo studentForm = new StudentInfo();
        studentForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentForm.setSize(700, 400);
        studentForm.setVisible(true);

    }
}