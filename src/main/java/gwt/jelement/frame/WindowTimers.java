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

import gwt.jelement.core.CallbackFunction;
import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class WindowTimers implements IsObject {
    @JsMethod(name = "clearInterval")
    public native void clearInterval();
    
    @JsMethod(name = "clearInterval")
    public native void clearInterval(double handle);
    
    @JsMethod(name = "clearTimeout")
    public native void clearTimeout();
    
    @JsMethod(name = "clearTimeout")
    public native void clearTimeout(double handle);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(CallbackFunction handler);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(String handler);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(CallbackFunction handler, double timeout, Object... arguments);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(String handler, double timeout, Object... arguments);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(CallbackFunction handler);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(String handler);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(CallbackFunction handler, double timeout, Object... arguments);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(String handler, double timeout, Object... arguments);
    
}
