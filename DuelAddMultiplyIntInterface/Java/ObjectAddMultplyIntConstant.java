/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AdvencedAddMutliply;

/**
 *
 * @author yuval keshet
 * @param <T>
 */
public interface ObjectAddMultplyIntConstant<T> {
    Integer GetConstant();
    T AddConstant(T object);
    T MultiplyConstant(T object);
    void PrintAddMultiply(T object);
}
