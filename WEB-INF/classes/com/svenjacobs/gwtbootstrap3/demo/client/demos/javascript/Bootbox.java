package com.svenjacobs.gwtbootstrap3.demo.client.demos.javascript;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 Sven Jacobs
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

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.svenjacobs.gwtbootstrap3.client.ui.Button;

/**
 * @author lyhcode
 */
public class Bootbox extends Composite {
    interface DateTimePickersUiBinder extends UiBinder<Widget, Bootbox> {
    }

    private static DateTimePickersUiBinder ourUiBinder = GWT.create(DateTimePickersUiBinder.class);

    @UiField
    Button alertButton;

    public Bootbox() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @UiHandler("alertButton")
    public void handleAlertButtonClick(ClickEvent event) {
        com.svenjacobs.gwtbootstrap3.bootbox.client.Bootbox.alert("Hello World");
    }


}