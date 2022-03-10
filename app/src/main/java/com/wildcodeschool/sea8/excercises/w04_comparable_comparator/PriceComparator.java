package com.wildcodeschool.sea8.excercises.w04_comparable_comparator;
import java.util.*;

public class PriceComparator implements Comparator<CatalogItem> {
    
    @Override
    public int compare(CatalogItem item1, CatalogItem item2) {
        // return item1.getPrice().compareTo(item2.getPrice()) // ALternative
        if (item1.getPrice().compareTo(item2.getPrice()) == 1) return 1;  // p1 > p2
        if (item1.getPrice().compareTo(item2.getPrice()) == -1 ) return -1;  // p1 < p2
        return 0;
    }
}
