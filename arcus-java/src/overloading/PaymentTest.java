package overloading;

public class PaymentTest {

	public static void main(String[] args) {
		
		PaymentOptions pmt = new PaymentOptions();
		pmt.acceptPayment(100);
		pmt.acceptPayment(null, null, null, 0);

	}

}
