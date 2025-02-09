package org.example.service.factory;

import org.example.service.impl.AirShipping;
import org.example.service.impl.RoadShipping;
import org.example.service.impl.SeaShipping;
import org.example.service.interfaces.Shipping;

public class ShippingFactory {
    public Shipping getShipping(String shippingType){
        if(shippingType == null){
            return null;
        }
        if (shippingType.equalsIgnoreCase("AIR")) {
            return new AirShipping();
        } else if (shippingType.equalsIgnoreCase("SEA")) {
            return new SeaShipping();
        } else if (shippingType.equalsIgnoreCase("ROAD")) {
            return new RoadShipping();
        }
        return null;
    }
}
