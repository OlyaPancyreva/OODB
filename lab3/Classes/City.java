package Classes;

public class City {

    String city;
    String address;
    String hours;

    public City(){

    }

    public City(String city, String address, String hours){
        this.city = city;
        this.address = address;
        this.hours = hours;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }


}
