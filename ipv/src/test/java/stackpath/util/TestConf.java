package stackpath.util;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.util.Map;

public class TestConf {
    private static Config BASE_CONFIG = ConfigFactory.load();

    public static void displayConfig(){
        Map<String, Object> unwrapped = BASE_CONFIG.root().unwrapped();
        for (String entry :
             unwrapped.keySet()) {
            System.out.println("key value is: " + entry);
        }
    }
}
