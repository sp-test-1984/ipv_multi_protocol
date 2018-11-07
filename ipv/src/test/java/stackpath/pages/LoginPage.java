package stackpath.pages;

import org.sikuli.script.FindFailed;
import stackpath.util.Images;
import stackpath.util.TestConf;

public class LoginPage extends AbstractPage{

    private static final TestConf TEST_CONF = TestConf.getTestConf();

    public static void login(){
        try {
            typeOnClosestMatch(Images.USERNAME, TEST_CONF.getUserName());
            typeOnClosestMatch(Images.PASSWORD, TEST_CONF.getPassword());
            clickClosestMatch(Images.LOGINBUTTON);
        } catch (FindFailed findFailed) {
            System.err.println(findFailed.getMessage());
        }
    }
}
