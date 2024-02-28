class RecentCounter {
    private Queue<Integer> q = new LinkedList<>();
    
    public RecentCounter() {
    }
    
    public int ping(int t) {
        q.add(t);
        
        int from = -3000 + t;
        int to = 0 + t;
        
        while(!q.isEmpty() && q.peek() < from) {
            q.poll();
        }
        
        return q.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */