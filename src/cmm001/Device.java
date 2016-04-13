
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmm001;

/**
 *
 * @author 1514414
 */
public class Device {
    private final String NAME;
    private double basicCost;
    private int stock;
    private static double cost64GB = 50.0, cost128GB =100.0, cost256GB = 200.0;


public Device(String deviceName,double deviceCost,int deviceStock){
    NAME = deviceName; 
    basicCost = deviceCost;
    stock = deviceStock;
}
public String getName(){
    return NAME;
}
public void setBasicCost(double deviceCost){
basicCost = deviceCost;
}
public int checkStock(){
    return stock;
}
public void sell(){
    stock--;
}
public void addStock(int number){
    stock += number;
}
public double getCost(int memory){
    switch(memory){
        case 64:
            basicCost += cost64GB;
        break;
        case 128:
            basicCost += cost128GB;
        break;
        case 256:
            basicCost += cost256GB;
        break;
        default:
           return this.basicCost; 
    }
    return basicCost;
}
public String toString(){
    return "The name of the Device is: "
            +this.NAME+" with a cost of "+this.basicCost+
            " and total stock is: "+this.checkStock();
}
public static void setMemoryPrices(double cost64GB, double cost128GB, double cost256GB){
    Device.cost64GB = cost64GB;
    Device.cost128GB = cost128GB;
    Device.cost256GB = cost256GB;
}
}