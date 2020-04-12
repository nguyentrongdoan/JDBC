package dao;

import Model.Customer;

import java.util.*;

public class CustomerDao {
    private static final Map<Integer, Customer> listCUSTOMER = new HashMap<>();
    static {
        initCustomers();
    }

    private static void initCustomers() {
        Customer customer1 = new Customer(1, "A", "0988888999", "A@codegym.com");
        Customer customer2 = new Customer(2, "B", "0988888998", "B@codegym.com");
        Customer customer3 = new Customer(3, "C", "0988888997", "C@codegym.com");
        Customer customer4 = new Customer(4, "D", "0988888996", "D@codegym.com");

        listCUSTOMER.put(customer1.getId(), customer1);
        listCUSTOMER.put(customer2.getId(), customer2);
        listCUSTOMER.put(customer3.getId(), customer3);
        listCUSTOMER.put(customer4.getId(), customer4);
    }

    // Viet phuong thuc xu li get thong tin cua 1 customer theo id
    public static Customer getCustomer(int customerId){
        return listCUSTOMER.get(customerId);
    }
    //Viet phuong thuc them moi 1 customer vao danh sach
    public static void addCustomer(Customer customer){
        listCUSTOMER.put(customer.getId(), customer);
    }
    //Viet phuong thuc update thong tin cua 1 customer
//    public static Customer updateAndCreatCustomer(Customer customer){
//        listCUSTOMER.put(customer.getId(), customer);
//        return customer;
//    }
    //Viet phuong thuc delete 1 customer theo id
    public static void deleteCustomer(int customerId){
        listCUSTOMER.remove(customerId);
    }
    // Viet phuong thuc lay danh sach tat ca customer
    public static List<Customer> getAllCustomer(){
        Collection<Customer> c = listCUSTOMER.values();
        List<Customer> list = new ArrayList<>();
        list.addAll(c);
        return list;
    }

}
