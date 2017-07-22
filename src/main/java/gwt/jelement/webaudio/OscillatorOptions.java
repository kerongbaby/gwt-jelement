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
import gwt.jelement.webaudio.OscillatorType;
import gwt.jelement.webaudio.PeriodicWave;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class OscillatorOptions extends AudioNodeOptions{

    @JsProperty(name="type")
    public OscillatorType type;

    @JsProperty(name="detune")
    public float detune;

    @JsProperty(name="frequency")
    public float frequency;

    @JsProperty(name="periodicWave")
    public PeriodicWave periodicWave;


}
