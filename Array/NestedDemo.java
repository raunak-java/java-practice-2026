class NestedDemo {
    public static void main(String[] args) {
        try {
            try {
                int a = 10/0;
            } 
            catch (ArithmeticException e) {
                System.out.println("Inner catch");
            }

            int arr[] = new int[5];
            arr[10] = 50;
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch");
        }
    }
}
