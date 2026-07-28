class Test {
    static void check(int age) throws ArithmeticException {
        if(age < 18) {
            throw new ArithmeticException("Not eligible");
        }
    }

    public static void main(String[] args) {
        try {
            check(17);
        } 
        catch (ArithmeticException e) {
            System.out.println("Handled");
        }
    }
}
