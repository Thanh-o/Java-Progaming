package Java2PracticalTest.Entity;

public class Contact {
    public int contact_id;
    String name;
    public String company;
    public String email;
    public int phone;

    public Contact(int contact_id, String name, String company, String email, int phone) {
        this.contact_id = contact_id;
        this.name = name;
        this.company = company;
        this.email = email;
        this.phone = phone;
    }

    public int getContact_id() {
        return contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contact_id=" + contact_id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}

