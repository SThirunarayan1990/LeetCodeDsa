class Solution {
    public boolean checkDivisibility(int n) {    
        long original = n;
        long sum = 0l;
        long product = 1l;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10;
        }
        long total = sum + product;
        if(original%total == 0) {
            return true;
        } else {
            return false;
        }
    }
}