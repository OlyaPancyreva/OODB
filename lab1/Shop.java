public class Shop {
    private String name;
    private String address;
    private String hours;

    Shop(String name, String address, String hours) {
        this.name = name;
        this.address = address;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

