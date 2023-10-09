package org.example.api;

import java.util.ServiceLoader;

public class LicenseFactory {

    private LicenseFactory() {
    }


    public static License getValidator(Class<?> clazz) {
        var loader = ServiceLoader.load(License.class, clazz.getClassLoader());

        if (loader.findFirst().isEmpty()) {
            throw new IllegalStateException("No license validator impl found for " + License.class.getName() + "!");
        }

        return loader.findFirst().get();
    }
}
