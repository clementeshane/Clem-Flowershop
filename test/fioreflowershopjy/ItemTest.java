/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fioreflowershopjy;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JiaYao
 */
public class ItemTest {
    
    private Item I1, I2;
    
    public ItemTest() {
    }
    
    @Before
    public void setUp() {
        I1 = new Item(1, "Roses", 1, 4.50);
        I2 = new Item(2, "Sunflower", 1, 5.00);
    }

    /**
     * Test of getId method, of class Item.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 1;
        int result = I1.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Item.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        I1.setId(id);
    }

    /**
     * Test of getName method, of class Item.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Roses";
        String result = I1.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Item.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Roses";
        I1.setName(name);
    }

    /**
     * Test of getQuantity method, of class Item.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        int expResult = 1;
        int result = I1.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity method, of class Item.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 1;
        I1.setQuantity(quantity);
        
    }

    /**
     * Test of getPrice method, of class Item.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 4.50;
        double result = I1.getPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPrice method, of class Item.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 4.50;
        I1.setPrice(price);
    }

}
