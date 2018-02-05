package ooplab9;

public class person {
    private String name;
    private String personid;
    private Address address;
    private Job job;

    public person(String name, String personid, Address address, Job job) {
        this.name = name;
        this.personid = personid;
        this.address = address;
        this.job = job;
    }
    //setter to String

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", personid='" + personid + '\'' +
                ", address=" + address +
                ", job=" + job +
                '}';
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}//class
