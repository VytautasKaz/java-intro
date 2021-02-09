package readCSV;

import java.util.List;

public interface ICompanyService {
    List<Company> read(String filename);
}
