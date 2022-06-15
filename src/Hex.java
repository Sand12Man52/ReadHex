import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hex 
{
    public static void main(String[] args) throws Exception 
    {
        try 
        {
            File hox = new File("./ReadIt.txt");
            Scanner sc = new Scanner(hox);
            while(sc.hasNextLine()) 
            { 
             System.out.println(sc.nextLine());
            }    
        } catch (Exception e) 
        {
            //TODO: handle exception
            e.printStackTrace();
        }
        
    }
}
