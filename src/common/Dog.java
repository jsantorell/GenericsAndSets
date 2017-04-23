package common;

public class Dog {
    private String name;
    private int rabiesId;

    public Dog() {
    }

    public Dog(String name, int rabiesId) {
        this.name = name;
        this.rabiesId = rabiesId;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(int rabiesId) {
        this.rabiesId = rabiesId;
    }

        @Override
    public String toString() {
        return "Name: " + name + " \nRabiesID: " + rabiesId;
    }

    @Override
    public boolean equals(Object o) {

     Dog dog = (Dog)o;
        boolean result = false;
        if(name.equals(dog.getName()) &&  rabiesId == dog.getRabiesId()){
        
        result = true;
        }

        return result;

    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

}
