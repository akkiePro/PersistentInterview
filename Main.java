/**
 * Java - Coding Test
 * Maximize Profit.
 * Cost Price of 1 Stock from Day-1 to Day-7 is as follows,
 * Input: 6, 4, 2, 4, 3, 20, 1
 * Output: Day-3 & Day-6
 */
class Main {
    public static void main(String[] args) {
        int []input = {6, 4, 2, 4, 3, 20, 1};
        int []result = maximumProfit(input);
        for (int num: result) {
            System.out.println("Day-" + num);
        }
    }

    static int[] maximumProfit(int []stockPricePerDayOfAWeek) {
        int min = stockPricePerDayOfAWeek[0];
        int max = 0;
        int dayBuy = 0;
        int daySell = 0;
        int []result = {0,0};

        for (int i=0; i<stockPricePerDayOfAWeek.length-1; i++) {
            if(stockPricePerDayOfAWeek[i] < min) {
                min = stockPricePerDayOfAWeek[i];
                dayBuy = i+1;
            }
            if(stockPricePerDayOfAWeek[i] > max) {
                max = stockPricePerDayOfAWeek[i];
                daySell = i+1;
            }
        }

        result[0] = dayBuy;
        result[1] = daySell;

        return result;
    }
}
