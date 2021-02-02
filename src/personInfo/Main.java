package personInfo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonInfo info = new PersonInfo("R", "A", new BigInteger("12435678932"));
        PersonInfo info1 = new PersonInfo("C", "G", new BigInteger("86621549226"));
        PersonInfo info2 = new PersonInfo("E", "Z", new BigInteger("12435678932"));

        List<Object> listas = new ArrayList<>();
        listas.add(info);
        listas.add(info1);
        listas.add(info2);

        System.out.println(listas);
    }
}
