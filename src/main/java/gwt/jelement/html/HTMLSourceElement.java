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

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLSourceElement", isNative = true)
public class HTMLSourceElement extends HTMLElement {
    @JsProperty(name="src")
    public native String getSrc();
    
    @JsProperty(name="src")
    public native void setSrc(String src);
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="type")
    public native void setType(String type);
    
    @JsProperty(name="srcset")
    public native String getSrcset();
    
    @JsProperty(name="srcset")
    public native void setSrcset(String srcset);
    
    @JsProperty(name="sizes")
    public native String getSizes();
    
    @JsProperty(name="sizes")
    public native void setSizes(String sizes);
    
    @JsProperty(name="media")
    public native String getMedia();
    
    @JsProperty(name="media")
    public native void setMedia(String media);
    
}
