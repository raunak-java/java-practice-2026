class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = new int[3];
        try {
            arr[2]=9;
            arr[5] = 10;
            
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
        System.out.println(arr[2]);

    }
}
