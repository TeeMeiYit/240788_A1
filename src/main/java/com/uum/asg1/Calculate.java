//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment 1
//Matrik: #240788
//Name: #Tee Mei Yit
package com.uum.asg1;

import static com.uum.asg1.CountFiles.CountFiles;
import static com.uum.asg1.CountIssue.CountIssue;
import java.io.File;
import java.io.IOException;

public class Calculate {

    static String filename = "test";
    static String workingDirectory = System.getProperty("user.dir");
    static String absoluteFilePath = workingDirectory + File.separator + filename;
    static File directory = new File(absoluteFilePath);
    static File[] files = directory.listFiles();

    public static void main(String[] args) throws IOException {

        CountFiles();
        CountIssue();

    }
}
