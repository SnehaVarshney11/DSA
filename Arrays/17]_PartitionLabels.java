import java.util.*; 
class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        if(s == null || s.length() == 0)
            return null;
        
        List<Integer> ans = new ArrayList();
        
        int[] last_indices = new int[26];
        for(int i = 0; i < s.length(); i++){
            last_indices[s.charAt(i) - 'a'] = i;
        }
        
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            end = Math.max(end, last_indices[s.charAt(i) - 'a']);
            if(i == end){
                ans.add(end - start + 1);
                start = end + 1;
            }
        }
        
        return ans;
    }    
}
