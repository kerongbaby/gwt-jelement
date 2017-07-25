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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class DynamicsCompressorOptions extends AudioNodeOptions{

    @JsProperty(name="attack")
    private float attack;

    @JsProperty(name="knee")
    private float knee;

    @JsProperty(name="ratio")
    private float ratio;

    @JsProperty(name="release")
    private float release;

    @JsProperty(name="threshold")
    private float threshold;

    public DynamicsCompressorOptions(){
    }

    @JsOverlay
    public final float getAttack(){
        return this.attack;
    }

    @JsOverlay
    public final void setAttack(float attack){
        this.attack = attack;
    }

    @JsOverlay
    public final float getKnee(){
        return this.knee;
    }

    @JsOverlay
    public final void setKnee(float knee){
        this.knee = knee;
    }

    @JsOverlay
    public final float getRatio(){
        return this.ratio;
    }

    @JsOverlay
    public final void setRatio(float ratio){
        this.ratio = ratio;
    }

    @JsOverlay
    public final float getRelease(){
        return this.release;
    }

    @JsOverlay
    public final void setRelease(float release){
        this.release = release;
    }

    @JsOverlay
    public final float getThreshold(){
        return this.threshold;
    }

    @JsOverlay
    public final void setThreshold(float threshold){
        this.threshold = threshold;
    }

}
