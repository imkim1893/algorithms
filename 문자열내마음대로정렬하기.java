import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (nextS,prevS)->{
            char prev = prevS.charAt(n);
            char next = nextS.charAt(n);
            
            if(prev==next) {
                return prevS.compareTo(nextS)>0 ? -1 : 1;
            }
            
            return prev>next ? -1 : 1;            
        });
        
        return strings;
    }
}
