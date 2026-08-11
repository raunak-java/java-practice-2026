public class Sum {
    static int sum(int a,int b){
        return(a+b);
    }
    static int sum(float a,float b){
        return(int)(a+b);
    }
    static int sum(int a,int b,int c){
        return(a+b+c);
    }
    static float sum(float a, float b, float c){
        return(a+b+c);
    }
    public static void main(String[] args) {
       System.out.println(sum(14,41));
        System.out.println(sum(4.5f, 9.8f));
        System.out.println(sum(14, 74, 78));
        System.out.println(sum(41.9f, 74.9f, 74.9f));
        
    }
}
