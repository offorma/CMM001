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
public class Sale {
    private Device device;
    private int memory;
    private static double totalValue = 0.0;
    private static int totalNumber = 0;
    
    public Sale (Device device, int memoryInstalled){
        this.device = device;
        switch (memoryInstalled){
            case 32:
                memory = memoryInstalled;
            break;
            case 64:
                memory = memoryInstalled;
            break;
            case 128:
                memory = memoryInstalled;
            break;
            case 256:
                memory = memoryInstalled;
            break;
            default:
                memory = 32;
            break;
        }
        Sale.totalNumber++;
        device.sell();
        totalValue +=this.getCost();
    }
    public double getCost(){
        return device.getCost(memory);
    }
    public Device getDevice(){
        return this.device;
    }
    public int getMemory(){
         return this.memory;
    }
    public String toString(){
        return "This sale is for: "+device.getName()
                +"with a memory of: "+this.getMemory();
    }
    public static double getTotalValue(){
        return Sale.totalValue;
    }
    public static int getTotalNumber(){
        return Sale.totalNumber;
    }
}
    
