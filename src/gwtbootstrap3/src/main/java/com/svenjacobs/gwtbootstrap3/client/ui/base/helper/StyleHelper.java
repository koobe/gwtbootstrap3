package com.svenjacobs.gwtbootstrap3.client.ui.base.helper;

import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.UIObject;

/**
 * Helper methods regarding CSS styling of UIObjects.
 *
 * @author Sven Jacobs
 */
public final class StyleHelper {

    /**
     * Convenience method for first removing all enum style constants and then adding the single one.
     *
     * @see #removeEnumStyleNames(com.google.gwt.user.client.ui.UIObject, Class)
     * @see #addEnumStyleName(com.google.gwt.user.client.ui.UIObject, com.google.gwt.dom.client.Style.HasCssName)
     */
    public static <E extends Style.HasCssName, F extends Enum<? extends Style.HasCssName>> void addUniqueEnumStyleName(final UIObject uiObject,
                                                                                                                       final Class<F> enumClass,
                                                                                                                       final E style) {
        removeEnumStyleNames(uiObject, enumClass);
        addEnumStyleName(uiObject, style);
    }

    /**
     * Removes all CSS style names specified by an enum that implements {@link Style.HasCssName} from an UIObject.
     *
     * @param uiObject  Object to remove CSS class names from
     * @param enumClass Enum representing CSS class names
     * @param <E>       Enum type implementing {@link Style.HasCssName}
     */
    public static <E extends Enum<? extends Style.HasCssName>> void removeEnumStyleNames(final UIObject uiObject,
                                                                                         final Class<E> enumClass) {

        for (final Enum<? extends Style.HasCssName> constant : enumClass.getEnumConstants()) {
            final String cssClass = ((Style.HasCssName) constant).getCssName();

            if (cssClass != null) {
                uiObject.removeStyleName(cssClass);
            }
        }
    }

    /**
     * Adds enum value style name to UIObject unless style is {@code null}.
     *
     * @param uiObject Object to add style to
     * @param style    Style name
     */
    public static <E extends Style.HasCssName> void addEnumStyleName(final UIObject uiObject,
                                                                     final E style) {

        if (style != null && style.getCssName() != null) {
            uiObject.addStyleName(style.getCssName());
        }
    }

    /**
     * Returns {@code true} if specified style is contained in space-separated list of styles
     *
     * @param styleNames Space-separated list of styles
     * @param style      Style to look for
     * @return True if contains style
     */
    public static boolean containsStyle(final String styleNames,
                                        final String style) {

        if (styleNames == null || style == null) {
            return false;
        }

        final String[] styles = styleNames.split("\\s");

        for (final String s : styles) {
            if (style.equals(s)) {
                return true;
            }
        }

        return false;
    }

    private StyleHelper() {
    }
}