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
package gwt.jelement.webaudio;

import gwt.jelement.webaudio.AudioNodeOptions;
import gwt.jelement.webaudio.BiquadFilterType;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class BiquadFilterOptions extends AudioNodeOptions{

    public BiquadFilterOptions(){
    }

    @JsProperty(name="type")
    public String type;

    @JsOverlay
    public final BiquadFilterType getType(){
        return BiquadFilterType.of(this.type);
    }

    @JsOverlay
    public final void setType(BiquadFilterType type){
        this.type = type.getInternalValue();
    }

    @JsProperty(name="Q")
    public float Q;

    @JsOverlay
    public final float getQ(){
        return this.Q;
    }

    @JsOverlay
    public final void setQ(float Q){
        this.Q = Q;
    }

    @JsProperty(name="detune")
    public float detune;

    @JsOverlay
    public final float getDetune(){
        return this.detune;
    }

    @JsOverlay
    public final void setDetune(float detune){
        this.detune = detune;
    }

    @JsProperty(name="frequency")
    public float frequency;

    @JsOverlay
    public final float getFrequency(){
        return this.frequency;
    }

    @JsOverlay
    public final void setFrequency(float frequency){
        this.frequency = frequency;
    }

    @JsProperty(name="gain")
    public float gain;

    @JsOverlay
    public final float getGain(){
        return this.gain;
    }

    @JsOverlay
    public final void setGain(float gain){
        this.gain = gain;
    }


}
