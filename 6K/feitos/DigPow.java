import java.util.Arrays;

public class DigPow {
	
	public static long digPow(int n, int p) {
        Integer[] a = SepararNumeros(n);
            int b = a.length;
            long t = 0;
        
            for (int i = 0; i < b; i++) {
                t += Math.pow(a[i], p);
                p++;
            }
            if (t % n == 0) {
                return t / n;
            } else{ return -1;}
    }
            
    public static Integer[] SepararNumeros(Integer i){
        String a = i.toString() ;
        Integer b[] = new Integer[a.length()];
        
        for(int j=0;j< a.length() ; j++){
            b[j] = Character.getNumericValue(a.charAt(j));
        }
    return b;
    }
        
    

    public static void main(String[] args) {
        Integer[] resultado = SepararNumeros(121233300);
        System.out.println(Arrays.toString(resultado));
        
    }
}
