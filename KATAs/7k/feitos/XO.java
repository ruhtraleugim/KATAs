public class XO {
    
    public static boolean getXO (String str) {
        int o = 0;
        int x = 0;
        Integer f = str.length();
        for(int i = 0; i<f ; i++){
            char cha = str.charAt(i);
            if (cha == 'x'||cha =='X'){
                x++;
            }else if (cha == 'o'||cha =='O'){
                o++;
            }
        }
        return x == o;
        
    }
        public static void main(String[] args) {
            System.out.println(getXO("xxoqwerqwero")); // true
            System.out.println(getXO("xxoooqwerqwer")); // false
            System.out.println(getXO("xxOo")); // true
    }
}
