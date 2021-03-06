package org.gwtbootstrap3.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.dom.client.Style;
import org.gwtbootstrap3.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap3.client.ui.constants.ProgressBarType;
import org.gwtbootstrap3.client.ui.constants.Styles;

/**
 * @author Joshua Godi
 */
public class ProgressBar extends Div implements HasType<ProgressBarType> {
    private final Span span = new Span();

    public ProgressBar() {
        // Default attributes
//        getElement().setAttribute(Attributes.ROLE, "progressbar");
//        getElement().setAttribute("aria-valuemin", "0");
//        getElement().setAttribute("aria-valuemax", "100");

        // Default style
        setStyleName(Styles.PROGRESS_BAR);

        // Progress text
        add(span);
    }

    public void setSrOnly(final boolean srOnly) {
        span.setStyleName(Styles.SR_ONLY, srOnly);
    }

    public void setText(final String text) {
        span.setText(text);
    }

    public String getText() {
        return span.getText();
    }

    public void setPercent(final int percent) {
        getElement().getStyle().setWidth(percent, Style.Unit.PCT);
    }

    public int getPercent() {
        final String width = getElement().getStyle().getWidth();
        return width == null ? 0 : Integer.valueOf(width.substring(0, width.indexOf("%")));
    }

    @Override
    public void setType(final ProgressBarType type) {
        StyleHelper.addEnumStyleName(this, type);
    }

    @Override
    public ProgressBarType getType() {
        return ProgressBarType.fromStyleName(getStyleName());
    }
}
