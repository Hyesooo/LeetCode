class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> rowMap = new HashMap<>();
        Map<String, Integer> colMap = new HashMap<>();

        for(int[] arr : grid) {
            rowMap.merge(
                Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")),
                1,
                Integer::sum
            );
        }

        for(int i = 0 ; i < grid.length ; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < grid.length ; j++) {
                sb.append(grid[j][i]);
                if (j < grid[i].length - 1) {
                    sb.append(",");
                }
            }
            colMap.merge(sb.toString(), 1, Integer::sum);
        }

        int ans = 0;
        for(Map.Entry<String, Integer> entry : rowMap.entrySet()){
            if(colMap.keySet().contains(entry.getKey())){
                ans += colMap.get(entry.getKey()) * entry.getValue();
            }
        }

        return ans;

    }
}