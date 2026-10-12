class Solution {
    public static int[][] keypad = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9},
                          {10, 0, 12}};
    
    public String solution(int[] numbers, String hand) {
        
        StringBuilder sb = new StringBuilder();
        int leftHand = keypad[3][0];
        int rightHand = keypad[3][2];
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                leftHand = numbers[i];
                sb.append("L");
            } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                rightHand = numbers[i];
                sb.append("R");
            } else {
                //더 가까운 손가락 구하기
                String s = handRoute(numbers[i], leftHand, rightHand, hand);
                sb.append(s);
                
                if("L".equals(s)){
                    leftHand = numbers[i];
                } else {
                    rightHand = numbers[i];
                }
            }
        }
        
        return sb.toString();
    }
    
    public String handRoute(int numberKey, int leftHand, int rightHand, String hand){
        int row = 0;
        int col = 0;
        int leftrow = 0;
        int leftcol = 0;
        int rightrow = 0;
        int rightcol = 0;
        
        for(int i = 0; i < keypad.length; i++){
            for(int j = 0; j < keypad[i].length; j++){
                if(numberKey == keypad[i][j]){
                    row = i;
                    col = j;
                }
                
                if(leftHand == keypad[i][j]){
                    leftrow = i;
                    leftcol = j;
                }
                
                if(rightHand == keypad[i][j]){
                    rightrow = i;
                    rightcol = j;
                }
            }
        }
        
        int leftDistance = Math.abs(row - leftrow) + Math.abs(col - leftcol);
        int rightDistance = Math.abs(row - rightrow) + Math.abs(col - rightcol);
        
        if(leftDistance > rightDistance){
            return "R";
        } else if(leftDistance < rightDistance){
            return "L";
        } else {
            if("right".equals(hand)) {
                return "R";
            } else {
                return "L";
            }
        }
    }
}