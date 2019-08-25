package com.itProger;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("aplana.txt"));

            String  textOutput;
            while ((textOutput = br.readLine()) != null){
                System.out.println(textOutput);
            }
        } catch (IOException ex){
            System.out.print("Error" + ex);
        }
    }
}
