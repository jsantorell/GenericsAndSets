package common;

public class Address {

    private String address1;
    private String city;
    private String state;
    private String zipCode;
    private String phone;
    private String email;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Address: " + address1 + " " + city + " " + state + " " + zipCode + " \nPhone: " + phone + " \nEmail: " + email;
    }

    @Override
    public boolean equals(Object o) {

     Address address = (Address)o;
        boolean result = false;
        if(address1.equals(address.getAddress1()) &&  city.equals(address.getCity()) && email.equals(address.getEmail()) && phone.equals(address.getPhone()) && state.equals(address.getState())){
        
        result = true;
        }

        return result;

    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

}
