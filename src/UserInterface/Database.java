/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface;

import java.util.Vector;

/**
 *
 * @author viandwi24
 */
public class Database {
    Database() {
        Vector<Object[]> menus = new Vector<>();
        
        // insert        
        menus.add(new Object[]{ "Nasi Goreng", 5, 5000 });
        
        // 
        for (Object[] row : menus) {
            System.out.println(row[0].toString());
            System.out.println(row[1].toString());
            System.out.println(row[2].toString());
        }
    }
}
