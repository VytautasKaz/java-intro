package readCSV;

import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        if (args.length != 1){
            System.err.println("Invalid amount of arguments.");
        }
        ICompanyService companyService = new CompanyService();

        List<Company> companies = companyService.read(args[0]);

        companies.forEach(company -> {
            System.out.println(company.getId() + ". " + company.getDate() + " | " + company.getName() +
                    " | " + company.getQuantity() + " | " + company.getPrice());
        });
    }
}
