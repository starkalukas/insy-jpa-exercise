package at.htl.model.customer;

import at.htl.model.person.PersonDTO;
import at.htl.model.sale.SaleDTO;
import at.htl.workloads.customer.Customer;

import java.time.LocalDate;
import java.util.List;

public class CustomerDTO extends PersonDTO {

    private LocalDate dateOfBirth;
    private String place;
    private String street;
    private String zip;
    List<SaleDTO> sales;

    public CustomerDTO(Long id, String firstName, String lastName, LocalDate dateOfBirth, String place, String street, String zip, List<SaleDTO> sales) {
        super(id, firstName, lastName);
        this.dateOfBirth = dateOfBirth;
        this.place = place;
        this.street = street;
        this.zip = zip;
        this.sales = sales;
    }

    public CustomerDTO() {
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public List<SaleDTO> getSales() {
        return sales;
    }

    public void setSales(List<SaleDTO> sales) {
        this.sales = sales;
    }
}
