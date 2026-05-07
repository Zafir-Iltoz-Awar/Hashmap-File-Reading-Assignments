import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SalesIDTotal
{
    public static void main(String[] args)
    {
        File f1 = new File("C:\\Users\\Admin\\Downloads\\SalesEVESession.txt");
        Scanner inp;
        String dl;
        HashMap<String,Double> hm = new HashMap<>();

        try
        {
            inp = new Scanner(f1);
            dl = inp.nextLine(); // heading
            System.out.println(dl);
            String[] parts;
            String repID;
            double qty, amt, uPrice;

            while (inp.hasNextLine())
            {
                dl = inp.nextLine();
            System.out.println(dl);
                parts = dl.split("\t");
                repID = parts[5];
                qty = Double.parseDouble(parts[3]);
                uPrice = Double.parseDouble(parts[2]);
                amt = qty * uPrice;

                if (hm.containsKey(repID))
                {
                    double prevAmt = hm.get(repID);
                    amt += prevAmt;
                    hm.put(repID, amt);
                }
                else
                {
                    hm.put(repID, amt);
                }
            }
        }

        catch(Exception e)
        {
            System.out.println("Error");
        }

        finally
        {
            System.out.println("\nID-wise Totals:\n");
            for (Map.Entry<String,Double> me : hm.entrySet())
            {
                System.out.println(me.getKey()+" --- "+me.getValue());
            }
        }
    }
}