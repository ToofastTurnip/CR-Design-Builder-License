package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import io.zipcoder.zcw_licensebuilder.utils.State;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by leon on 8/23/17.
 * Improved by a dingus today
 */

@Entity
public class License {

    @Id
    @GeneratedValue
    @Column(name = "LICENSE_ID")
    private Long id;

    @Column(name = "LICENSE_FIRST_NAME")
    private String firstName;

    @Column(name = "LICENSE_LAST_NAME")
    private String lastName;

    @Column(name = "LICENSE_MIDDLE_NAME")
    private String middleName;

    @Column(name = "LICENSE_STREET_ADDRESS")
    private String streetAddress;

    @Column(name = "LICENSE_CITY")
    private String city;

    @Column(name = "LICENSE_STATE")
    private State state;

    @Column(name = "LICENSE_IS_FEMALE")
    private boolean isFemale;

    @Column(name = "LICENSE_BIRTH_DATE")
    private Date birthDate;

    @Column(name = "LICENSE_EXPIRATION_DATE")
    private Date expirationDate;

    @Column(name = "LICENSE_ISSUE_DATE")
    private Date issueDate;

    @Column(name = "LICENSE_CLASS")
    private Character licenseClass;

    public License(String firstName, String lastName, String middleName, String streetAddress, String city, State state, boolean isFemale, Date birthDate, Date expirationDate, Date issueDate, Character licenseClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.isFemale = isFemale;
        this.birthDate = birthDate;
        this.expirationDate = expirationDate;
        this.issueDate = issueDate;
        this.licenseClass = licenseClass;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public State getState() {
        return state;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Character getLicenseClass() {
        return licenseClass;
    }

}
