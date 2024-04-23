package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {

public static void main(String args[]) throws IOException {

    Student obj=new Student("Shubham","shubham@gmail.com","lucknow",21);
    FileOutputStream file=new FileOutputStream("data.txt");
    ObjectOutputStream out=new ObjectOutputStream(file);
    out.writeObject(obj);
    System.out.println("Object serialized successfully.");
    out.close();
    file.close();

}
}
