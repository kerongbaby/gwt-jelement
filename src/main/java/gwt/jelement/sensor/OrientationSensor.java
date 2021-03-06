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
package gwt.jelement.sensor;

import gwt.jelement.core.Float32Array;
import gwt.jelement.core.Float64Array;
import gwt.jelement.geometry.DOMMatrix;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="OrientationSensor", isNative = true)
public class OrientationSensor extends Sensor {
    @JsProperty(name="quaternion")
    public native double[] getQuaternion();
    
    @JsMethod(name = "populateMatrix")
    public native void populateMatrix(Float32Array targetBuffer);
    
    @JsMethod(name = "populateMatrix")
    public native void populateMatrix(Float64Array targetBuffer);
    
    @JsMethod(name = "populateMatrix")
    public native void populateMatrix(DOMMatrix targetBuffer);
    
}
