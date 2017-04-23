package common;

public class Employee {
    private String lastName;
    private String firstName;
    private String ssn;
    private Address address;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Last Name: " + lastName + " \nFirst Name: " + firstName + " \nSSN: " + ssn + " \nAddress: " + address;
    }

    @Override
    public boolean equals(Object o) {

     Employee e = (Employee)o;
        boolean result = false;
        if(lastName.equals(e.getLastName()) &&  firstName.equals(e.getFirstName()) && ssn.equals(e.getSsn()) && address.equals(e.getAddress())){
        
        result = true;
        }

        return result;

    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
