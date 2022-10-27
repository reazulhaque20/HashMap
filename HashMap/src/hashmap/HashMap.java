/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

/**
 *
 * @author Reazul-System
 */
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcurrentHashMap<String, String> cht = new ConcurrentHashMap<>();
        
        cht.put("reaz", "Brahmanbaria");
        cht.put("firoz", "Dinajpur");
        cht.put("rupak", "Mirpur");
        
        for (Map.Entry<String, String> entry : cht.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    
}
