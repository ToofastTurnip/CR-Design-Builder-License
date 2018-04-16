package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import io.zipcoder.zcw_licensebuilder.utils.State;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by leon on 8/23/17.
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

}
