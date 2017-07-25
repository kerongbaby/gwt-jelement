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
package gwt.jelement.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGPreserveAspectRatio{
    public static int SVG_PRESERVEASPECTRATIO_UNKNOWN;
    public static int SVG_PRESERVEASPECTRATIO_NONE;
    public static int SVG_PRESERVEASPECTRATIO_XMINYMIN;
    public static int SVG_PRESERVEASPECTRATIO_XMIDYMIN;
    public static int SVG_PRESERVEASPECTRATIO_XMAXYMIN;
    public static int SVG_PRESERVEASPECTRATIO_XMINYMID;
    public static int SVG_PRESERVEASPECTRATIO_XMIDYMID;
    public static int SVG_PRESERVEASPECTRATIO_XMAXYMID;
    public static int SVG_PRESERVEASPECTRATIO_XMINYMAX;
    public static int SVG_PRESERVEASPECTRATIO_XMIDYMAX;
    public static int SVG_PRESERVEASPECTRATIO_XMAXYMAX;
    public static int SVG_MEETORSLICE_UNKNOWN;
    public static int SVG_MEETORSLICE_MEET;
    public static int SVG_MEETORSLICE_SLICE;
    
    
    @JsProperty(name="align")
    public native short getAlign();
    
    @JsProperty(name="align")
    public native void setAlign(short align);
    
    @JsProperty(name="meetOrSlice")
    public native short getMeetOrSlice();
    
    @JsProperty(name="meetOrSlice")
    public native void setMeetOrSlice(short meetOrSlice);
    
    
}
