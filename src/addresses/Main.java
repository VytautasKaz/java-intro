package addresses;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        cityCount(new HashMap<>());
    }
    static void cityCount(Map<String, List<Address>> addressMap){
        Address a1 = new Address("Kaunas", "Laisves al.");
        cityCounter(addressMap, a1);
        cityCounter(addressMap, new Address("Vilnius", "Gedimino pr."));
        cityCounter(addressMap, new Address("Kaunas", "Baltu pr."));
        cityCounter(addressMap, new Address("Siauliai", "Random g."));
        cityCounter(addressMap, new Address("Palanga", "Palangos g."));
        cityCounter(addressMap, new Address("Siauliai", "Siauliu g."));

        for (List<Address> addressList : addressMap.values()) {
            System.out.println(addressList.size() + ":");
            for (Address addr : addressList) {
                System.out.println("City: " + addr.getCity() + ", Street: " + addr.getStreet());
            }
        }
    }
    static void cityCounter (Map<String, List<Address>> addressMap, Address a){
        String city = a.getCity();
        if(!addressMap.containsKey(city)){
            List<Address> cities = new ArrayList<>();
            cities.add(a);
            addressMap.put(city, cities);
        } else {
            List<Address> cities = addressMap.get(city);
            cities.add(a);
        }
    }
}
