package application;

import java.util.List;
import java.util.ArrayList;
import entities.Product;
import model.services.ProductService;

public class Program {

    public static void main(final String[] args) {

        final List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        //FAZENDO ASSIM VAI FUNCIONAR PARA QUALQUER PREDICADO ASSIM NAO MEXENDO NA FUNCAO E SIM NO PARAMETRO        
        //double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        //double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        double sum = ps.filteredSum(list, p -> p.getPrice() < 100.00);

        System.out.println("Sum = " + String.format("%.2f", sum));
        
    }
}