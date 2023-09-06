package com.smartstore.Global;

import com.smartstore.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;
    static {
        cart = new ArrayList<>();
    }
}
