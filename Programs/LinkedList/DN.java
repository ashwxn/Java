public class DN {
    private int value;
    private DN prev;
    private DN next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DN getPrev() {
        return prev;
    }

    public void setPrev(DN prev) {
        this.prev = prev;
    }

    public DN getNext() {
        return next;
    }

    public void setNext(DN next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return value + "";
    }
}
