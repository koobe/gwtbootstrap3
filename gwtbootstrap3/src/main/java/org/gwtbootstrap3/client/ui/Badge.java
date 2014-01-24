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

import com.google.gwt.user.client.DOM;
import org.gwtbootstrap3.client.ui.base.AbstractTextWidget;
import org.gwtbootstrap3.client.ui.base.mixin.PullMixin;
import org.gwtbootstrap3.client.ui.constants.Pull;
import org.gwtbootstrap3.client.ui.constants.Styles;

/**
 * Badge for highlighting new or unread items.
 * <p/>
 * <h3>UiBinder example</h3>
 * <pre>{@code
 *     <b:Badge>42</b:Badge>
 * }</pre>
 *
 * @author Sven Jacobs
 */
public class Badge extends AbstractTextWidget implements HasPull {

    private final PullMixin<Badge> pullMixin = new PullMixin<Badge>(this);

    public Badge() {
        super(DOM.createSpan());
        setStyleName(Styles.BADGE);
    }

    public Badge(final String text) {
        this();
        setText(text);
    }

    @Override
    public void setPull(final Pull pull) {
        pullMixin.setPull(pull);
    }

    @Override
    public Pull getPull() {
        return pullMixin.getPull();
    }
}
