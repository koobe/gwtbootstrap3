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

import com.google.gwt.dom.client.Document;
import org.gwtbootstrap3.client.ui.base.form.FormElementContainer;
import org.gwtbootstrap3.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap3.client.ui.constants.Styles;
import org.gwtbootstrap3.client.ui.constants.ValidationState;

/**
 * @author Sven Jacobs
 */
public class FormGroup extends FormElementContainer implements HasValidationState {

    public FormGroup() {
        setElement(Document.get().createDivElement());
        setStyleName(Styles.FORM_GROUP);
    }

    @Override
    public void setValidationState(final ValidationState state) {
        StyleHelper.addUniqueEnumStyleName(this, ValidationState.class, state);
    }

    @Override
    public ValidationState getValidationState() {
        return ValidationState.fromStyleName(getStyleName());
    }
}
