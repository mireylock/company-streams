package org.iesvdm.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 */
public class Exercise2Test extends CompanyDomainForKata
{
    /**
     * Set up a {@link Predicate} that tests to see if a {@link Customer}'s city is "London".
     */
    @Test
    @Tag("KATA")
    public void customerFromLondonPredicate()
    {
        Predicate<Customer> predicate = customer -> customer.getCity().equalsIgnoreCase("london");

        Customer customerFromLondon = new Customer("test customer", "London");

        Assertions.assertTrue(
                predicate.test(customerFromLondon),
                "predicate should accept Customers where city is London");
    }

    @Test
    @Tag("KATA")
    public void doAnyCustomersLiveInLondon()
    {
        boolean anyCustomersFromLondon = this.company.getCustomers()
                .stream()
                .anyMatch(customer -> customer.getCity().equalsIgnoreCase("london"));

        Assertions.assertTrue(anyCustomersFromLondon);
    }

    @Test
    @Tag("KATA")
    public void doAllCustomersLiveInLondon()
    {
        boolean allCustomersFromLondon = this.company.getCustomers().stream()
                .allMatch(customer -> customer.getCity().equalsIgnoreCase("london"));;

        Assertions.assertFalse(allCustomersFromLondon);
    }

    @Test
    @Tag("KATA")
    public void howManyCustomersLiveInLondon()
    {
        int numberOfCustomerFromLondon = (int) this.company.getCustomers().stream()
                        .filter(customer -> customer.getCity().equalsIgnoreCase("london"))
                        .count();

        Assertions.assertEquals(2, numberOfCustomerFromLondon, "Should be 2 London customers");
    }

    @Test
    @Tag("KATA")
    public void getLondonCustomers()
    {

        List<Customer> customersFromLondon = null;

        var expectedNames = List.of("Fred", "Bill");
        Assertions.assertEquals(expectedNames, customersFromLondon.stream().map(Customer::getName).sorted().toList());
    }

    @Test
    @Tag("KATA")
    public void getCustomersWhoDontLiveInLondon()
    {
        List<Customer> customersNotFromLondon = this.company.getCustomers().stream()
                .filter(customer -> !customer.getCity().equalsIgnoreCase("london"))
                .toList();

        var expectedNames = List.of("Mary");
        Assertions.assertEquals(expectedNames, List.of(customersNotFromLondon.get(0).getName()));
    }

    /**
     * Which customers come from London? Which customers do not come from London? Get a collection of both in a single pass.
     */
    @Test
    @Tag("KATA")
    public void getCustomersWhoDoAndDoNotLiveInLondon()
    {
        List<Customer> customers = this.company.getCustomers();

        Assertions.assertEquals(List.of("Fred", "Bill"), List.of("VOID"));

        Assertions.assertEquals(List.of("Mary"), List.of("VOID"));
    }

    /**
     * Implement {@link Company#getCustomerNamed(String)} and get this test to pass.
     */
    @Test
    @Tag("KATA")
    public void findMary()
    {
        Customer mary = this.company.getCustomerNamed("Mary");

        Assertions.assertEquals("Mary", mary.getName(), "customer's name should be Mary");
    }

    /**
     * Implement {@link Company#getCustomerNamed(String)} and get this test to pass.
     */
    @Test
    @Tag("KATA")
    public void findPete()
    {
        Customer pete = this.company.getCustomerNamed("Pete");

        Assertions.assertNull(pete, "Should be null as there is no customer called Pete");
    }
}
