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
package gwt.jelement.peerconnection;

import gwt.jelement.indexeddb.IDBObjectStoreParameters;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class RTCIceServer{

    public RTCIceServer(){
    }

    @JsProperty(name="urls")
    public IDBObjectStoreParameters.StringOrStringArrayUnionType urls;

    @JsOverlay
    public final void setUrls(String urls){
        this.urls = IDBObjectStoreParameters.StringOrStringArrayUnionType.of(urls);
    }

    @JsOverlay
    public final void setUrls(String[] urls){
        this.urls = IDBObjectStoreParameters.StringOrStringArrayUnionType.of(urls);
    }

    @JsProperty(name="url")
    public String url;

    @JsOverlay
    public final String getUrl(){
        return this.url;
    }

    @JsOverlay
    public final void setUrl(String url){
        this.url = url;
    }

    @JsProperty(name="username")
    public String username;

    @JsOverlay
    public final String getUsername(){
        return this.username;
    }

    @JsOverlay
    public final void setUsername(String username){
        this.username = username;
    }

    @JsProperty(name="credential")
    public String credential;

    @JsOverlay
    public final String getCredential(){
        return this.credential;
    }

    @JsOverlay
    public final void setCredential(String credential){
        this.credential = credential;
    }


}
