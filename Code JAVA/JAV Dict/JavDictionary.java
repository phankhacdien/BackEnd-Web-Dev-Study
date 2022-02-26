import java.util.*;
import java.io.IOException;
import java.nio.file.*;
import java.text.Format;

class JavDictionary
{
    public static void main(String[] arg)
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            Path path = Path.of("data.txt");
            List<String> idol_data_list = Files.readAllLines(path);

            while(true)
            {
                System.out.print("Enter Idol you wanna find: ");
                String search = scanner.nextLine();

                System.out.format("%-15s %-10s %-10s %-10s %-20s\n",
                                "name",
                                "age",
                                "height",
                                "weight",
                                "Status");

                for (String idol_data : idol_data_list)
                {
                    String[] data = idol_data.split(";");
                    Idol idol = new Idol();
                    idol.name = data[0];
                    idol.age = Integer.valueOf(data[1]);
                    idol.height = Double.valueOf(data[2]);
                    idol.weight = Double.valueOf(data[3]);

                    if (idol.name.contains(search))
                    {
                        System.out.format("%-15s %-10s %-10s %-10s %-20s\n",
                                    idol.name,
                                    idol.age,
                                    idol.height,
                                    idol.weight,
                                    idol.Status());
                    }
                }
                System.out.println("-----------------------------------\n");
            }
        }
        catch(IOException e){}
        
    }
};