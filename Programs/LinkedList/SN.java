public class SN(){
	private int value;
	private SN next;

	public void setNext(SN next){
		this.next = next;
	}
	public SN getNext(){
		return next;
	}
	public void setValue(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	@Override
	public String toString(){
		return value+" ";
	}

}//EoC