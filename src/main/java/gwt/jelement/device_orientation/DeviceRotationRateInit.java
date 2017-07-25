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
package gwt.jelement.device_orientation;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class DeviceRotationRateInit{

    public DeviceRotationRateInit(){
    }

    @JsProperty(name="alpha")
    public double alpha;

    @JsOverlay
    public final double getAlpha(){
        return this.alpha;
    }

    @JsOverlay
    public final void setAlpha(double alpha){
        this.alpha = alpha;
    }

    @JsProperty(name="beta")
    public double beta;

    @JsOverlay
    public final double getBeta(){
        return this.beta;
    }

    @JsOverlay
    public final void setBeta(double beta){
        this.beta = beta;
    }

    @JsProperty(name="gamma")
    public double gamma;

    @JsOverlay
    public final double getGamma(){
        return this.gamma;
    }

    @JsOverlay
    public final void setGamma(double gamma){
        this.gamma = gamma;
    }


}
