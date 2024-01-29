
package org.iesvdm.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
        Assertions.assertEquals(5, this.company.getOrders().size());
    }

    /**
     * Get all items that have been ordered by anybody.
     */
    @Test
    @Tag("KATA")
    public void findItemNames()
    {
        List<LineItem> allOrderedLineItems = this.company.getOrders().stream()
                .flatMap(order -> order.getLineItems().stream())
                .toList();

        Set<String> actualItemNames = allOrderedLineItems.stream()
                .map(lineItem -> lineItem.getName())
                .collect(Collectors.toSet());

        var expectedItemNames = Set.of(
                "shed", "big shed", "bowl", "cat", "cup", "chair", "dog",
                "goldfish", "gnome", "saucer", "sofa", "table");
        Assertions.assertEquals(expectedItemNames, actualItemNames);
    }

    @Test
    @Tag("KATA")
    public void findCustomerNames()
    {
        List<String> names = this.company.getCustomers().stream()
                .map(customer -> customer.getName())
                .toList();

        var expectedNames = List.of("Fred", "Mary", "Bill");
        Assertions.assertEquals(expectedNames, names);
    }
}
