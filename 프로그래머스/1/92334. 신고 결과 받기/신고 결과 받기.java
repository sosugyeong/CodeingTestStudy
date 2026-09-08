import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 중복 신고 제거
        HashSet<String> uniqueReports = new HashSet<>(Arrays.asList(report));
        
        // 각 유저가 신고당한 횟수
        Map<String, Integer> reportedCountMap = new HashMap<>();
        
        // 각 유저가 누구를 신고했는지 기록 (신고한 사람 -> 신고당한 사람들 목록)
        Map<String, HashSet<String>> userReportMap = new HashMap<>();
        
        for (String id : id_list) {
            userReportMap.put(id, new HashSet<>());
        }
        
        for(String r : uniqueReports){
            String[] reports = r.split(" ");
            String me = reports[0];
            String you = reports[1];
            
            reportedCountMap.put(you, reportedCountMap.getOrDefault(you, 0)+1);
            
            userReportMap.get(me).add(you);
        }
        
        for(int i = 0; i < id_list.length; i++){
            String userId = id_list[i];
            HashSet<String> myReport = userReportMap.get(userId);
            
            int mail = 0;
            for (String reportedUser : myReport) {
                if (reportedCountMap.getOrDefault(reportedUser, 0) >= k) {
                    mail++;
                }
            }
            answer[i] = mail;
        }
        

        return answer;
    }
}