public class Visitor extends Person {

    private String membershipID;
    private String membershipType;

    public Visitor(String name) {
        super.setName(name);
    }

    public Visitor() {
        super();
        this.membershipID = "Unknown";
        this.membershipType = "Unknown";
    }

    public Visitor(String name, String address, int age, String membershipID, String membershipType) {
        super(name, address, age);
        this.membershipID = membershipID;
        this.membershipType = membershipType;
    }

    public String getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(String membershipID) {
        this.membershipID = membershipID;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}
