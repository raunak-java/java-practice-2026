class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } 
        catch (Exception e) {
            System.out.println("Handled");
        } 
        finally {
            System.out.println("Finally block always executes");
        }
    }
}
