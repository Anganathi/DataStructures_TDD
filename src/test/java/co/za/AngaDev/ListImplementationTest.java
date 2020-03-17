package co.za.AngaDev;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class ListImplementationTest {
    private List list;

    @Before
    //Set up any empty LinkedList before each test
    public void setUp() throws Exception {
        this.list = new LinkedList();
    }

    @Test
    public void testAdd(){
        list.add("Anga");

        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testAddAtIndex(){
        list.add("Lorna");
        list.add("Lerato");
        list.add("Sinovuyo");
        list.add(1, "Anganathi");

        Assert.assertEquals("Lerato", list.get(1));
    }

    @Test
    public void setTest(){
        list.add("Frank");
        list.add("Clive");
        list.add("Gideon");
        list.set(2, "Holy Spirit");

        Assert.assertTrue(list.get(2)=="Holy Spirit");
    }

    @Test
    public void removeTest(){
        list.add(0, "Applications Development Practice 3");
        list.add(1, "Intercessory Sheets");
        list.add(2,"Ford Fiesta");

        list.remove("Ford Fiesta");
        list.remove(0);
        System.out.println(list.get(0));

        Assert.assertTrue( list.size()==1);
    }
}