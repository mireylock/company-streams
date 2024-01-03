
package org.iesvdm.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;


public class Exercise5Test extends CompanyDomainForKata
{
    /**

     * Get the order values that are greater than 1.5.
     */
    @Test
    @Tag("KATA")
    public void filterOrderValues()
    {
        List<Order> orders = this.company.getMostRecentCustomer().getOrders();
        List<Double> orderValues = null;
        List<Double> filtered = null;

        var expectedValues = List.of(372.5, 1.75);
        Assertions.assertEquals(expectedValues, filtered);
        Assertions.assertTrue(this.company.getMostRecentCustomer().getOrders() instanceof List);
        this.company.getMostRecentCustomer().getOrders().add(null);
        Assertions.assertTrue(this.company.getMostRecentCustomer().getOrders().contains(null));
    }

    /**
     * Same as above exercise, but use primitive doubles instead of boxed Doubles.
     */
    @Test
    @Tag("KATA")
    public void filterOrderValuesUsingPrimitives()
    {
        List<Order> orders = this.company.getMostRecentCustomer().getOrders();
        double[] orderValues = null;
        double[] filtered = null;

        var expectedValues = new double[] {372.5, 1.75};
        Assertions.assertEquals(expectedValues, filtered);
    }

    /**
     * Get the actual orders (not their double values) where those orders have a value greater than 2.0.
     */
    @Test
    @Tag("KATA")
    public void filterOrders()
    {
        List<Order> orders = this.company.getMostRecentCustomer().getOrders();
        List<Order> filtered = null;

        var expectedValues = List.of(this.company.getMostRecentCustomer().getOrders().get(0));
        Assertions.assertEquals(expectedValues, filtered);
        Assertions.assertTrue(this.company.getMostRecentCustomer().getOrders() instanceof List);
        this.company.getMostRecentCustomer().getOrders().add(null);
        Assertions.assertTrue(this.company.getMostRecentCustomer().getOrders().contains(null));
    }
}
