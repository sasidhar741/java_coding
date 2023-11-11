package enums;

 enum Designation {
    developer(2), tester(3), designer(1);
    private int value;
    Designation(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}

public class  Main {
    public static void main(String[] args) {
        for (Designation designation: Designation.values()) {
            System.out.println(designation +  ": " + designation.getValue());
        }
    }
}
