package org.example;

import org.example.models.Customer;
import org.example.models.Order;
import org.example.models.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1L, "Laptop", "Books", new BigDecimal("1200.99"));
        Product product2= new Product(2L, "Smartphone", "Books", new BigDecimal("799.49"));
        Product product3 = new Product(3L, "Tablet", "Books", new BigDecimal("450.00"));
        Product product4 = new Product(4L, "Monitor", "Books", new BigDecimal("299.99"));
        Product product5 = new Product(5L, "Keyboard", "Books", new BigDecimal("49.99"));
        Product product6 = new Product(6L, "Mouse", "Books", new BigDecimal("25.99"));
        Product product7 = new Product(7L, "Headphones", "Children's products", new BigDecimal("89.99"));
        Product product8 = new Product(8L, "Speaker", "Children's products", new BigDecimal("129.99"));
        Product product9 = new Product(9L, "Smartwatch", "Children's products", new BigDecimal("199.99"));
        Product product10 = new Product(10L, "Camera", "Children's products", new BigDecimal("549.99"));
        Product product11 = new Product(11L, "Printer", "Toys", new BigDecimal("180.00"));
        Product product12 = new Product(12L, "Desk Chair", "Toys", new BigDecimal("120.00"));
        Product product13 = new Product(13L, "Office Desk", "Toys", new BigDecimal("299.99"));
        Product product14 = new Product(14L, "Bookshelf", "Toys", new BigDecimal("150.00"));
        Product product15 = new Product(15L, "Sofa", "Furniture", new BigDecimal("699.99"));
        Product product16 = new Product(16L, "Bed Frame", "Furniture", new BigDecimal("499.99"));
        Product product17 = new Product(17L, "Mattress", "Furniture", new BigDecimal("350.00"));
        Product product18 = new Product(18L, "Blender", "Appliances", new BigDecimal("89.99"));
        Product product19 = new Product(20L, "Refrigerator", "Appliances", new BigDecimal("899.99"));
        Product product20 = new Product(21L, "Oven", "Appliances", new BigDecimal("650.00"));
        Product product21 = new Product(22L, "Toaster", "Appliances", new BigDecimal("49.99"));
        Product product22 = new Product(23L, "Vacuum Cleaner", "Appliances", new BigDecimal("210.00"));
        Product product23 = new Product(24L, "Air Conditioner", "Appliances", new BigDecimal("400.00"));
        Product product24 = new Product(25L, "Washing Machine", "Appliances", new BigDecimal("750.00"));
        Product product25 = new Product(19L, "Microwave", "Appliances", new BigDecimal("120.00"));

        Order order1 = new Order(1L, LocalDate.now().minusDays(1), LocalDate.now().plusDays(3), "Processing", Set.of(product1, product2));
        Order order2 = new Order(2L, LocalDate.now().minusDays(2), LocalDate.now().plusDays(5), "Shipped", Set.of(product3, product4));
        Order order3 = new Order(3L, LocalDate.of(2021,2,2), LocalDate.now().plusDays(2), "Processing", Set.of(product5));
        Order order4 = new Order(4L, LocalDate.now().minusDays(4), LocalDate.now().plusDays(7), "Shipped", Set.of(product6, product7));
        Order order5 = new Order(5L, LocalDate.now().minusDays(5), LocalDate.now().plusDays(1), "Processing", Set.of(product8, product9));
        Order order6 = new Order(6L, LocalDate.of(2021,2,2), LocalDate.now().plusDays(4), "Shipped", Set.of(product10, product11));
        Order order7 = new Order(7L, LocalDate.of(2021,3,2), LocalDate.now().plusDays(3), "Processing", Set.of(product12, product13));
        Order order8 = new Order(8L, LocalDate.of(2021,3,14), LocalDate.now().plusDays(6), "Shipped", Set.of(product14, product15));
        Order order9 = new Order(9L, LocalDate.of(2021,3,14), LocalDate.now().plusDays(2), "Processing", Set.of(product16, product17));
        Order order10 = new Order(10L, LocalDate.now().minusDays(10), LocalDate.now().plusDays(5), "Shipped", Set.of(product18, product19));
        Order order11 = new Order(11L, LocalDate.now().minusDays(11), LocalDate.now().plusDays(7), "Processing", Set.of(product20, product1));
        Order order12 = new Order(12L, LocalDate.now().minusDays(12), LocalDate.now().plusDays(4), "Shipped", Set.of(product2, product3));
        Order order13 = new Order(13L, LocalDate.of(2021,3,15), LocalDate.now().plusDays(6), "Processing", Set.of(product4, product5));
        Order order14 = new Order(14L, LocalDate.now().minusDays(14), LocalDate.now().plusDays(8), "Shipped", Set.of(product6, product7));
        Order order15 = new Order(15L, LocalDate.now().minusDays(15), LocalDate.now().plusDays(3), "Processing", Set.of(product8, product9));
        Order order16 = new Order(16L, LocalDate.now().minusDays(16), LocalDate.now().plusDays(7), "Shipped", Set.of(product10, product11));
        Order order17 = new Order(17L, LocalDate.now().minusDays(17), LocalDate.now().plusDays(5), "Processing", Set.of(product12, product13));
        Order order18 = new Order(18L, LocalDate.now().minusDays(18), LocalDate.now().plusDays(4), "Shipped", Set.of(product14, product15));
        Order order19 = new Order(19L, LocalDate.now().minusDays(19), LocalDate.now().plusDays(6), "Processing", Set.of(product16, product17));
        Order order20 = new Order(20L, LocalDate.now().minusDays(20), LocalDate.now().plusDays(2), "Shipped", Set.of(product18, product19));
        Order order21 = new Order(21L, LocalDate.now().minusDays(21), LocalDate.now().plusDays(3), "Processing", Set.of(product20, product21));
        Order order22 = new Order(22L, LocalDate.now().minusDays(22), LocalDate.now().plusDays(5), "Shipped", Set.of(product22, product23));
        Order order23 = new Order(23L, LocalDate.now().minusDays(23), LocalDate.now().plusDays(7), "Processing", Set.of(product24, product25));
        Order order24 = new Order(24L, LocalDate.now().minusDays(24), LocalDate.now().plusDays(6), "Shipped", Set.of(product6, product24));
        Order order25 = new Order(25L, LocalDate.now().minusDays(25), LocalDate.now().plusDays(4), "Processing", Set.of(product8, product19));

        Customer customer1 = new Customer(1L, "Alice Johnson", 1L, Set.of(order1, order2, order3, order4, order5));
        Customer customer2 = new Customer(2L, "Bob Smith", 2L, Set.of(order6, order7, order8, order9, order10));
        Customer customer3 = new Customer(3L, "Charlie Brown", 2L, Set.of(order11, order12, order13, order14, order15));
        Customer customer4 = new Customer(4L, "David Williams", 2L, Set.of(order16, order17, order18, order19, order20));
        Customer customer5 = new Customer(5L, "Emma Davis", 2L, Set.of(order21, order23, order24, order22, order25));

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1); customers.add(customer2); customers.add(customer3); customers.add(customer4); customers.add(customer5);
/*

        System.out.println("Задание 1:");
        task1(customers).forEach(System.out::println);

        System.out.println("\nЗадание 2:");
        task2(customers).forEach(System.out::println);

        System.out.println("\nЗадание 3:");
        System.out.println("Сумма игрушек с 10% скидкой: " + task3(customers));

        System.out.println("\nЗадание 4:");
        task4(customers).forEach(System.out::println);

        System.out.println("\nЗадание 5:");
        task5(customers).forEach(System.out::println);

        System.out.println("\nЗадание 6:");
        task6(customers).forEach(System.out::println);

        System.out.println("\nЗадание 7:");
        task7(customers).forEach(order -> System.out.println("ID: " + order.getId()));

        System.out.println("\nЗадание 8:");
        System.out.println(task8(customers));

        System.out.println("\nЗадание 9:");
        System.out.println("Средний платёж за заказы 14 марта 2021: " + task9(customers));

        System.out.println("\nЗадание 10:");
        task10(customers);

        System.out.println("\nЗадание 11:");
        System.out.println(task11(customers));


        System.out.println("\nЗадание 12:");
        System.out.println(task12(customers));


        System.out.println("\nЗадание 13:");
        System.out.println(task13(customers));

        System.out.println("\nЗадание 14:");
        System.out.println(task14(customers));

 */
        System.out.println("\nЗадание 15:");
        System.out.println(task15(customers));
    }
    public static List<Product> task1(List<Customer> customers) {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getCategory().equals("Books"))
                .filter(product -> product.getPrice().intValue() > 100)
                .distinct()
                .collect(Collectors.toList());
    }

    // Задание 2: Найти заказы с детскими товарами
    public static List<Order> task2(List<Customer> customers) {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory().equals("Children's products")))
                .distinct()
                .collect(Collectors.toList());
    }

    // Задание 3: Применить скидку 10% к игрушкам и получить сумму
    public static BigDecimal task3(List<Customer> customers) {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getCategory().equals("Toys"))
                .peek(product -> product.setPrice(product.getPrice().multiply(BigDecimal.valueOf(0.9))))
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    // Задание 4: Найти заказы уровня 2 за февраль 2021
    public static List<Order> task4(List<Customer> customers) {
        LocalDate start = LocalDate.of(2021, 2, 1);
        LocalDate end = LocalDate.of(2021, 3, 1);

        return customers.stream()
                .filter(customer -> customer.getLevel().equals(2L))
                .flatMap(customer -> customer.getOrders().stream())
                .filter(order -> order.getOrderDate().isAfter(start) && order.getOrderDate().isBefore(end))
                .collect(Collectors.toList());
    }

    // Задание 5: Найти 2 самых дешёвых товара
    public static List<Product> task5(List<Customer> customers) {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .sorted(Comparator.comparing(Product::getPrice))
                .limit(2)
                .collect(Collectors.toList());
    }

    // Задание 6: Найти 3 последних заказа
    public static List<Order> task6(List<Customer> customers) {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    // Задание 7: Найти заказы от 15 марта 2021
    public static List<Order> task7(List<Customer> customers) {
        LocalDate date = LocalDate.of(2021, 3, 15);
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .filter(order -> order.getOrderDate().isEqual(date))
                .collect(Collectors.toList());
    }

    // Задание 8: Найти сумму всех заказов за февраль и март 2021
    public static BigDecimal task8(List<Customer> customers) {
        LocalDate start = LocalDate.of(2021, 1, 31);
        LocalDate end = LocalDate.of(2021, 3, 31);

        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .filter(order -> order.getOrderDate().isAfter(start) && order.getOrderDate().isBefore(end))
                .flatMap(order -> order.getProducts().stream())
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    // Задание 9: Найти средний платёж за заказы 14 марта 2021
    public static BigDecimal task9(List<Customer> customers) {
        LocalDate date = LocalDate.of(2021, 3, 14);
        List<Order> orders = customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .filter(order -> order.getOrderDate().isEqual(date))
                .toList();

        BigDecimal total = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return orders.isEmpty()
                ? BigDecimal.ZERO
                : total.divide(BigDecimal.valueOf(orders.size()), 2, BigDecimal.ROUND_HALF_UP);
    }

    //Задание 10: Получить набор статистических данных
    public static void task10(List<Customer> customers)
    {

        long countOfBooks = customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getCategory().equals("Books"))
                .count();

        System.out.println("Количество всех книг: " + countOfBooks);


       BigDecimal sum = customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getCategory().equals("Books"))
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO,BigDecimal::add);

        System.out.println("Цена всех книг: " + sum);

        BigDecimal averagePrice = sum.divide(BigDecimal.valueOf(countOfBooks), 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Средняя цена книги: " + averagePrice);

        Optional<Product> maxProduct = customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getCategory().equals("Books"))
                .max(Comparator.comparing(Product::getPrice));

        BigDecimal maximum = maxProduct.map(Product::getPrice).orElse(BigDecimal.ZERO);

        System.out.println("Максимальная цена книги: " + maximum);

        Optional<Product> minProduct = customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getCategory().equals("Books"))
                .min(Comparator.comparing(Product::getPrice));

        BigDecimal minimum = minProduct.map(Product::getPrice).orElse(BigDecimal.ZERO);

        System.out.println("Минимальная цена книги: " + minimum);
    }

    public static Map<Long, Integer> task11(List<Customer> customers) {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .collect(Collectors.toMap(
                        Order::getId,
                        order -> order.getProducts().size()
                ));
    }

    public static Map<Customer, List<Order>> task12(List<Customer> customers){
        return customers.stream()
                .collect(Collectors.toMap(
                        customer -> customer,
                        customer -> new ArrayList<>(customer.getOrders())
                ));
    }

    public static Map<Order, Double> task13(List<Customer> customers){
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .collect(Collectors.toMap(
                        order -> order,
                        order -> order.getProducts().stream()
                                .mapToDouble(product -> product.getPrice().doubleValue())
                                .sum()

                ));
    }

    public static Map<String, List<String>> task14(List<Customer> customers){
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.mapping(Product::getName, Collectors.toList())
                ));
    }

    public static Map<String, Product> task15(List<Customer> customers){
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.maxBy(Comparator.comparing(Product::getPrice))
                ))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().orElse(null)
                ));
    }
}