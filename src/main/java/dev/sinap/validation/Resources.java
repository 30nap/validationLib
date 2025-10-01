package dev.sinap.validation;

import java.util.Locale;
import java.util.ResourceBundle;

public class Resources {

    private static final ResourceBundle defaultBundle = ResourceBundle.getBundle("i18n/messages");

    public static String get(String key) {
        return defaultBundle.getString(key);
    }

    public static String get(String key, String localeCode) {
        Locale locale = Locale.of(localeCode);
        ResourceBundle bundle = ResourceBundle.getBundle("i18n/messages", locale);
        return bundle.getString(key);
    }
}
