package co.za.AngaDev;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetImplementationTest {
    private Set<Person> personSet;

    @Before
    public void setUp() throws Exception {
        this.personSet = new HashSet<>();
    }

    @Test
    public void testAdd(){
        Person p = new Person("Anganathi", "Ngodwane", 23, 6.5, 'M');
        personSet.add(p);

        Assert.assertFalse(personSet.isEmpty());
    }

    @Test
    public void count(){
        Person p  = new Person("Kruben", "Naidoo", 48, 6.8,'M');
        Person p1 = new Person("Wilhelm Coenraad", "Rothman", 60, 6.5, 'M');
        Person p2 = new Person("Arinze", "Anikwue", 36, 6.9,'M');

        personSet.add(p);
        personSet.add(p1);
        personSet.add(p2);

        Assert.assertEquals(3, personSet.size());
    }

    @Test
    public void testRemoveAll(){
        Person p  = new Person("Kruben", "Naidoo", 48, 6.8,'M');
        Person p1 = new Person("Wilhelm Coenraad", "Rothman", 60, 6.5, 'M');

        personSet.add(p);
        personSet.add(p1);

        personSet.removeAll(personSet);

        Assert.assertTrue(personSet.isEmpty());
    }

    @Test
    public void testContains(){
        Person p1 = new Person("Wilhelm Coenraad", "Rothman", 60, 6.5, 'M');
        Person p2 = new Person("Arinze", "Anikwue", 36, 6.9,'M');

        personSet.add(p2);

        //assert that object p2 has been successfully added
        Assert.assertEquals(true, personSet.contains(p2));

        //confirm that the object has been really added
        Assert.assertTrue(personSet.size() == 1);
    }
}