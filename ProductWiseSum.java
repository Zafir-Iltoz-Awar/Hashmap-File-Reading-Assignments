import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class BSCS_EVE_B_SalesTotalHM
{
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Admin\\Downloads\\SalesEVESession.txt");
        Scanner inp;
        String dl;
        HashMap<String,Double> hm = new HashMap<>();
        try
        {
            inp = new Scanner(f1);
            dl = inp.nextLine();
            System.out.println(dl);
            String[] parts;

            String prodName;
            double qty, amt, uPrice;


            while (dl.length() > 0)
            {
                dl = inp.nextLine();
                System.out.println(dl);
                parts = dl.split("\t");
                prodName = parts[1];
                qty = Double.parseDouble(parts[3]);
                uPrice = Double.parseDouble(parts[2]);
                amt = qty * uPrice;
                if (hm.containsKey(prodName))
                {
                    double prevAmt = hm.get(prodName);
                    amt += prevAmt;
                    hm.put(prodName, amt);
                }
                else{
                    hm.put(prodName, amt);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("---------------");
            // for ( Map.Entry<String, Double> entry : hm.entrySet()
        }
        finally
        {
            System.out.println("\nProduct-wise Totals : \n");
            for (Map.Entry<String,Double> me: hm.entrySet()) {
            System.out.println(me.getKey()+"---"+me.getValue());
        }

        }

    }
}