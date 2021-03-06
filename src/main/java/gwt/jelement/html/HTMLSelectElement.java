/*
 * Copyright 2017 Abed Tony BenBrahim <tony.benrahim@10xdev.com>
 *     and Gwt-JElement project contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package gwt.jelement.html;

import gwt.jelement.core.ArrayLike;
import gwt.jelement.core.Js;
import gwt.jelement.dom.Element;
import gwt.jelement.dom.NodeList;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLSelectElement", isNative = true)
public class HTMLSelectElement extends HTMLElement implements ArrayLike<Element> {
    @JsProperty(name="autofocus")
    public native boolean isAutofocus();
    
    @JsProperty(name="autofocus")
    public native void setAutofocus(boolean autofocus);
    
    @JsProperty(name="disabled")
    public native boolean isDisabled();
    
    @JsProperty(name="disabled")
    public native void setDisabled(boolean disabled);
    
    @JsProperty(name="form")
    public native HTMLFormElement getForm();
    
    @JsProperty(name="multiple")
    public native boolean isMultiple();
    
    @JsProperty(name="multiple")
    public native void setMultiple(boolean multiple);
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="required")
    public native boolean isRequired();
    
    @JsProperty(name="required")
    public native void setRequired(boolean required);
    
    @JsProperty(name="size")
    public native double getSize();
    
    @JsProperty(name="size")
    public native void setSize(double size);
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="options")
    public native HTMLOptionsCollection getOptions();
    
    @JsProperty(name="selectedOptions")
    public native HTMLCollection getSelectedOptions();
    
    @JsProperty(name="selectedIndex")
    public native double getSelectedIndex();
    
    @JsProperty(name="selectedIndex")
    public native void setSelectedIndex(double selectedIndex);
    
    @JsProperty(name="value")
    public native String getValue();
    
    @JsProperty(name="value")
    public native void setValue(String value);
    
    @JsProperty(name="willValidate")
    public native boolean isWillValidate();
    
    @JsProperty(name="validity")
    public native ValidityState getValidity();
    
    @JsProperty(name="validationMessage")
    public native String getValidationMessage();
    
    @JsProperty(name="labels")
    public native NodeList getLabels();
    
    @JsMethod(name = "add")
    public native void add(HTMLOptionElement element);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptGroupElement element);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptionElement element, HTMLElement before);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptionElement element, double before);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptGroupElement element, HTMLElement before);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptGroupElement element, double before);
    
    @JsMethod(name = "checkValidity")
    public native boolean checkValidity();
    
    @JsMethod(name = "item")
    public native Element item(double index);
    
    @JsMethod(name = "namedItem")
    public native HTMLOptionElement namedItem(String name);
    
    @JsMethod(name = "remove")
    public native void remove(double index);
    
    @JsMethod(name = "reportValidity")
    public native boolean reportValidity();
    
    @JsOverlay
    public final void set(double index, HTMLOptionElement option){
        Js.set(this.object(), index, option);
    }
    
    @JsMethod(name = "setCustomValidity")
    public native void setCustomValidity(String error);
    
}
