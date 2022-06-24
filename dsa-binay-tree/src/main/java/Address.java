public class Address {



    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistisct() {
        return distisct;
    }

    public void setDistisct(String distisct) {
        this.distisct = distisct;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Address(String country, String state, String distisct, String town, int pincode) {
        this.country = country;
        this.state = state;
        this.distisct = distisct;
        this.town = town;
        this.pincode = pincode;
    }

    private String country;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", distisct='" + distisct + '\'' +
                ", town='" + town + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    private String state;
    private String distisct;
    private String town;
    private int pincode;

}
