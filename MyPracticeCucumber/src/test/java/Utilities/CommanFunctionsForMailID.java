package Utilities;

public class CommanFunctionsForMailID {
	
	public static String generateReandomEmailID() {
		
		String email = "tom" + java.util.UUID.randomUUID().toString().replace("-", "").substring(0,8) + "@gmail.com";
		return email;
	}

}
