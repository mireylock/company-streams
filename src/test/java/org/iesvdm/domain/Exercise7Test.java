package org.iesvdm.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;


public class Exercise7Test extends CompanyDomainForKata
{
    /**
     * Create a Multimap where the keys are the names of cities and the values are the Customers from those cities.
     * A Customer is only associated to one city.
     */
    @Test
    @Tag("KATA")
    public void customersByCity()
    {
        //Multimap<String, Customer> multimap = null;
        Map<String, List<Customer>> multimap = null;

        List<Customer> expectedLiphookList = null;
        List<Customer> expectedLondonList = null;
        Assertions.assertEquals(expectedLiphookList, multimap.get("Liphook"));
        Assertions.assertEquals(expectedLondonList, multimap.get("London"));
    }

    /**
     * Create a Multimap where the keys are the names of items and the values are the Suppliers that supply them.
     * A Supplier is associated to many item names.
     */
    @Test
    @Tag("KATA")
    public void itemsBySuppliers()
    {
        Map<String, List<Supplier>> itemsToSuppliers = null;

       Assertions.assertEquals( 2, itemsToSuppliers.get("sofa").size());
    }

    /**
     * Delete this whole method when you're done. It's just a reminder.
     */
    @Test
    @Tag("KATA")
    public void reminder()
    {
        Assertions.fail("Refactor setUpCustomersAndOrders() in the super class to not have so much repetition.");
    }
}
