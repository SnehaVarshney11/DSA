import java.util.*;
class OrderlyQueue {
    public String orderlyQueue(String s, int k) {
        if(k>=2){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        } else{
            String s2 = s + s;
            for(int i = 0; i < s.length(); i++){
                String tmp = s2.substring(i, i+s.length());
                s = (s.compareTo(tmp)>0) ? tmp : s;
            }
        }
        return s;
    }    
}
