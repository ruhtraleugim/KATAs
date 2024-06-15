
public class SquareDigit {
    public int squareDigits(int n) {
        String a = Integer.toString(n);
        StringBuilder result = new StringBuilder();
        for (char c : a.toCharArray()){
            int i = Character.getNumericValue(c);
            int sq = i*i;
            result.append(sq);
        }
        return  Integer.parseInt(result.toString()); 
    }
}
