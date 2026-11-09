class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet();
        for (String email : emails) {
            int atTheRateIndex = email.indexOf('@');
            String localName = email.substring(0, atTheRateIndex);
            String domainName = email.substring(atTheRateIndex + 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < localName.length(); i++) {
                char c = localName.charAt(i);
                if (c == '+') {
                    break;
                }
                if (c != '.') {
                    sb.append(c);
                }
            }
            uniqueEmails.add(sb.toString() + '@' + domainName);
        }
        return uniqueEmails.size();
    }
}