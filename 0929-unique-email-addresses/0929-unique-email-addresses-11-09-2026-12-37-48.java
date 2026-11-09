class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet();
        for (String email : emails) {
            int atTheRateIndex = email.indexOf('@');
            String localName = email.substring(0, atTheRateIndex);
            String domainName = email.substring(atTheRateIndex + 1);
            int plusIndex = localName.indexOf('+');
            if (plusIndex >= 0) {
                localName = localName.substring(0, plusIndex);
            }
            localName = localName.replace(".","");
            uniqueEmails.add(localName + '@' + domainName);
        }
        return uniqueEmails.size();
    }
}