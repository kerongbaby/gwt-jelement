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
package gwt.jelement.frame;

import gwt.jelement.core.IsObject;
import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="History", isNative = true)
public class History implements IsObject {
    @JsProperty(name="scrollRestoration")
    private String scrollRestoration;
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsProperty(name="state")
    public native JsObject getState();
    
    @JsOverlay
    public final ScrollRestoration getScrollRestoration(){
       return ScrollRestoration.of(scrollRestoration);
    }
    
    @JsOverlay
    public final void setScrollRestoration(ScrollRestoration scrollRestoration){
       this.scrollRestoration = scrollRestoration.getInternalValue();
    }
    
    @JsMethod(name = "back")
    public native void back();
    
    @JsMethod(name = "forward")
    public native void forward();
    
    @JsMethod(name = "go")
    public native void go();
    
    @JsMethod(name = "go")
    public native void go(double delta);
    
    @JsMethod(name = "pushState")
    public native void pushState(JsObject data, String title);
    
    @JsMethod(name = "pushState")
    public native void pushState(JsObject data, String title, String url);
    
    @JsMethod(name = "replaceState")
    public native void replaceState(JsObject data, String title);
    
    @JsMethod(name = "replaceState")
    public native void replaceState(JsObject data, String title, String url);
    
}
