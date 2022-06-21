package s12_java_collection_framwork.excercise.arraylist.utils;

import s12_java_collection_framwork.excercise.arraylist.modle.Product;

import java.util.Comparator;

public class SortAscendingPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getProductPrice() - o2.getProductPrice() > 0) {
            return 1;
        } else if (o1.getProductPrice() - o2.getProductPrice() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
