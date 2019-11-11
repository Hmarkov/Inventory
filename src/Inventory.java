import java.io.Serializable;
import java.util.*;
import java.util.HashSet;
import java.io.Serializable;
import java.io.FileReader;
import java.lang.Math;
public class Inventory {

    //Create Container
    private ArrayList<StockItem> items;

    //constructor
    public Inventory() {
        items = new ArrayList<StockItem>();
    }

    //
    //Methods
    //Load data from inventory.txt and create StockItem object
    public void ReadDatafromFile(String filename) {
        try {
            Scanner sc = new Scanner(new FileReader(filename));
            String line;
            StockItem item;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] result = line.trim().split("\\s*,+\\s*,*\\s*");

                String C_type = (result[0]);
                String S_code = (result[1]);
                Double S_qty = Double.parseDouble(result[2]);
                int price = Integer.parseInt(result[3]);
//                String fieldfour=(result[4]);


                item = new StockItem(C_type, S_code, S_qty, price);
                items.add(item);


            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }


    public int getnumberofitems() {
        return items.size();
    }


    //Print a list of the inventory, sorted in order of increasing price.
    public void SortedListByPrice(){
       Collections.sort(items);
       for (StockItem i:items)
       {
           System.out.println(i);
       }
}
    //What is the component with the largest number of components in stock?
   public StockItem LargestNumComp(){
        StockItem highest=items.get(2);
        for(StockItem item:items){
            if(item.getS_qty()>highest.getS_qty())
            {
                highest=item;
            }
        }
       return highest;
    }
    //How many NPN transistors does Chartlins have in stock? num3

//    //What is the total resistance of all of the resistors in stock?
//    public Double TotResistorResistance(){
//        StockItem component=items.get(0);
//        StockItem resistance=items.get(4);
//        double total=0.0;
//
//        for(StockItem item:items){
//            if(item.getC_type()=="resistor")
//            {
//
//                double d=Double.parseDouble(item.getFieldfour());
//                total=d-total;
//            }
//        }
//       return total;
//    }
//    //How many stock items have unit prices above 10p?
   public double SunitOver10p(){
      double over10=0;
       for(StockItem item:items){
           if(item.getprice()>=10.0)
           {
               over10=over10++;
           }
       }
       return over10;
   }

}
