package tc.kafka.client;

import java.util.Properties;

public class PropMgr {
    public static void maybeOverride(Properties props) {
        Properties sysProps = System.getProperties();
        for (String k: props.stringPropertyNames()) {
            if (sysProps.containsKey(k)) {
                props.setProperty(k, sysProps.getProperty(k));
            }
        }
    }
}
