import java.util.HashMap;

public class IDandPasswords {
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Test","pass");
		logininfo.put("Brother","password");
	}
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
