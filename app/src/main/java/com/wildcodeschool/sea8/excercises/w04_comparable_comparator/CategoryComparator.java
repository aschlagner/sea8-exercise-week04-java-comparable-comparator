package com.wildcodeschool.sea8.excercises.w04_comparable_comparator;
import java.util.*;

public class CategoryComparator implements Comparator<CatalogItem> {
    
    @Override
    public int compare(CatalogItem item1, CatalogItem item2) {
        return item1.getCategory().compareTo(item2.getCategory());
    }
}
