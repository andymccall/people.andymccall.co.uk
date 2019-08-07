package uk.co.andymccall.people.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.co.andymccall.people.model.*;
import uk.co.andymccall.people.service.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class PeopleController {

    private static final Logger logger =
            LoggerFactory.getLogger(PeopleController.class);

    EmailAddressService emailAddressService;
    PersonService personService;
    TitleService titleService;
    TownService townService;
    CountyService countyService;
    AddressService addressService;

    @Autowired
    public void setEmailAddressService(EmailAddressService emailAddressService) {
        this.emailAddressService = emailAddressService;
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @Autowired
    public void setTitleService(TitleService titleService) {
        this.titleService = titleService;
    }

    @Autowired
    public void setTownService(TownService townService) {
        this.townService = townService;
    }

    @Autowired
    public void setCountyService(CountyService countyService) {
        this.countyService = countyService;
    }

    @Autowired
    public void setAddressService(AddressService addressService) {
        this.addressService = addressService;
    }

    @RequestMapping(value = {"/development-create"}, method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public @ResponseBody
    String developmentCreate() {

        logger.debug("Entering developmentCreate");

        Title title = new Title();
        Person person = new Person();

        title.setTitleId(1);
        title.setTitle("Mr.");

        person.setTitle(title);
        person.setFirstName("Andrew");
        person.setLastName("McCall");
        person.setPreferredName("Andy");

        person.setGender(Gender.MALE);

        person.setDateOfBirth(1978,1,2);

        person.setWeight(110);
        person.setHeight(167);

        person.setEyeColour("Grey / Green");

        EmailAddress emailAddress = new EmailAddress();
        emailAddress.setEmailAddress("andy.mccall@gmail.com");
        emailAddress.setContactType(ContactType.PRIMARY);
        emailAddress.setVerified(true);
        person.addEmailAddress(emailAddress);

        personService.savePerson(person);

        return "OK";
    }


    @ApiOperation(value = "Read all users matching given filter",
                  notes = "Will get all the users for the given filter")
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public @ResponseBody
    List<Person> getAllPeople() {

        logger.debug("Entering getAllPeople");

        return personService.findAll();
    }

    @ApiOperation(value = "Read a single person using their personId ",  notes = "Will return a single person details if the personId exists")
    @RequestMapping(value = "/id/{personId}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public @ResponseBody
    ResponseEntity<Person> getPerson(@PathVariable Long personId) {

        logger.debug("Entering getPerson");

        Person person = personService.findDistinctByPersonIdEquals(personId);
        ResponseEntity response;

        if (person != null) {
            logger.debug("Person found, returning OK");
            response = new ResponseEntity<Person>(person, HttpStatus.OK);
        } else {
            logger.debug("Person not found, returning NOT_FOUND");
            response = new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        logger.debug("Leaving getPerson");
        return response;
    }


}
