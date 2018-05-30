import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Event event = new Event();
        event.setKey(100L);
        event.setNode(101L);
        event.setOffset(102L);
        event.setTarget("target1");
        String payload = "payload";
        event.setPayload(payload);

        LoggerFactory.getLogger(Event.class).error(event.toString());
        LoggerFactory.getLogger(Event.class).debug(event.toString());
        LoggerFactory.getLogger(Event.class).info(event.toString());
        LoggerFactory.getLogger(Event.class).trace(event.toString());

    }
}
