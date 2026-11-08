class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int h = (n / w) + 1;
        int[][] box = new int[h][w];
        int number = 1;
        
        for(int j = h-1; j >= 0; j--){
            if(j%2 == 0){
                for(int k = 0; k < w; k++){
                    if(number <= n){
                        box[j][k] = number;
                        number++;
                    } else{
                        box[j][k] = 0;
                    }
                }
                    
            } else if(j%2 == 1) {
                for(int k = w-1; k >= 0; k--){
                    if(number <= n){
                        box[j][k] = number;
                        number++;
                    } else{
                        box[j][k] = 0;
                    }
                }
            }
        }
        
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print(box[i][j]+" ");
            }
        }
        
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(box[i][j] == num){
                    answer = i+1;
                    
                    if(box[0][j] == 0){
                        answer--;
                    }
                }
            }
        }
        
        return answer;
    }
}