import java.util.*;
import java.util.Stack;

public class Online_Stock_Span {
    class StockSpanner {
        Stack<Integer> prices;
        Stack<Integer> weights;
        public StockSpanner() {
            prices = new Stack<>();
            weights = new Stack<>();
        }

        public int next(int price) {
            int w =1;
            while(!prices.isEmpty() && prices.peek()<=price){
                w+=weights.pop();
                prices.pop();
            }
            prices.push(price);
            weights.push(w);
            return w;
        }
    }


}
