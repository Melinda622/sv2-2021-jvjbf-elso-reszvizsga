package cars;

public enum Color {
    RED("red"), BLACK("black"), BLUE("blue"), GREY("grey");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
