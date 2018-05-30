public class Event {
    long node;
    long key;
    long offset;
    String target;
    Object payload;

    public long getNode() {
        return node;
    }

    public void setNode(long node) {
        this.node = node;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Event{" +
                "node=" + node +
                ", key=" + key +
                ", offset=" + offset +
                ", target='" + target + '\'' +
                ", payload=" + payload +
                '}';
    }
}
