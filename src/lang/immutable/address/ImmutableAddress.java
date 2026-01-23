package lang.immutable.address;

public class ImmutableAddress {
    private final String value;

    public ImmutableAddress(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    // set X

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
