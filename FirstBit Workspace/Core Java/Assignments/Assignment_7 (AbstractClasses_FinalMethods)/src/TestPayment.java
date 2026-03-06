abstract class Payment{
	final int paymentId;
	double amount;
	String payerName;
	String status; //pending, success, failed
	String paymentMode;
	static int count=1;
	
	Payment(){
		this.paymentId = 0;
		this.payerName = "Not avilable";
		this.amount = 0;
		this.status = "Not Initiated";
		this.paymentMode = "Not avilable";
	}

	Payment(double amount, String payerName, String paymentMode) {
		this.paymentId = count++;
		this.amount = amount;
		this.payerName = payerName;
		this.paymentMode = paymentMode;
	}

	double getAmount() {
		return amount;
	}

	void setAmount(double amount) {
		this.amount = amount;
	}

	String getPayerName() {
		return payerName;
	}

	void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	int getPaymentId() {
		return paymentId;
	}
	

	@Override
	public String toString() {
		return "paymentId = " + paymentId + "\namount = " + amount + "\npayerName = " + payerName + "payment status = " + status;
	}
	
	
	void printSummary() {
		System.out.println("------------ Summary ----------");
		System.out.println("Transaction ID: " + "100023AB0"+this.paymentId);
		System.out.println("Amount: " + this.amount);
		System.out.println("Payer Name: " + this.payerName);
		System.out.println("Payment Mode: " + this.paymentMode);
		System.out.println("Status: " + this.status);
		System.out.println("-------------------------------\n");
	}
	
	abstract boolean validate();
	abstract void deductAmount();
	abstract void sendNotification();
	
	final void process() {
		if(this.validate()) {
			this.deductAmount();
			this.sendNotification();
			this.status = "SUCCESS";
		}
		else {
			this.status = "FAILED";
		}
	}
	
}//Payment class ends here

class CardPayment extends Payment{
	String cardNumber;
	String cvv;
	
	CardPayment() {
		super();
		this.cardNumber = "Not Avilable";
		this.cvv = "Not Avilable";
	}
	
	CardPayment(double amount, String payerName, String cardNumber, String cvv) {
		super(amount, payerName, "Card");
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}

	String getCardNumber() {
		return cardNumber;
	}

	void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	String getCvv() {
		return cvv;
	}

	void setCvv(String cvv) {
		this.cvv = cvv;
	}

	@Override
	boolean validate() {
		if(cardNumber.length()==16) {
			if(cvv.length()==3) {
				if(amount > 0) {
					return true;
				}else {
					System.out.println("\nAmount must be greater then 0rs...!\n");
					return false;
				}	
			}else {
				System.out.println("\nCheck Your CVV Number...!\n");
				return false;
			}
		}else{
			System.out.println("\nCheck Your Card Number...!\n");
			return false;
		}
	}
	
	@Override
	void deductAmount() {
		System.out.println("Amount deduction in progress..!\n");
	}
	
	@Override
	void sendNotification() {
		System.out.println("\n----------Notification---------");
		System.out.println("\n" + this.amount + " deducted from your account");
		System.out.println("Payment is successfull\n");
	}

	@Override
	public String toString() {
		return super.toString() + "\ncardNumber = " + cardNumber + "\ncvv = " + cvv;
	}
} //CardPayment class ends here

class UPIPayment extends Payment{
	String upiId;
	
	UPIPayment() {
		super();
		this.upiId = "Not Avilable";	
	}

	UPIPayment(double amount, String payerName, String upiId) {
		super(amount, payerName, "UPI");
		this.upiId = upiId;
	}
	
	@Override
	boolean validate() {
		if(upiId.contains("@")) {
			if(amount > 0 && amount <= 100000) {
					return true;
			}else {
				System.out.println("\nAmount must be between 1rs and 100000rs...!");
				return false;
			}
		}else {
			System.out.println("\nCheck Your UPI ID...!");
		    	return false;
		}
	}
	
	@Override
	void deductAmount() {
		System.out.println("\nAmount deduction in progress...!");
		
	}
	
	@Override
	void sendNotification() {
		System.out.println("\n----------Notification---------");
		System.out.println("\n" + this.amount + " deducted from your account");
		System.out.println("Payment is successfull\n");
	}
	
	
}


public class TestPayment {

	public static void main(String[] args) {
		
			Payment p1 = new CardPayment(1000, "Ramesh Pawar", "1322323232323232", "123");
			Payment p2 = new UPIPayment(10000, "FirstBIT", "8180061371@upi");
			Payment p3 = new CardPayment(500, "Kumar Bakery", "12322", "234"); 
			Payment p4 = new UPIPayment(10, "Pritish Pawar", "2321232322");
			
			System.out.println("---------------Payment 1------------");
			p1.process();
			p1.printSummary();
			
			System.out.println("---------------Payment 2------------");
			p2.process();
			p2.printSummary();
			
			System.out.println("---------------Payment 3------------");
			p3.process();
			p3.printSummary();
			
			System.out.println("---------------Payment 4------------");
			p4.process();
			p4.printSummary();
	}
	
	
	
	
	
	
	

}
