class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];        
        
        int x = 0; //가로 시작점
        int y = 0; //세로 시작점
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        
        for(int i = 0; i < routes.length; i++){
            String[] way = routes[i].split(" ");
            String dir = way[0]; 
            int dist = Integer.parseInt(way[1]);
            
            if(dir.equals("N")){
                boolean canMove = true; // 이동 가능 여부 체크용 깃발
                int nx = x; // 임시 행 위치
                int ny = y; // 임시 열 위치
    
                for (int j = 0; j < dist; j++) {
                    nx = nx - 1;
                    
                    if (nx < 0 || nx >= park.length || park[nx].charAt(ny) == 'X') {
                    canMove = false;
                    break;
                    }
                }
                
                if(canMove){
                    x = nx;
                }
            } 
            else if(dir.equals("E")){
                boolean canMove = true; // 이동 가능 여부 체크용 깃발
                int nx = x; // 임시 행 위치
                int ny = y; // 임시 열 위치
    
                for (int j = 0; j < dist; j++) {
                    ny = ny + 1;
        
                    if (ny < 0 || ny >= park[0].length() || park[nx].charAt(ny) == 'X') {
                        canMove = false;
                        break;
                    }
                }
                
                if(canMove){
                    y = ny;
                }
            } 
            else if(dir.equals("S")){
                boolean canMove = true; // 이동 가능 여부 체크용 깃발
                int nx = x; // 임시 행 위치
                int ny = y; // 임시 열 위치
    
                for (int j = 0; j < dist; j++) {
                    nx = nx + 1;
        
                    if (nx < 0 || nx >= park.length || park[nx].charAt(ny) == 'X') {
                        canMove = false;
                        break;
                    }
                }
                
                if(canMove){
                    x = nx;
                }
            } 
            else if(dir.equals("W")){
                boolean canMove = true; // 이동 가능 여부 체크용 깃발
                int nx = x; // 임시 행 위치
                int ny = y; // 임시 열 위치
    
                for (int j = 0; j < dist; j++) {
                    ny = ny - 1;
        
                    if (ny < 0 || ny >= park[0].length() || park[nx].charAt(ny) == 'X') {
                        canMove = false;
                        break;
                    }
                }
                
                if(canMove){
                    y = ny;
                }
            }            
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}