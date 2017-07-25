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
package gwt.jelement.dom;

import gwt.jelement.dom.Element;
import gwt.jelement.dom.Node;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class CharacterData extends Node{
    
    @JsConstructor
    public CharacterData(){
        super();
    }
    
    @JsProperty(name="data")
    public native String getData();
    
    @JsProperty(name="data")
    public native void setData(String data);
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsProperty(name="previousElementSibling")
    public native Element getPreviousElementSibling();
    
    @JsProperty(name="nextElementSibling")
    public native Element getNextElementSibling();
    
    @JsMethod(name = "after")
    public native void after();
    
    
    @JsMethod(name = "after")
    public native void after(Node... nodes);
    
    
    @JsMethod(name = "after")
    public native void after(String... nodes);
    
    
    @JsMethod(name = "appendData")
    public native void appendData(String data);
    
    
    @JsMethod(name = "before")
    public native void before();
    
    
    @JsMethod(name = "before")
    public native void before(Node... nodes);
    
    
    @JsMethod(name = "before")
    public native void before(String... nodes);
    
    
    @JsMethod(name = "deleteData")
    public native void deleteData(double offset, double count);
    
    
    @JsMethod(name = "insertData")
    public native void insertData(double offset, String data);
    
    
    @JsMethod(name = "remove")
    public native void remove();
    
    
    @JsMethod(name = "replaceData")
    public native void replaceData(double offset, double count, String data);
    
    
    @JsMethod(name = "replaceWith")
    public native void replaceWith();
    
    
    @JsMethod(name = "replaceWith")
    public native void replaceWith(Node... nodes);
    
    
    @JsMethod(name = "replaceWith")
    public native void replaceWith(String... nodes);
    
    
    @JsMethod(name = "substringData")
    public native String substringData(double offset, double count);
    
    
}
