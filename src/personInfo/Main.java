package personInfo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hashmap");
        mapTest(new HashMap<>());
        System.out.println("Treemap");
        mapTest(new TreeMap<>());
        System.out.println("Treemap w/ List");
        mapTest2(new TreeMap<>());
    }

    static void mapTest(Map<String, PersonInfo> people){
        PersonInfo info = new PersonInfo("R", "A", "123");
        people.put(info.getSocialSecurity(), info);
        people.put("234", new PersonInfo("C", "G", "234"));
        people.put("123", new PersonInfo("E", "Z", "123"));

        for (PersonInfo i : people.values()){
            System.out.println(i.getSocialSecurity() + " " + i.getFirstName() + " " + i.getLastName());
        }
    }
    static void mapTest2(Map<String, List<PersonInfo>> people){
        PersonInfo info = new PersonInfo("R", "A", "123");

        addMapTest2(people, info);
        addMapTest2(people, new PersonInfo("C", "G", "234"));
        addMapTest2(people, new PersonInfo("E", "Z", "123"));

        for (List<PersonInfo> i : people.values()){
            System.out.println(i.size() + ": ");
            for (PersonInfo p : i){
                System.out.println(p.getSocialSecurity() + " " + p.getFirstName() + " " + p.getLastName());
            }
        }
    }

    static void addMapTest2(Map<String, List<PersonInfo>> people, PersonInfo p){
        String socialSecurity = p.getSocialSecurity();

        if(!people.containsKey(socialSecurity)){
            List<PersonInfo> peopleWithSS = new ArrayList<>();
            peopleWithSS.add(p);
            people.put(socialSecurity, peopleWithSS);
        } else {
            List<PersonInfo> peopleWithSS = people.get(socialSecurity);
            peopleWithSS.add(p);
        }
    }
}
