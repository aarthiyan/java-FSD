
public class callmethods {
	int val=500;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callmethods d = new callmethods();
		System.out.println("Before ope value of data is "+d.val);
		d.operation(100);
		System.out.println("After ope value of data is "+d.val);

	}

}
