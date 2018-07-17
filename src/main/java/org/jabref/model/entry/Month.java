package org.jabref.model.entry;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Optional;

import org.jabref.model.strings.StringUtil;

import org.apache.commons.lang3.StringUtils;

/**
 * Represents a Month of the Year.
 */
public enum Month {

    JANUARY("January", "jan", 1),
    FEBRUARY("February", "feb", 2),
    MARCH("March", "mar", 3),
    APRIL("April", "apr", 4),
    MAY("May", "may", 5),
    JUNE("June", "jun", 6),
    JULY("July", "jul", 7),
    AUGUST("August", "aug", 8),
    SEPTEMBER("September", "sep", 9),
    OCTOBER("October", "oct", 10),
    NOVEMBER("November", "nov", 11),
    DECEMBER("December", "dec", 12);

    private final String fullName;
    private final String shortName;
    private final String twoDigitNumber;
    private final int number;

    Month(String fullName, String shortName, int number) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.twoDigitNumber = String.format("%02d", number);
        this.number = number;
    }


    /**
     * Find month by one-based number.
     * If the number is not in the valid range, then an empty Optional is returned.
     *
     * @param number 1-12 is valid
     */
    public static Optional<Month> getMonthByNumber(int number) {
        for (Month month : Month.values()) {
            if (month.number == number) {
                return Optional.of(month);
            }
        }
        return Optional.empty();
    }

    /**
     * Find month by shortName (3 letters) case insensitive.
     * If no matching month is found, then an empty Optional is returned.
     *
     * @param shortName "jan", "feb", ...
     */
    public static Optional<Month> getMonthByShortName(String shortName) {
        for (Month month : Month.values()) {
            if (month.shortName.equalsIgnoreCase(shortName)) {
                return Optional.of(month);
            }
        }
        return Optional.empty();
    }

    /**
     * This method accepts three types of months:
     * - Single and Double Digit months from 1 to 12 (01 to 12)
     * - 3 Digit BibTeX strings (jan, feb, mar...) possibly with # prepended
     * - Full English Month identifiers.
     *
     * @param value the given value
     * @return the corresponding Month instance
     */
    public static Optional<Month> parse(String value) {
        if (StringUtil.isBlank(value)) {
            return Optional.empty();
        }

        // Much more liberal matching covering most known abbreviations etc.
        String testString = value.replace("#", "").trim();
        if (testString.length() > 3) {
            testString = testString.substring(0, 3);
        }

        Optional<Month> month = Month.getMonthByShortName(testString);
        if (month.isPresent()) {
            return month;
        }

        month = Month.parseGermanShortMonth(testString);
        if (month.isPresent()) {
            return month;
        }

        try {
            int number = Integer.parseInt(value);
            return Month.getMonthByNumber(number);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    /**
     * Parses a month having the string in German standard form such as
     * "Oktober" or in German short form such as "Okt"
     *
     * @param value,
     *            a String that represents a month in German form
     * @return the corresponding month instance, empty if input is not in German
     *         form
     */
    private static Optional<Month> parseGermanShortMonth(String value) {
        if ("Mae".equalsIgnoreCase(value) || "Maerz".equalsIgnoreCase(value) || "Mär".equalsIgnoreCase(value)) {
            return Month.getMonthByNumber(3);
        }

        try {
            YearMonth yearMonth = YearMonth.parse("1969-" + StringUtils.capitalize(value),
            		DateTimeFormatter.ofPattern("yyyy-MMM", Locale.GERMAN));
            return Month.getMonthByNumber(yearMonth.getMonthValue());
        } catch (DateTimeParseException e) {
            return Optional.empty();
        }
    }

    /**
     * Returns the name of a Month in a short (3-letter) format. (jan, feb, mar, ...)
     *
     * @return 3-letter identifier for a Month
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Returns the month in JabRef format. The format is the short 3-digit name surrounded by a '#'.
     * Example: #jan#, #feb#, etc.
     *
     * See https://github.com/JabRef/jabref/issues/263#issuecomment-151246595 for a discussion on that thing.
     * This seems to be an <em>invalid</em> format in terms of plain BiBTeX, but a <em>valid</em> format in the case of JabRef
     *
     * @return Month in JabRef format
     */
    public String getJabRefFormat() {
        return String.format("#%s#", shortName);
    }

    /**
     * Returns the number of the Month in a 1-indexed fashion: 1 -> January, 2 -> February etc.
     * @return number of the month in the Year
     */
    public int getNumber() {
        return number;
    }

    /**
     * Returns the name of the long in unabbreviated english.
     * @return Month
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Returns the number of the Month in a 1-indexed fashion using exactly two digits: 01 -> January, 02 -> February...
     * @return number of the month in the Year with two digits
     */
    public String getTwoDigitNumber() {
        return twoDigitNumber;
    }
}
