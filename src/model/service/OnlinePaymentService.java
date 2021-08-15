package model.service;

public interface OnlinePaymentService {
	
	double paymentFree(double amount);
	
	double interest(double amount, Integer months);

}
