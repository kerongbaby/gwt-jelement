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
package gwt.jelement.html.custom;

import gwt.jelement.core.Function;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import gwt.jelement.dom.ElementDefinitionOptions;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="CustomElementRegistry", isNative = true)
public class CustomElementRegistry implements IsObject {
    @JsMethod(name = "define")
    public native void define(String name, Function constructor);
    
    @JsMethod(name = "define")
    public native void define(String name, Function constructor, ElementDefinitionOptions options);
    
    @JsMethod(name = "get")
    public native Object get(String name);
    
    @JsMethod(name = "whenDefined")
    public native Promise<Void> whenDefined(String name);
    
}
