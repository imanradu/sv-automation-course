package restassured.util;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import static com.sun.webkit.perf.WCGraphicsPerfLogger.log;

/**
 * Class to read from property files
 *
 * @author imanr
 */

public class ReadPropertyFile {

    public Properties getPropertiesValue(String propertiesFile) {

        Logger logger = Logger.getLogger(String.valueOf(ReadPropertyFile.class));
        InputStream inputStream = null;
        Properties prop = new Properties();
        try {
            inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFile);
            if (inputStream != null) {
                prop.load(inputStream);
            }
            else {
                throw new FileNotFoundException("property file '" + propertiesFile + "' not found in the classpath");
            }
        }
        catch (Exception e) {
            logger.info(e.getMessage());
        }
        return prop;
    }
}

