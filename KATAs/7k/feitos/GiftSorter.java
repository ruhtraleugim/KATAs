import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GiftSorter {
    public String sortGiftCode(String code){
        List<Integer> codeInAscii  = toAscciList(code);    
        Collections.sort(codeInAscii);
        StringBuilder sortedCode = new StringBuilder();

        for (int value : codeInAscii) {
            sortedCode.append((char) value);
        }
        return sortedCode.toString();
    }
    public List<Integer> toAscciList(String code){
        List<Integer> ascciValue = new ArrayList<>();
        char[] lethers = code.toCharArray();
        int length = lethers.length;
        for (int i = 0; i<length ; i++){
            Integer m = (int) lethers[i];
            ascciValue.add(m);
        }
        
        return ascciValue;
    }
}

