package Enum;

public class Main {
    public static void main(String[] args) {
        System.out.println ( MyEnum.OK.getName ( ) );
        System.out.println ( MyEnum.OK );
        MyEnum[] values = MyEnum.values ( );
        for (MyEnum myEnum : values) {
            System.out.println ( myEnum.getName ( ) );
        }
    }
}