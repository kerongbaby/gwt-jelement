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
package gwt.jelement.media_capabilities;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class AudioConfiguration extends JsObject{

    @JsProperty(name="contentType")
    private String contentType;

    @JsProperty(name="channels")
    private String channels;

    @JsProperty(name="bitrate")
    private double bitrate;

    @JsProperty(name="samplerate")
    private double samplerate;

    public AudioConfiguration(){
    }

    @JsOverlay
    public final String getContentType(){
        return this.contentType;
    }

    @JsOverlay
    public final void setContentType(String contentType){
        this.contentType = contentType;
    }

    @JsOverlay
    public final String getChannels(){
        return this.channels;
    }

    @JsOverlay
    public final void setChannels(String channels){
        this.channels = channels;
    }

    @JsOverlay
    public final double getBitrate(){
        return this.bitrate;
    }

    @JsOverlay
    public final void setBitrate(double bitrate){
        this.bitrate = bitrate;
    }

    @JsOverlay
    public final double getSamplerate(){
        return this.samplerate;
    }

    @JsOverlay
    public final void setSamplerate(double samplerate){
        this.samplerate = samplerate;
    }


}
