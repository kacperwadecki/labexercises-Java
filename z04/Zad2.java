import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args){
        int counter = 0;
        try{
            File myObj = new File(args[0]);
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                for(int i=0; i<data.length(); i++){
                    if(args[1].equals(data.substring(i, i+1))) counter++;
                }
            }
            System.out.println("Result: " + counter);
        }
        catch(FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        
        }
    }
