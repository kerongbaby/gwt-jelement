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
package gwt.jelement.imagecapture;

import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.mediastream.MediaStreamTrack;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="ImageCapture", isNative = true)
public class ImageCapture implements IsObject {
    @JsConstructor
    public ImageCapture(MediaStreamTrack track){
    }
    
    @JsProperty(name="track")
    public native MediaStreamTrack getTrack();
    
    @JsMethod(name = "getPhotoCapabilities")
    public native Promise<PhotoCapabilities> getPhotoCapabilities();
    
    @JsMethod(name = "getPhotoSettings")
    public native Promise<PhotoSettings> getPhotoSettings();
    
    @JsMethod(name = "grabFrame")
    public native Promise<ImageBitmap> grabFrame();
    
    @JsMethod(name = "setOptions")
    public native Promise<Void> setOptions(PhotoSettings photoSettings);
    
    @JsMethod(name = "takePhoto")
    public native Promise<Blob> takePhoto();
    
    @JsMethod(name = "takePhoto")
    public native Promise<Blob> takePhoto(PhotoSettings photoSettings);
    
}
