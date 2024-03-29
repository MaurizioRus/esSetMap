/*Define a testing class with a main() method where you:

create a Map called months where the key is the name of the month and value is the cardinal number of the month
populate the Map, being sure to preserve the insertion order
obtain and print a Set view of the keys that are in months using a specific Map method
then convert months using a Collection of integers:
into a List (and print it) of integers called cardinalMonth where you insert all the values of the Map
into an array (and print it) of integers called cardinalMonthArray where you insert all the values of the Map

 */


import java.util.*;

public class Months {

    Map<String, Integer> months = new HashMap<>();

    public Months() {

        months = new LinkedHashMap<>();
        months.put("Gennaio", 1);
        months.put("Febbraio", 2);
        months.put("Marzo", 3);
        months.put("Aprile", 4);
        months.put("Maggio", 5);
        months.put("Giugno", 6);
        months.put("Luglio", 7);
        months.put("Agosto", 8);
        months.put("Settembre", 9);
        months.put("Ottobre", 10);
        months.put("Novembre", 11);
        months.put("Dicembre", 12);
    }

    public Set<String> getKey() {
        return months.keySet();
    }

    public List<Integer> getCardinalMonthList() {
        return new ArrayList<>(months.values());
    }

    public Integer[] getCardinalMonthArray() {
        return months.values().toArray(new Integer[0]);
    }
}
