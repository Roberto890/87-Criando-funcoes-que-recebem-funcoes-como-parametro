package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
    
    public double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for (Product p : list){
            //retirar esse if e colocar a verificação como parametro
            //if (p.getName().charAt(0) == 'T'){
            if (criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }

}