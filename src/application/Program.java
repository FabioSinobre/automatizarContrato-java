package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("número: ");
		int number = sc.nextInt();
		System.out.print("Data no formato (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Valor do contrato R$ ");
		double value = sc.nextDouble();
		System.out.print("Número de prestação: ");
		int installments = sc.nextInt();
		
		Contract contract = new Contract(number, date, value);
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, installments);
		
		System.out.println("Prestacões #" + installments + " :");
		for(Installment x : contract.getInstallments()) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
