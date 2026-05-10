import java.io.File;
import java.util.Scanner;

class ProductWiseNoHashmap{
    public static void main(String[] args)
    {
        try
        {
            File f = new File("C:\\Users\\Admin\\Downloads\\SalesEVESession.txt");
            Scanner inp = new Scanner(f);

            inp.nextLine();

            double totalA = 0;
            double totalB = 0;
            double totalC = 0;
            double totalD = 0;

            while(inp.hasNextLine())
            {
                String line = inp.nextLine();

                String parts[] = line.split("\t");

                String product = parts[0];
                double price = Double.parseDouble(parts[2]);
                double qty = Double.parseDouble(parts[3]);

                double amount = price * qty;

                if(product.equals("A"))
                    totalA += amount;
                else if(product.equals("B"))
                    totalB += amount;
                else if(product.equals("C"))
                    totalC += amount;
                else if(product.equals("D"))
                    totalD += amount;
            }
            System.out.println("\nProduct-wise Totals : ");
            System.out.println("\nProduct A Total = " + totalA);
            System.out.println("\nProduct B Total = " + totalB);
            System.out.println("\nProduct C Total = " + totalC);
            System.out.println("\nProduct D Total = " + totalD);

            inp.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Occured");
        }
    }
}