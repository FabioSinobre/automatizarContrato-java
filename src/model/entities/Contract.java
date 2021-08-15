package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private Double totalValue;
	
	private List<Installment> partion = new ArrayList<>();
	
	public Contract() {
	}

	public Contract(Integer number, Date date, Double totalValue, List<Installment> partion) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.partion = partion;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getPartion() {
		return partion;
	}
	public void addPartion(Installment partion) {
		this.partion.add(partion);
	}
	public void removePartion(Installment partion) {
		this.partion.remove(partion);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(false);
		return sb.toString();
	}
	

}
