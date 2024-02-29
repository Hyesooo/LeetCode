class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Character> q = new LinkedList<>();
        int rCnt = 0, dCnt = 0;
        for(char c : senate.toCharArray()) {
            if(c == 'R') rCnt++;
            else dCnt++;

            q.add(c);
        }


        int rBan = 0, dBan = 0;
        while(!q.isEmpty()) {
            char cur = q.poll();
            if(cur == 'R') {
                if(dCnt == 0) return "Radiant";
                if(rBan == 0){
                    dBan++;
                    q.add(cur);
                } else {
                    rBan--;
                    rCnt--;
                }
            } else {
                if(rCnt == 0) return "Dire";
                if(dBan == 0){
                    rBan++;
                    q.add(cur);
                } else {
                    dBan--;
                    dCnt--;
                }
            }
        }
        return "";
    }
}