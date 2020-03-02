package operator;

public enum OperatorType {
    ADD ("Adding numbers: "),
    SUBSTRACT ("Substracting numbers: "),
    MULTIPLY ("Multiplying numbers: "),
    DIVIDE ("Dividing numbers: ");

    private String prefix;

    OperatorType(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }

    @Override
    public String toString() {
        return prefix;
    }
}
