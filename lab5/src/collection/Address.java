package collection;

public class Address {
    private String zipCode; //Длина строки должна быть не меньше 3, Поле может быть null

    public Address(String zipCode){
        this.zipCode = zipCode;
    }

    @Override
    public String toString(){
        return zipCode;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getZipCode(){
        return zipCode;
    }



}
