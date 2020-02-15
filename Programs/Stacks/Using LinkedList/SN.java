public class SN {
    private int value;
    private SN next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SN getNext() {
        return next;
    }

    public void setNext(SN next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value+" ";
    }
}
