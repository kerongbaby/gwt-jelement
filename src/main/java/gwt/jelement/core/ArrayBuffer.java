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
package gwt.jelement.core;

import gwt.jelement.dom.MessagePort;
import gwt.jelement.events.EventHandlerNonNull;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="ArrayBuffer", isNative = true)
public class ArrayBuffer implements IsObject {
    @JsProperty(name="onmessage")
    private EventHandlerNonNull onmessage;
    
    @JsProperty(name="onmessageerror")
    private EventHandlerNonNull onmessageerror;
    
    @JsConstructor
    public ArrayBuffer(double length){
    }
    
    @JsProperty(name="byteLength")
    public native double getByteLength();
    
    @JsOverlay
    public final EventHandlerNonNull getOnMessage(){
        return this.onmessage;
    }
    
    @JsOverlay
    public final void setOnMessage(EventHandlerNonNull onmessage){
        this.onmessage = onmessage;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMessageerror(){
        return this.onmessageerror;
    }
    
    @JsOverlay
    public final void setOnMessageerror(EventHandlerNonNull onmessageerror){
        this.onmessageerror = onmessageerror;
    }
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "isView")
    public static native boolean isView(Object value);
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Object message);
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Object message, MessagePort[] transfer);
    
    @JsMethod(name = "slice")
    public native ArrayBuffer slice(double begin);
    
    @JsMethod(name = "slice")
    public native ArrayBuffer slice(double begin, double end);
    
    @JsMethod(name = "start")
    public native void start();
    
}
