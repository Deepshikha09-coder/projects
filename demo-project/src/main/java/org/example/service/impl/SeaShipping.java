package org.example.service.impl;

import org.example.service.interfaces.Shipping;

public class SeaShipping implements Shipping {
    @Override
    public void ship() {
        System.out.println(" SHipping through Sea");
    }
}
