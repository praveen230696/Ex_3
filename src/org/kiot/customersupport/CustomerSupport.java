package org.kiot.customersupport;

import java.util.Scanner;
import org.kiot.customer.Customer;

/**
 *	CustomerSupport class performs customer operations
 *	@version 04/03/2022
 *  @author praveen kandhan
 */
public class CustomerSupport {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		String emailId = scanner.next();
		if(customer.isValidEmailId(emailId)) {
			System.out.println("Valid emailId");
		} else {
			System.out.println("inValid emailId");
		}
	}
}
