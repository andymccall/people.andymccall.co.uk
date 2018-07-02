package uk.co.andymccall.people.repository;

import org.springframework.data.repository.CrudRepository;
import uk.co.andymccall.people.model.Address;

import java.util.Set;

/**
 * The AddressRepository class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-09-17
 */

public interface AddressRepository extends CrudRepository<Address,Long> {
    public void save(Set<Address> addressSet);
    public Address findDistinctByAddressIdEquals(Long addressId);
    public Address findDistinctByHouseNumberEqualsAndPostCodeEquals(int houseNumber, String postCode);
}
