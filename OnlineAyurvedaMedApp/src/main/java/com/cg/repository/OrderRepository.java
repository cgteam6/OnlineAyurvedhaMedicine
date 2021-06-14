package com.cg.repository;

public interface OrderRepository {
	public Order addOrder(Order order);
	public Order viewOrder(Order order);
	public Order updateOrder(Order order) throws OrderNotFoundException;
	public Order cancelOrder(int id) throws OrderNotFoundException;
	public List<Order> showAllOrders(int medicineid);
	public List<Order> showAllOrders(Customer customer);
	public List<Order> showAllOrders(LocalDate date);
	public double calculateTotalCost(int orderid);

}
