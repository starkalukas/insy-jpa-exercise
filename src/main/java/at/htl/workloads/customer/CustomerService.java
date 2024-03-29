package at.htl.workloads.customer;

import at.htl.model.customer.CustomerDTO;

import java.util.List;

public interface CustomerService {
    Customer getCustomerById(Long id);

    boolean addCustomer(CustomerDTO newCustomer);

    List<Customer> getAllCustomers();

    double getTotalExpensesOfCustomer(Long id);
}
