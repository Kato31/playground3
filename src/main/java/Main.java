import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Event event = new Event();
        event.setKey(100L);
        event.setNode(101L);
        event.setOffset(102L);
        event.setTarget("target1");
        String payload = "payload";
        event.setPayload(payload);

        logger.error(event.toString());
        logger.debug(event.toString());

    }

}
