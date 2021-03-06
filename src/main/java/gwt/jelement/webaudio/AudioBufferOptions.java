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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class AudioBufferOptions extends JsObject{

    @JsProperty(name="numberOfChannels")
    private double numberOfChannels;

    @JsProperty(name="length")
    private double length;

    @JsProperty(name="sampleRate")
    private double sampleRate;

    public AudioBufferOptions(){
    }

    @JsOverlay
    public final double getNumberOfChannels(){
        return this.numberOfChannels;
    }

    @JsOverlay
    public final void setNumberOfChannels(double numberOfChannels){
        this.numberOfChannels = numberOfChannels;
    }

    @JsOverlay
    public final double getLength(){
        return this.length;
    }

    @JsOverlay
    public final void setLength(double length){
        this.length = length;
    }

    @JsOverlay
    public final double getSampleRate(){
        return this.sampleRate;
    }

    @JsOverlay
    public final void setSampleRate(double sampleRate){
        this.sampleRate = sampleRate;
    }


}
