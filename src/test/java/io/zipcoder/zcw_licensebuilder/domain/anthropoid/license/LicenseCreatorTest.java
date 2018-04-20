package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 8/23/17.
 */
public class LicenseCreatorTest {

    @Test
    public void testCreateMockLicenseBirthDate() {
        LicenseCreator licenseCreator = new LicenseCreator();
        License testLicense = licenseCreator.createMockLicense();
        Assert.assertNotNull(testLicense.getBirthDate());
    }

    @Test
    public void testCreateMockLicenseCity() {
        LicenseCreator licenseCreator = new LicenseCreator();
        License testLicense = licenseCreator.createMockLicense();
        Assert.assertNotNull(testLicense.getCity());
    }

    @Test
    public void testCreateMockLicenseExpirationDate() {
        LicenseCreator licenseCreator = new LicenseCreator();
        License testLicense = licenseCreator.createMockLicense();
        Assert.assertNotNull(testLicense.getExpirationDate());
    }

    @Test
    public void testCreateMockLicenseFirstName() {
        LicenseCreator licenseCreator = new LicenseCreator();
        License testLicense = licenseCreator.createMockLicense();
        Assert.assertNotNull(testLicense.getFirstName());
    }

    @Test
    public void testCreateMockLicenseId() {
        LicenseCreator licenseCreator = new LicenseCreator();
        License testLicense = licenseCreator.createMockLicense();
        Assert.assertNotNull(testLicense.getId());
    }

    @Test
    public void testCreateMockLicenseIssueDate() {
        LicenseCreator licenseCreator = new LicenseCreator();
        License testLicense = licenseCreator.createMockLicense();
        Assert.assertNotNull(testLicense.getIssueDate());
    }

    @Test
    public void testCreateMockLicenseLastName() {
        LicenseCreator licenseCreator = new LicenseCreator();
        License testLicense = licenseCreator.createMockLicense();
        Assert.assertNotNull(testLicense.getLastName());
    }

    @Test
    public void testCreateMockLicenseLicenseClass() {
        LicenseCreator licenseCreator = new LicenseCreator();
        License testLicense = licenseCreator.createMockLicense();
        Assert.assertNotNull(testLicense.getLicenseClass());
    }

    @Test
    public void testCreateMockLicenseMiddleName() {
        LicenseCreator licenseCreator = new LicenseCreator();
        License testLicense = licenseCreator.createMockLicense();
        Assert.assertNotNull(testLicense.getMiddleName());
    }

    @Test
    public void testCreateMockLicenseState() {
        LicenseCreator licenseCreator = new LicenseCreator();
        License testLicense = licenseCreator.createMockLicense();
        Assert.assertNotNull(testLicense.getState());
    }

    @Test
    public void testCreateMockLicenseStreetAddress() {
        LicenseCreator licenseCreator = new LicenseCreator();
        License testLicense = licenseCreator.createMockLicense();
        Assert.assertNotNull(testLicense.getStreetAddress());
    }

}
