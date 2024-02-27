class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

       for (int a : asteroids) {
            collision: {
                // 직전 소행성이 우측전진, 새로 들어올 소행성이 좌측전진할 때만 충돌
                while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                    if (-a > stack.peek()) {
                        stack.pop();
                        continue;
                    } else if (-a == stack.peek()) { 
                        stack.pop();
                    }
                    a = 0; 
                    break collision;
                }
                if (a != 0) stack.push(a); 
            }
        }

        int[] result = new int[stack.size()];
        for(int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}