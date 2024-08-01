/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdvencedAddMutliply;
/**
 *
 * @author yuval keshet
 */
public class AgeAddMultply implements ObjectAddMultplyIntConstant<Integer> {
    private final int constant;
    public AgeAddMultply(int constant){
        this.constant=constant;
    }
    @Override
    public Integer AddConstant(Integer object){
        return object + constant;
    }
    @Override
    public Integer MultiplyConstant(Integer object){
        return object * constant;
    }

    @Override
    public Integer GetConstant() {
        return constant;
    }

    @Override
    public void PrintAddMultiply(Integer object) {
        System.out.print(this.GetConstant()+ " Years Older Then age is "+ this.AddConstant(object) +" and "+this.GetConstant() + " Times Older than the age is " +this.MultiplyConstant(object));
    }
}
