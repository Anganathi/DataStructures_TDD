package co.za.AngaDev;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapImplementationTest {
    private Map map;

    @Before
    public void setUp() throws Exception {
        this.map = new HashMap();
    }

    @Test
    public void testIsEmpty(){
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void testGetReturnsCorrectValue(){
        map.put(5, "Five");
        map.put(1, "One");
        map.put(3, "Three");

        Assert.assertEquals("One", map.get(1));
        Assert.assertEquals("Three", map.get(3));
        Assert.assertEquals("Five", map.get(5));
    }

    @Test
    public void testMapContainsKey(){
        map.put(0, "Daisy");
        map.put(1, "Cobby");
        map.put(2, "Jack Russel Terrier");

        Assert.assertTrue(map.containsKey(2));
    }

    @Test
    public void testRemove(){
        map.put(0, "Normal");
        map.remove(0);

        Assert.assertTrue(map.size()==0);
    }
}