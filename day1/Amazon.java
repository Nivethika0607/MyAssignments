package Week4.day1;

public class Amazon extends CanaraBank {
	
	public static void main(String[] arg) {

		Amazon ama=new Amazon();
		ama.cardPayments();
		ama.cashOnDelivery();
		ama.recordPaymentDetails();
		ama.internetBanking();
		ama.upiPayments();
		
		
		
	}
	
	@Override
	public void cashOnDelivery() {
		System.out.println(" Cash paid on Delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upi Payment is working");
		
	}

	@Override
	public void cardPayments() {
		System.out.println(" Card payment is working");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internet Banking is working ");
		
	}

	@Override
	public void recordPaymentDetails() {
		// System.out.println(" Cash paid on Delivery");
		
    }

}
