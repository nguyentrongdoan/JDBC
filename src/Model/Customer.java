package Model;

public class Customer {
    private int Id;
    private String name;
    private String phone;
    private String email;

    public Customer() {
    }

    public Customer(int id, String name, String phone, String email) {
        Id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
