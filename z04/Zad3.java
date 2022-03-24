import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args){
        try{
            File myObj = new File(args[0]);
            Scanner myReader = new Scanner(myObj);
            int result = 0;
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                for(int i=0; i<=data.length() - args[1].length(); i++){
                    if(data.substring(i, i + args[1].length()).equals(args[1]))
                    {
                        result++;
                    }
                }
            }
            System.out.println("Result: " + result);
        }
        catch(FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
