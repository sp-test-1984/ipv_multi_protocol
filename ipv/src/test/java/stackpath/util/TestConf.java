package stackpath.util;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;


import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.validation.*;
import javax.validation.constraints.NotNull;
import java.util.Map;
import java.util.Set;

public class TestConf {
    private static Config BASE_CONFIG = ConfigFactory.load();
    private static Logger LOGGER = LoggerFactory.getLogger(TestConf.class);
    private static ObjectMapper MAPPER = buildObjectMapper();
    private static Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();
    private static TestConf TEST_CONF = buildSingleton(BASE_CONFIG);
    private static Screen SCREEN = buildScreen();


    @Valid
    @NotNull
    private String applicationPath;

    public static TestConf getTestConf(){
        return TEST_CONF;
    }
    public String getApplicationPath() {
        return applicationPath;
    }

    public static Screen getSCREEN() {
        return SCREEN;
    }

    public static void displayConfig() {
        Map<String, Object> unwrapped = BASE_CONFIG.root().unwrapped();
        for (String entry :
                unwrapped.keySet()) {
            LOGGER.info(entry);
        }
    }

    private static ObjectMapper buildObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }

    private static Screen buildScreen() {
        Screen screen = new Screen();
        return screen;
    }

    private static TestConf buildSingleton(Config config){
        Map<String, Object> unwrapped = config.root().unwrapped();
        TestConf testConf = MAPPER.convertValue(unwrapped, TestConf.class);
        Set<ConstraintViolation<TestConf>> constraintViolations = VALIDATOR.validate(testConf);
        if(!constraintViolations.isEmpty()){
            StringBuilder message = new StringBuilder();
            for (ConstraintViolation<TestConf> violation:
                 constraintViolations) {
                message.append(" ");
                message.append(violation.getPropertyPath());
                message.append(" : ");
                message.append(violation.getMessage());
            }
            LOGGER.error(message.toString());
            throw new IllegalStateException("config is invalid");
        }
        return testConf;
    }


}
