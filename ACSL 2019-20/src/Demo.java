import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args){
        List<String> cityNames = new ArrayList<String>();
        List<String> indiaNames = new ArrayList<String>();
        List<String> combined = new ArrayList<String>();
        Iterator<String> i = cityNames.iterator();
        cityNames.add("Herndon");
        cityNames.add("Reston");
        cityNames.add("Fairfax");
        cityNames.add("Houston");
        cityNames.add("Miami");
        cityNames.add("New York");
        cityNames.add("San Francisco");
        cityNames.add("Chicago");
        cityNames.add("Los Angeles");
        cityNames.add("Boston");
        indiaNames.add("New Delhi");
        indiaNames.add("New Delhi");
        indiaNames.add("Hyderabad");
        indiaNames.add("Mumbai");
        indiaNames.add("Agra");
        indiaNames.add("Nalagonda");
        for(int j = 0; j < cityNames.size(); j++){
            combined.add(cityNames.get(j));
        }
    }
}
