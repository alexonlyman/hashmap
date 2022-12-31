public class Driver {
    private String name;
    private String surname;
    private String license;

    public Driver(String name, String surname, String license) {
        this.name = name;
        this.surname = surname;
        this.license = license;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", license='" + license + '\'' +
                '}';
    }
}

