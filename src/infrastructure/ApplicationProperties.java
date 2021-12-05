package infrastructure;

import java.util.Properties;

public class ApplicationProperties {
    /*
    * some fake application properties
    *
    * */
    public Properties properties;

    private static volatile ApplicationProperties instance;

    private ApplicationProperties() {
        this.properties = new Properties();
    }

    public static ApplicationProperties getInstance() {
        ApplicationProperties result = instance;
        if (result != null) {
            return result;
        }

        synchronized(ApplicationProperties.class) {
            if (instance == null) {
                instance = new ApplicationProperties();
            }

            return instance;
        }
    }

}
