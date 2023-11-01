package String_Array;

import java.util.*;

public class _11_UniqueEamilAddress {
	
	public static void main(String[] args) {
		String[] emails = {"test.email+alex@leetcode.com",
				           "test.e.mail+bob.cathy@leetcode.com",
				           
				           "testemail+david@lee.tcode.com"};
		System.out.println(numUniqueEmails(emails));
		System.out.println(numUniqueEmails_split(emails));
	}
	
//	static int numUniqueEmails(String[] emails) {
//		Set<String> uniqueEmails = new HashSet<>();
//		for (String email : emails) {
//			String localName = getLocalName(email);
//			String domainName = getDomainName(email);
//			uniqueEmails.add(localName + "@" + domainName);
//		}
//		return uniqueEmails.size();
//	    }

	
	public static int numUniqueEmails(String[] emails) {

	    Set<String> set = new HashSet<>();

	    for (String email : emails) {
	        String[] str = email.split("@");

	        str[0] = str[0].replace(".", "");

	        int index = str[0].indexOf("+");

	        if (index >= 0) {
	            str[0] = str[0].substring(0, index);
	        }

	        set.add(str[0] + "@" + str[1]);
	    }

	    return set.size();
	}
	 
	  
	 
	
	private static String getDomainName(String email) {
		return email.substring(email.indexOf('@')+1);
		//@ 기준으로 잘라주자.
	}

	private static String getLocalName(String email) {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i < email.length(); i++) {
			if (email.charAt(i) == '.') {
				continue;	//.이면 다음기회에
			}
			if (email.charAt(i) == '+') {
				break;
			}
			if (email.charAt(i) == '@') {
				break;
			}
			String str = String.valueOf(email.charAt(i));
			sb.append(str);

		}
		return sb.toString();
	}
	
	
	public static int numUniqueEmails_split(String[] emails) {
        Set<String> sentEmails = new HashSet();
        if(emails == null) {
            return 0;
        }

        for(String email : emails) {	//데이터 뽑아냄.
            String[] parts = email.split("\\@");
            String[] partsForPlus = parts[0].split("\\+");
            String[] partsForDot = partsForPlus[0].split("\\.");
            StringBuilder emailM = new StringBuilder();
            for(String part : partsForDot) {
                emailM.append(part);
            }
            emailM.append("@"+parts[1]); 
            sentEmails.add(emailM.toString());
        }
        return sentEmails.size();
    }



}