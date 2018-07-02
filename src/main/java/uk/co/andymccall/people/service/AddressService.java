package uk.co.andymccall.people.service;

import uk.co.andymccall.people.model.Address;

import java.util.Set;

/**
 * The AddressService interface
 *
 * @author  Andy McCall
 * @version 0.2
 * @since   2018-06-26
 */

public interface AddressService {

    public void saveAddressSet(Set<Address> addressSet);
    public Address findDistinctByAddressIdEquals(Long addressId);
    public Address findDistinctByHouseNumberEqualsAndPostCodeEquals(int houseNumber, String postCode);

}
