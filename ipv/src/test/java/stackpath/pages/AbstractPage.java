package stackpath.pages;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stackpath.util.TestConf;

import java.util.Iterator;

public class AbstractPage {
    private static TestConf TEST_CONF = TestConf.getTestConf();
    private static Screen SCREEN = TEST_CONF.getSCREEN();
    private static Logger LOGGER = LoggerFactory.getLogger(AbstractPage.class);

    protected static void clickClosestMatch(String image) throws FindFailed {
        Iterator<Match> all = SCREEN.findAll(image);
        Match element = null;
        while (all.hasNext()){
            element = all.next();
            if(element.getScore() > 0.95){
                element.click();
            } else {
                LOGGER.error("no matching image found");
            }
        }
    }

    protected static void typeOnClosestMatch(String image, String text) throws FindFailed {
        Iterator<Match> all = SCREEN.findAll(image);
        Match element = null;
        while (all.hasNext()){
            element = all.next();
            if(element.getScore() > 0.95){
                element.type(image, text);
            } else {
                LOGGER.error("no matching image found");
            }
        }
    }
}
