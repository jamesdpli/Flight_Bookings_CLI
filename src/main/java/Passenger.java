public class Passenger {
    private String name;
    private String phoneNumber;
    private String id;

    public Passenger (String name, String phoneNumber, String id){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

//  Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}