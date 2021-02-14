package JSON_demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JSONDemo {
    public static void main(String[] args) throws JsonProcessingException {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Microsoft",
                new BigDecimal(123123.35),
                new Address("NY-1111", "New York")));
        companies.add(new Company("Google",
                new BigDecimal(321321.45),
                new Address("LT-54123", "Kaunas")));

        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.enable(SerializationFeature.INDENT_OUTPUT).writeValueAsString(companies);

        System.out.println(json);
    }
}

class Company {
    private String name;
    private BigDecimal debt;
    private Address address;

    public Company(String name, BigDecimal debt, Address address) {
        this.name = name;
        this.debt = debt;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(BigDecimal debt) {
        this.debt = debt;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

class Address {
    private String index;
    private String city;

    public Address(String index, String city) {
        this.index = index;
        this.city = city;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
