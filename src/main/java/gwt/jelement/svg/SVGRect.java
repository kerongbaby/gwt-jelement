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
package gwt.jelement.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGRect{
    
    @JsProperty(name="x")
    public native float getX();
    
    @JsProperty(name="x")
    public native void setX(float x);
    
    @JsProperty(name="y")
    public native float getY();
    
    @JsProperty(name="y")
    public native void setY(float y);
    
    @JsProperty(name="width")
    public native float getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(float width);
    
    @JsProperty(name="height")
    public native float getHeight();
    
    @JsProperty(name="height")
    public native void setHeight(float height);
    
    
}
