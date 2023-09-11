import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        Months months = new Months();

        Set<String> key = months.getKey();
        System.out.println("Key : " + key);

        List<Integer> cardinalMonth = months.getCardinalMonthList();

        Integer[] cardinalMonthArray = months.getCardinalMonthArray();

        System.out.println("Int Array : " + Arrays.toString(cardinalMonthArray));

        System.out.println("List of int : " + cardinalMonth);



    }
}
