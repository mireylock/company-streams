
package org.iesvdm.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

/**
 * Below are links to APIs that may be helpful during these exercises.
 */
public class Exercise3Test extends CompanyDomainForKata
{
    /**
     * Improve {@link Company#getOrders()} without breaking this test.
     */
    @Test
    @Tag("KATA")
    public void improveGetOrders()
    {
        // Delete this line - it's a reminder
        Assertions.fail("Improve getOrders() without breaking this test");
        Assertions.assertEquals(5, this.company.getOrders().size());
    }

    /**
     * Get all items that have been ordered by anybody.
     */
    @Test
    @Tag("KATA")
    public void findItemNames()
    {
        List<LineItem> allOrderedLineItems = null;
        Set<String> actualItemNames = null;

        var expectedItemNames = Set.of(
                "shed", "big shed", "bowl", "cat", "cup", "chair", "dog",
                "goldfish", "gnome", "saucer", "sofa", "table");
        Assertions.assertEquals(expectedItemNames, actualItemNames);
    }

    @Test
    @Tag("KATA")
    public void findCustomerNames()
    {
        List<String> names = null;

        var expectedNames = List.of("Fred", "Mary", "Bill");
        Assertions.assertEquals(expectedNames, names);
    }
}
