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

import gwt.jelement.core.Float32Array;
import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="VRFrameData", isNative = true)
public class VRFrameData implements IsObject {
    @JsConstructor
    public VRFrameData(){
    }
    
    @JsProperty(name="leftProjectionMatrix")
    public native Float32Array getLeftProjectionMatrix();
    
    @JsProperty(name="leftViewMatrix")
    public native Float32Array getLeftViewMatrix();
    
    @JsProperty(name="rightProjectionMatrix")
    public native Float32Array getRightProjectionMatrix();
    
    @JsProperty(name="rightViewMatrix")
    public native Float32Array getRightViewMatrix();
    
    @JsProperty(name="pose")
    public native VRPose getPose();
    
}
