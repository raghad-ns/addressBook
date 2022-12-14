/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aderessbook;

import javax.swing.JOptionPane;

/**
 *
 * @author smart
 */
public class invalidEmailFormatException extends Exception{
    public invalidEmailFormatException(String message) {
       super(message);
    }
}
