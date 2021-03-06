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
package gwt.jelement.broadcastchannel;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="BroadcastChannel", isNative = true)
public class BroadcastChannel extends EventTarget {
    @JsProperty(name="onmessage")
    private EventHandlerNonNull onmessage;
    
    @JsProperty(name="onmessageerror")
    private EventHandlerNonNull onmessageerror;
    
    @JsConstructor
    public BroadcastChannel(String name){
        super();
    }
    
    @JsProperty(name="name")
    public native String getName();
    
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
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Object message);
    
}
