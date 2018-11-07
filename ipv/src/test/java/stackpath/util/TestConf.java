package stackpath.util;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Map;

public class TestConf {
    private static Config BASE_CONFIG = ConfigFactory.load();
    private static Logger LOGGER = LoggerFactory.getLogger(TestConf.class);



    public static void displayConfig(){
        Map<String, Object> unwrapped = BASE_CONFIG.root().unwrapped();
        for (String entry :
             unwrapped.keySet()) {
            LOGGER.info(entry);
        }
    }
}
