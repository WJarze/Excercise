package Enum;

public enum MyEnum {
    OK("ok");
    private final String name;

    private MyEnum(String name) {
        this.name= name;
    }

    public String getName() {
        return name;
    }
}
