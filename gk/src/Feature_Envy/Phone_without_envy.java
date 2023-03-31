package Feature_Envy;

public class Phone_without_envy {
    public class Phone {
        private final String unformattedNumber;
        public Phone(String unformattedNumber) {
            this.unformattedNumber = unformattedNumber;
        }
        private String getAreaCode() {
            return unformattedNumber.substring(0,3);
        }
        private String getPrefix() {
            return unformattedNumber.substring(3,6);
        }
        private String getNumber() {
            return unformattedNumber.substring(6,10);
        }
        public String toFormattedString() {
            return "(%s) %s-%s".formatted(getAreaCode(), getPrefix(), getNumber());
        }
    }
    public class Customer {
        private Phone mobilePhone;
        public String getMobilePhoneNumber() {
            return mobilePhone.toFormattedString();
        }
    }
}
