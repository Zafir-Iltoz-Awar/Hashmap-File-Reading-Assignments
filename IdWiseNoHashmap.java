import java.io.File;
import java.util.Scanner;

class IdWiseNoHashmap{
    public static void main(String[] args)
    {
        try
        {
            File f = new File("C:\\Users\\Admin\\Downloads\\SalesEVESession.txt");
            Scanner inp = new Scanner(f);

            inp.nextLine();

            double totalE011 = 0;
            double totalE012 = 0;
            double totalE013 = 0;
            double totalE014 = 0;

            while(inp.hasNextLine())
            {
                String line = inp.nextLine();

                String parts[] = line.split("\t");

                double price = Double.parseDouble(parts[2]);
                double qty = Double.parseDouble(parts[3]);

                String repID = parts[5];

                double amount = price * qty;

                if(repID.equals("E011"))
                    totalE011 += amount;

                else if(repID.equals("E012"))
                    totalE012 += amount;

                else if(repID.equals("E013"))
                    totalE013 += amount;

                else if(repID.equals("E014"))
                    totalE014 += amount;
            }
            System.out.println("\nId-wise Totals : ");
            System.out.println("\nE011 Total = " + totalE011);
            System.out.println("\nE012 Total = " + totalE012);
            System.out.println("\nE013 Total = " + totalE013);
            System.out.println("\nE014 Total = " + totalE014);

            inp.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Occured");
        }
    }
}