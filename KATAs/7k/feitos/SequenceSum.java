
public class SequenceSum {
        

    public static Integer decideSinal(int n){
        int m = 0;
        if (n >= 0){
            m = 1;
        }else if(n < 0){
            m = -1;
        }
        return m;
    }

    public static int[] sumOfN(int n) {
        int v = decideSinal(n);
        int k =0;
        int p = 0;
        int r = 0;
        if (v == 1){
            k = n;
        }else{
            k = n*v;
        }
        for (int i= 1 ; i<k;i++){
            p = p + i;
            r = p*v;
        }
        return new int[r];
    }
    
/**gpt sugestion
 * public class SequenceSum {
        
        public static Integer decideSinal(int n) {
            int m = 0;
            if (n >= 0) {
                m = 1;
            } else if (n < 0) {
                m = -1;
            }
            return m;
        }
    
        public static int[] sumOfN(int n) {
            int v = decideSinal(n);
            int k = 0;
            int p = 0;
            int[] result;
    
            if (v == 1 || v == 0) {
                k = n;
            } else {
                k = n * v;
            }
    
            // Ajuste do comprimento do array de retorno
            result = new int[Math.abs(k) + 1]; 
    
            for (int i = 0; i <= Math.abs(k); i++) {
                p = p + i;
                result[i] = p * v;
            }
            
            return result;
        }
    }
**/    

    public static void main(String[] args) {
        
    }
    }

