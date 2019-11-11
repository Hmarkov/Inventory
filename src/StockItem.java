public class StockItem implements Comparable<StockItem>{

    private String C_type,S_code;
    private double S_qty;
    private int price;
//    private String fieldfour;
    //Constructor
    public StockItem(){
        C_type=null;
        S_code=null;
        S_qty=0;
        price=0;
//        fieldfour=null;



    }


    public StockItem(String C_type, String S_code, double S_qty, int price){
        this.C_type=C_type;
        this.S_code=S_code;
        this.S_qty=S_qty;
        this.price=price;
//        this.fieldfour=fieldfour;

    }

    public String getC_type() {
        return C_type;
    }
    public void setC_type(String C_type) {
        this.C_type = C_type;
    }
    public String getS_code() {
        return S_code;
    }
    public void setS_code(String S_code) {
        this.S_code = S_code;
    }

    public double getS_qty() {
        return S_qty;
    }
    public void setS_qty(int S_qty) {
        this.S_qty = S_qty;
    }
    public int getprice() {
        return price;
    }



    public int compareTo(StockItem compitem) {
       int compprice = ((StockItem) compitem).getprice();
        /* For Ascending order*/
        return this.getprice() - compprice;
    }
    //To String
    public String toString(){
        return "\n|Component Type:"+C_type+"|"+"Stock Code:"
                +S_code+"|"+"Stock Quantity:"+S_qty+"|"+"Price:"+price+"|";

    }

//    public String getFieldfour() {
//        return fieldfour;
//    }
//
//    public void setFieldfour(String fieldfour) {
//        this.fieldfour = fieldfour;
//    }



}
