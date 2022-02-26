import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    IDandPasswords() {
        loginInfo.put("Bro", "Pizza");
        loginInfo.put("Brometheus", "PASSWORD");
        loginInfo.put("BroC", "abc123");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
