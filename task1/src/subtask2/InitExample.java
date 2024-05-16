package subtask2;

public class InitExample {


    private static int staticValue;
    private int instanceValue;

    public static int getStaticValue() {
        return staticValue;
    }

    public int getInstanceValue() {
        return instanceValue;
    }

    static {
        staticValue = 10;
        System.out.println("Static block executed. staticValue = " + staticValue);
    }

    {
        instanceValue = 5;
        System.out.println("Instance block executed. instanceValue = " + instanceValue);
    }

    public InitExample() {
        System.out.println("Constructor executed.");
    }

}
