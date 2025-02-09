package org.example.service.impl;

import org.example.service.interfaces.Shipping;

public class AirShipping implements Shipping {
    @Override
    public void ship() {
        System.out.println(" SHipping through Air");
    }
}
