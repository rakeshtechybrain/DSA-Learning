public class BuySellStockWithCollDown {


    public int maxPtofit(int [] price){

        int sold=Integer.MIN_VALUE;
        int held=Integer.MIN_VALUE;
        int reset=0;

        for(int p:price){

            int prevSold=sold;
            sold=held+p;
            held=Math.max(held,reset-p);
            reset=Math.max(reset,prevSold);

        }

    return Math.max(reset,sold);


    }
}
