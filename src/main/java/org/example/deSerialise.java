package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class deSerialise {


    public static void main(String args[]) throws IOException, ClassNotFoundException {

        FileInputStream input=new FileInputStream("data.txt");
        ObjectInputStream inputData=new ObjectInputStream(input);
        Student obj=(Student) inputData.readObject();
        obj.display();
        input.close();
        inputData.close();
    }
}
