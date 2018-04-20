package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import io.zipcoder.zcw_licensebuilder.utils.MockDataGenerator;
import io.zipcoder.zcw_licensebuilder.utils.State;

public class LicenseCreator {

    public License createMockLicense() {
        LicenseBuilder licenseBuilder = new LicenseBuilder();
        return licenseBuilder
                .setBirthDate(MockDataGenerator.createMonthDayYear(1970, 2000))
                .setCity(MockDataGenerator.createString('a', 'z', 16))
                .setExpirationDate(MockDataGenerator.createMonthDayYear(2018, 2020))
                .setFemale(MockDataGenerator.createBoolean(50))
                .setFirstName(MockDataGenerator.createString('a', 'z', 16))
                .setLastName(MockDataGenerator.createString('a', 'z', 16))
                .setMiddleName(MockDataGenerator.createString('a', 'z', 16))
                .setId(MockDataGenerator.createLong(1L, 999L))
                .setIssueDate(MockDataGenerator.createMonthDayYear(2010, 2017))
                .setLicenseClass(MockDataGenerator.createCharacter('a', 'g'))
                .setState(State.DELAWARE)
                .setStreetAddress(MockDataGenerator.createString('a', 'z', 25))
                .build();
    }

}
