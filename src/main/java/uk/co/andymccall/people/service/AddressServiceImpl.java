package uk.co.andymccall.people.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.andymccall.people.model.Address;
import uk.co.andymccall.people.repository.AddressRepository;

import javax.transaction.Transactional;
import java.util.Set;

/**
 * The AddressServiceImpl class
 *
 * @author  Andy McCall
 * @version 0.2
 * @since   2017-09-17
 */

@Service("addressService")
@Transactional
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address findDistinctByAddressIdEquals(Long addressId) {
        return addressRepository.findDistinctByAddressIdEquals(addressId);
    }

    public void saveAddressSet(Set<Address> addressSet) {
        addressRepository.save(addressSet);
    }

    public Address findDistinctByHouseNumberEqualsAndPostCodeEquals(int houseNumber, String postCode) {
        return addressRepository.findDistinctByHouseNumberEqualsAndPostCodeEquals(houseNumber, postCode);
    }


}
