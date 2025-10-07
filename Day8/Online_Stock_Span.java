class StockSpanner {
    private Stack<int[]> stack;
    private int index;

    public StockSpanner() {
        stack = new Stack<>();
        index = -1;
    }

    public int next(int price) {
        index++; 
        while (!stack.isEmpty() && stack.peek()[1] <= price) {
            stack.pop();
        }
        int prevGreaterIndex = stack.isEmpty() ? -1 : stack.peek()[0];
        int span = index - prevGreaterIndex;
        stack.push(new int[]{index, price});

        return span;
    }
}
