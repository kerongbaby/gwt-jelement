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

import gwt.jelement.css.StyleSheetList;
import gwt.jelement.editing.Selection;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="ShadowRoot", isNative = true)
public class ShadowRoot extends DocumentFragment {
    @JsProperty(name="mode")
    private String mode;
    
    private ShadowRoot(){
        super();
    }
    
    @JsProperty(name="host")
    public native Element getHost();
    
    @JsProperty(name="olderShadowRoot")
    public native ShadowRoot getOlderShadowRoot();
    
    @JsProperty(name="innerHTML")
    public native String getInnerHTML();
    
    @JsProperty(name="innerHTML")
    public native void setInnerHTML(String innerHTML);
    
    @JsProperty(name="delegatesFocus")
    public native boolean isDelegatesFocus();
    
    @JsProperty(name="activeElement")
    public native Element getActiveElement();
    
    @JsProperty(name="styleSheets")
    public native StyleSheetList getStyleSheets();
    
    @JsProperty(name="pointerLockElement")
    public native Element getPointerLockElement();
    
    @JsProperty(name="fullscreenElement")
    public native Element getFullscreenElement();
    
    @JsOverlay
    public final ShadowRootMode getMode(){
       return ShadowRootMode.of(mode);
    }
    
    @JsMethod(name = "elementFromPoint")
    public native Element elementFromPoint(double x, double y);
    
    @JsMethod(name = "elementsFromPoint")
    public native Element[] elementsFromPoint(double x, double y);
    
    @JsMethod(name = "getSelection")
    public native Selection getSelection();
    
}
