
package org.iesvdm.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Exercise6Test extends CompanyDomainForKata
{
    /**
     * Get a list of the customers' total order values, sorted. Check out the implementation of {@link
     * Customer#getTotalOrderValue()} and {@link Order#getValue()} .
     */
    @Test
    @Tag("KATA")
    public void sortedTotalOrderValue()
    {
        List<Double> sortedTotalValues = null;

        // Don't forget the handy utility methods getFirst() and getLast()...
        Assertions.assertEquals(Double.valueOf(857.0), sortedTotalValues.getLast(), "Highest total order value");
        Assertions.assertEquals(Double.valueOf(71.0), sortedTotalValues.getFirst(), "Lowest total order value");
    }

    /**
     * Get a list of the customers' total order values, sorted. Use primitive doubles instead of boxed Doubles.
     */
    @Test
    @Tag("KATA")
    public void sortedTotalOrderValueUsingPrimitives()
    {
        double[] sortedTotalValues = null;

        // Don't forget the handy utility methods getFirst() and getLast()...
        Assertions.assertEquals(857.0, sortedTotalValues[sortedTotalValues.length-1], 0.0, "Highest total order value");
        Assertions.assertEquals(71.0, sortedTotalValues[0], 0.0, "Lowest total order value");
    }

    /**
     * Find the max total order value across all customers.
     */
    @Test
    @Tag("KATA")
    public void maximumTotalOrderValue()
    {
        Double maximumTotalOrderValue = null;

        Assertions.assertEquals(Double.valueOf(857.0), maximumTotalOrderValue, "max value");
    }

    /**
     * Find the max total order value across all customers, but use primitive double instead of boxed Double.
     */
    @Test
    @Tag("KATA")
    public void maximumTotalOrderValueUsingPrimitives()
    {
        double maximumTotalOrderValue = 0.0;

        Assertions.assertEquals(857.0, maximumTotalOrderValue, 0.0, "max value");
    }

    /**
     * Find the customer with the highest total order value.
     */
    @Test
    @Tag("KATA")
    public void customerWithMaxTotalOrderValue()
    {
        Customer customerWithMaxTotalOrderValue = null;

        Assertions.assertEquals(this.company.getCustomerNamed("Mary"), customerWithMaxTotalOrderValue);
    }

    /**
     * Create some code to get the company's supplier names as a tilde delimited string.
     */
    @Test
    @Tag("KATA")
    public void supplierNamesAsTildeDelimitedString()
    {
        String tildeSeparatedNames = null;

        Assertions.assertEquals(
                "Shedtastic~Splendid Crocks~Annoying Pets~Gnomes 'R' Us~Furniture Hamlet~SFD~Doxins",
                tildeSeparatedNames,
                "tilde separated names");
    }

    /**
     * Deliver all orders going to customers from London.
     */
    @Test
    @Tag("KATA")
    public void deliverOrdersToLondon()
    {
        //Check Fred all delivered
        Assertions.assertTrue(false);
        //Check Mary none delivered
        Assertions.assertFalse(true);
        //Check Bill all delivered
        Assertions.assertTrue(false);
    }
}
