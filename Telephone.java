package Contact;

public class Telephone {
    String phoneNum;
    String purpose;

    public Telephone(String phoneNum, String purpose) {
        this.phoneNum = phoneNum;
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Phone Number='" + phoneNum + '\'' +
                ", Purpose='" + purpose + '\'';
    }
}
