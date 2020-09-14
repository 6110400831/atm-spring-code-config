package th.ac.ku.atm;

import java.util.HashMap;
import java.util.Map;

public class DataSourceWebAPI implements DataSource {
    @Override
    public Map<Integer, Customer> readCustomers() {
        Map<Integer, Customer> customerMap = new HashMap<>();

        customerMap.put(1, new Customer(1, "ขวัญ", 1234, 1000));
        customerMap.put(2, new Customer(2, "พลอย", 2345, 2000));
        customerMap.put(3, new Customer(3, "ฝน", 3456, 3000));

        return  customerMap;
    }
} 
