public class Multiples_of_3_or_5 {
    public int solution(int number) {
        int a = 0;
        
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                a += i;
            }
        }
        return a; 
}
}
