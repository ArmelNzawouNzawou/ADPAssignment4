package ac.za.cput;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {


  public void Province ()
    {
        List<String> provinces = new ArrayList<>();

        provinces.add("Eastern Cape");
        provinces.add("Free State");
        provinces.add("Gauteng");
        provinces.add("Kwazulu-Natal");
        provinces.add("Limpopo");
        provinces.add("Mpumalanga");
        provinces.add("Northern Cape");
        provinces.add("North West");
        provinces.add("Western Cape");

        for(String p: provinces){
            System.out.println(p);
        }
    }


    public void Race()
    {
        Set<String> race = new HashSet<>();

        race.add("Black");
        race.add("White");
        race.add("Coloured");
        race.add("Indian");
        race.add("Other");

    }

    public void CountryMap(){

        Map<String, String> map = new HashMap<>();
        map.put("WC", "Cape Town");
        map.put("KZN", "Durban");
        map.put("GT", "Johannesburg");


}

}
