//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment 1
//Matrik: #240788
//Name: #Tee Mei Yit
package com.uum.asg1;

import static com.uum.asg1.Calculate.absoluteFilePath;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CountIssue {

    static int issue;
    static ArrayList javafile = new ArrayList();
    static String readLine;

    static void CountIssue() throws FileNotFoundException, IOException {

        for (int i = 0; i < javafile.size(); i++) {
            absoluteFilePath = javafile.get(i).toString();
            BufferedReader br = new BufferedReader(new FileReader(absoluteFilePath));
            while ((readLine = br.readLine()) != null) {
                if (readLine.contains("public static void main")) {
                    issue++;
                }
            }
        }
        System.out.println("Number of Issue = " + issue);
    }

}

