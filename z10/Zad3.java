import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zad3{
    public static void main(String[] args){
        try{
            File myObj = new File(args[0]);
            Scanner myReader = new Scanner(myObj);
            ArrayList result = new ArrayList<String>();

            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                result.add(data);
            }
            Collections.sort(result);

            System.out.println(result);
        }
        catch(FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}