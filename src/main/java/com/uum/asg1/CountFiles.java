//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment 1
//Matrik: #240788
//Name: #Tee Mei Yit
package com.uum.asg1;

import static com.uum.asg1.Calculate.files;
import static com.uum.asg1.CountIssue.javafile;
import java.io.File;

public class CountFiles {

    static int java = 0;

    static void CountFiles() {

        for (File fileName : files) {
            if (fileName.getName().endsWith(".java")) {
                java++;
                javafile.add(fileName.getAbsolutePath());
            }
        }
        System.out.println("Number of Java files: " + java);
    }
}
