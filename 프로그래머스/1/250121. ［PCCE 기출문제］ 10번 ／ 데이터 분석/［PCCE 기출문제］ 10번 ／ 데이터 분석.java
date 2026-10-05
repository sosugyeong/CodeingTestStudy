import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] str = {"code", "date", "maximum", "remain"};
        int ext_index = 0;
        int sortby_index = 0;
        
        for(int i = 0; i < str.length; i++){
            if(ext.equals(str[i])){ext_index = i;}
        }
        for(int i = 0; i < str.length; i++){
            if(sort_by.equals(str[i])){sortby_index = i;}
        }
        
        List<int[]> list = new ArrayList<>();
        
        for(int i = 0; i < data.length; i++){
            if(data[i][ext_index] < val_ext){
                list.add(data[i]);
            }
        }
        
        final int sortByIndex = sortby_index;
        list.sort((o1, o2) -> o1[sortByIndex] - o2[sortByIndex]);
        
        int[][] answer = new int[list.size()][];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}