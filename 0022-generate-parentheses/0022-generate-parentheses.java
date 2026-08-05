class Solution {

    class Node {
        String value;
        int open;
        int close;

        public Node(String value, int open, int close) {
            this.value = value;
            this.open = open;
            this.close = close;
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Queue<Node> q = new LinkedList();
        q.add(new Node("", 0, 0));

        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr.value.length() == 2 * n) {
                result.add(curr.value);
            }

            if (curr.open < n) {
                q.add(new Node(curr.value + "(", curr.open + 1, curr.close));
            }

            if (curr.open > curr.close) {
                q.add(new Node(curr.value + ")", curr.open, curr.close + 1));
            }
        }

        return result;
    }

}