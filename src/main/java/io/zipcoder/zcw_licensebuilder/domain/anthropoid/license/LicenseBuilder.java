package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import io.zipcoder.zcw_licensebuilder.utils.State;

import java.util.Date;

public class LicenseBuilder {

    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String streetAddress;
    private String city;
    private State state;
    private boolean isFemale;
    private Date birthDate;
    private Date expirationDate;
    private Date issueDate;
    private Character licenseClass;

    public LicenseBuilder() {}

    public LicenseBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public LicenseBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public LicenseBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LicenseBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public LicenseBuilder setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    public LicenseBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public LicenseBuilder setState(State state) {
        this.state = state;
        return this;
    }

    public LicenseBuilder setFemale(boolean female) {
        isFemale = female;
        return this;
    }

    public LicenseBuilder setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public LicenseBuilder setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public LicenseBuilder setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    public LicenseBuilder setLicenseClass(Character licenseClass) {
        this.licenseClass = licenseClass;
        return this;
    }

    public License build() {
        return new License(firstName, lastName, middleName, streetAddress, city, state, isFemale, birthDate, expirationDate, issueDate, licenseClass);
    }

}
