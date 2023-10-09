package org.example.provider;

public class LicenseProvider implements org.example.api.License {
    @Override
    public boolean validate(String licenseContent) {
        return !(licenseContent == null || licenseContent.isEmpty())
               && licenseContent.toUpperCase().startsWith("A");
    }
}
