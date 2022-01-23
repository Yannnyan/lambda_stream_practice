import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;


public class lambda {


    
    public static void main(String[] args){


        ArrayList<mypoint> points = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            points.add( new mypoint(i,i) );
        }
        File file = new File("MyFile.txt");
        try{
            FileWriter fileWriter = new FileWriter(file);
            points.stream().forEach((point) -> {
                try {
                    fileWriter.write(point.toString() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            fileWriter.append("\n");
            points.stream().filter((point -> (point.x % 3 == 2))).collect(Collectors.toList()).
                    forEach((point -> {
                        try{
                        fileWriter.append(point.toString() + "\n");
                    }
                    catch (IOException e){
                        e.printStackTrace();
                    }
                    }));

            points.stream().sorted().collect(Collectors.toList()).forEach((point)->{System.out.println(point.toString());});
            fileWriter.close();
        }
        catch (IOException e){

        }
        Consumer func = (y) -> {System.out.println("Hello world");};
        func.accept(null);
        System.out.println(func.toString());


    }



}
