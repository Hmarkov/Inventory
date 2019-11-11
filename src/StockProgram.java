import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.util.Scanner;

public class StockProgram {
    public static void main(String[] args) throws IOException {
        Inventory inv=new Inventory();
        inv.ReadDatafromFile("C:/Users/Markov/IdeaProjects/Inventory_Project/src/Inventory.txt");
        System.out.println("Number Of Components in stock"+inv.getnumberofitems());

        //constructor

        //Read File Data


        //Queries
        //Print a list of the inventory, sorted in order of increasing price.
  //     inv.SortedListByPrice();
        //What is the component with the largest number of components in stock?
   //     System.out.println("Component with largest number of components in stock :"+inv.LargestNumComp());
        //How many NPN transistors does Chartlins have in stock? num3

        //What is the total resistance of all of the resistors in stock?
        //System.out.println(inv.TotResistorResistance());
        //How many stock items have unit prices above 10p?
        System.out.println(inv.SunitOver10p());


    }
}
