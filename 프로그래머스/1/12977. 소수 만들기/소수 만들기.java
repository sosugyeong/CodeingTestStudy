class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        boolean prime = false;
        
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i+1; j < nums.length - 1; j++){
                for(int k = j+1; k < nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    System.out.println(sum);
                    
                    prime = isPrime(sum);
                    if(prime == true){
                        answer++;
                    }
                }
            }
        
        }

        return answer;
    }
    
    public boolean isPrime(int n){
        for(int i = 2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}