package example;

interface New {
    int INT_CONSTANT = 0;

    void instanceMethod1();

    void instanceMethod2();

    static void staticMethod() {
        System.out.println("Interface: static method");
    }

    default void defaultMethod() {
        System.out.println("Interface: default method. Он " +
                "Может быть переписан");
    }

    private void privateMethod() {
        System.out.println("Interface: private метод" + "в интерфейсах возможны");
    }
}
