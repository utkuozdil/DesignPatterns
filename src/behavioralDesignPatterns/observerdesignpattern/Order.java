package observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private String id;

	private double shippingCost;

	private double itemCost;

	private double discount;

	private int count;
	
	private List<OrderObserver> observers = new ArrayList();

	public void attach(OrderObserver orderObserver) {
		observers.add(orderObserver);
	}

	public void detach(OrderObserver orderObserver) {
		observers.remove(orderObserver);
	}

	public Order(String id) {
		this.id = id;
	}

	public double getTotal() {
		return itemCost - discount + shippingCost;
	}

	public void addItem(double price) {
		itemCost += price;
		count++;
		observers.forEach(o -> o.updated(this));
	}

	public int getCount() {
		return count;
	}

	public void setShippingCost(double cost) {
		this.shippingCost = cost;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getItemCost() {
		return itemCost;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public double getDiscount() {
		return discount;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {

		return "Order#" + id + "\nItem cost:" + itemCost + "\nNo. of items:" + count + "\nShipping cost:" + shippingCost
				+ "\nDiscount:" + discount + "\nTotal:" + getTotal();
	}
}
