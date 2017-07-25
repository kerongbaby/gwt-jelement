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
package gwt.jelement.vr;

import gwt.jelement.events.EventInit;
import gwt.jelement.vr.VRDisplay;
import gwt.jelement.vr.VRDisplayEventReason;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class VRDisplayEventInit extends EventInit{

    @JsProperty(name="display")
    private VRDisplay display;

    @JsProperty(name="reason")
    private String reason;

    public VRDisplayEventInit(){
    }

    @JsOverlay
    public final VRDisplay getDisplay(){
        return this.display;
    }

    @JsOverlay
    public final void setDisplay(VRDisplay display){
        this.display = display;
    }

    @JsOverlay
    public final VRDisplayEventReason getReason(){
        return VRDisplayEventReason.of(this.reason);
    }

    @JsOverlay
    public final void setReason(VRDisplayEventReason reason){
        this.reason = reason.getInternalValue();
    }

}
