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
public class Staff {
    private final String NAME;
    private String ID;
    private double salesValue;
    private int salesNumber;
    private boolean manager;
    
    public Staff(String staffName, String staffId, boolean isManager){
        NAME = staffName;
        ID = staffId;
        manager = isManager;
    }
    public String getName(){
        return NAME;
    }
    public double getSalesValue(){
        return this.salesValue;
    }
    public int getSalesNumber(){
        return this.salesNumber;
    }
    public boolean isManager(){
        return this.manager;
    }
    public void setManager(boolean man){
        this.manager = man;
    }
    public String toString(){
        return "";
    }
         
}
