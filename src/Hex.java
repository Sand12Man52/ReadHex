import java.nio.file.Files;
import java.nio.file.Paths;

public class Hex 
{
    public static void main(String[] args) throws Exception 
    {
        try 
        {
            Files.readAllBytes(Paths.get("./ReadIt"));
            byte[] hexData = Files.readAllBytes(Paths.get("./ReadIt"));
            for (int i = 0; i < hexData.length; i++) 
            {
               System.out.printf("%x  ",hexData[i]); 
            }
        } catch (Exception e) 
        {
            //TODO: handle exception
            e.printStackTrace();
        }
        
    }
}
