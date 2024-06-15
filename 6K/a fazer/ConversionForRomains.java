public class ConversionForRomains {
    public static String Dod(int n) {
        int[] a = ProcessaNumeros(n);
        for(int i = 0 ; i < a.length ; i++){
            if( i == 0 ){
                //thousands = m
            }
            if( i == 1){
                //hundreds = c
            }
            if( i == 2){
                //dozens = d
            }
            if( i == 3){
                //unities = u
            }
        }
        return "";
    }
    public static int[] ProcessaNumeros(int n){
        int m = 0, c = 0, d = 0, u = 0;

        while (n >= 1000) {
            n -= 1000;
            m++;
        }
        while (n >= 100) {
            n -= 100;
            c++;
        }
        while (n >= 10) {
            n -= 10;
            d++;
        }
        while (n >= 1) {
            n -= 1;
            u++;
        }
        return new int[] {m, c, d, u};
    }
    public static String TranformarEmRomanos(int n){
        
        return "";
    }
    
    public static void main(String[] args) {
        int[] a = ProcessaNumeros(3132);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        
    }
}
