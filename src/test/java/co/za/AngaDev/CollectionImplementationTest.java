package co.za.AngaDev;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class CollectionImplementationTest {
    private Collection <Person> personCollection;
    private Person p;

    @Before
    public void setUp() throws Exception {
        this.personCollection = new ArrayList<>();
        personCollection = new ArrayList<>();
        p = new Person("Anganathi", "Ngodwane", 23, 6.5, 'M');

    }


    @Test
    public void testCount(){
        personCollection.add(p);
        int size = personCollection.size();

        Assert.assertEquals(1, size);
    }

    @Test
    public  void testEmpty(){
        personCollection.clear();
        Assert.assertTrue(personCollection.isEmpty());
    }

    @Test
    public void testExistence(){
        Person p1 = new Person("Akona", "Ngodwane", 42, 7.0, 'F');
        personCollection.add(p);
        personCollection.add(p1);

        Assert.assertEquals("Akona", p1.getFirstName());
    }

    @Test
    public void testRemove(){
        personCollection.remove(p);

        Assert.assertEquals(0, personCollection.size());
    }
}