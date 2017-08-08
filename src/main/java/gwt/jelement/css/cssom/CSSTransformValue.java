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
package gwt.jelement.css.cssom;

import gwt.jelement.core.ArrayLike;
import gwt.jelement.geometry.DOMMatrix;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="CSSTransformValue", isNative = true)
public class CSSTransformValue extends CSSStyleValue implements ArrayLike<CSSTransformComponent> {
    @JsConstructor
    public CSSTransformValue(){
        super();
    }
    
    @JsConstructor
    public CSSTransformValue(CSSTransformComponent[] transformComponents){
        super();
    }
    
    @JsProperty(name="is2D")
    public native boolean isIs2D();
    
    @JsMethod(name = "toMatrix")
    public native DOMMatrix toMatrix();
    
}
