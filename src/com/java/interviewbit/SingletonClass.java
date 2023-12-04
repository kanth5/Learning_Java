package com.java.interviewbit;

public class SingletonClass {
    public static void main(String[] args) {

        WaterJug glass1 = WaterJug.getInstance();
        System.out.println("Remaining water : " + glass1.getWater(1));
        System.out.println("Remaining water : " + glass1.getWater(2));
    }
}

class WaterJug{
    private int waterQuantity = 500;
    private WaterJug(){}
    private static WaterJug object = null;

    // Method to provide the service of Giving Water.
    public int getWater(int quantity){
        waterQuantity -= quantity;
        return waterQuantity;
    }
    // Method to return the object to the user.
    public static WaterJug getInstance(){
        // Will Create a new object if the object is not already created and return the object.
        if(object == null){
            object = new WaterJug();
        }
        return object;
    }
}

