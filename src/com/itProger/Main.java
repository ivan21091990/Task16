package com.itProger;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("aplana.txt");
            if (!file.exists())
                file.createNewFile();
            FileWriter writer = new FileWriter(file);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст для записи в файл: ");
            String str = scanner.nextLine();

            writer.write(str);
            writer.flush();
            writer.close();

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
