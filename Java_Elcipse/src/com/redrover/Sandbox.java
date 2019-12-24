package com.redrover;

import java.io.*;
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) throws IOException {
      /*  BouncingBall bb = new BouncingBall();
        System.out.println(bb.getWeight());
        bb.setWeight(4.0);
        System.out.println(bb.getWeight());


        // static fields are initialized first
        // variable is an instance var
        //Ball.ballWeight = 5.0;
        //System.out.println(Ball.getWeight());

        BouncingBall nb = new BouncingBall(3.0);
        System.out.println(nb.getWeight());
        //System.out.println(Ball.getWeight());
s
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
       */

        boolean type;
        File f1 = new File("useless_text.txt");
        System.out.println("filename: " + f1.getName());
        System.out.println("filename: " + f1.getPath());
        System.out.println("filename: " + f1.getAbsolutePath());
        System.out.println("filename: " + f1.getParent());
        System.out.println(f1.exists()? "exists" : "does not exist");
        System.out.println(f1.canWrite()? "is writeable" : "not writeable");
        System.out.println(f1.canRead()? "is readable" : "not readable");
        System.out.println(f1.isDirectory()? "is a dir" : "not a dir");
        System.out.println("file last modified " + f1.lastModified());
        System.out.println();

        try (FileReader fr = new FileReader("useless_text.txt")){
            int c;
            while((c = fr.read()) != -1) System.out.print((char) c );
            fr.close();


        }catch (IOException e){
            System.out.println("I/O Error: " + e);
        }





    }
}
