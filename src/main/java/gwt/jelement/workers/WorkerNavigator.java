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
package gwt.jelement.workers;

import gwt.jelement.budget.BudgetService;
import gwt.jelement.core.IsObject;
import gwt.jelement.netinfo.NetworkInformation;
import gwt.jelement.permissions.Permissions;
import gwt.jelement.quota.StorageManager;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="WorkerNavigator", isNative = true)
public class WorkerNavigator implements IsObject {
    @JsProperty(name="budget")
    public native BudgetService getBudget();
    
    @JsProperty(name="connection")
    public native NetworkInformation getConnection();
    
    @JsProperty(name="permissions")
    public native Permissions getPermissions();
    
    @JsProperty(name="storage")
    public native StorageManager getStorage();
    
    @JsProperty(name="hardwareConcurrency")
    public native double getHardwareConcurrency();
    
    @JsProperty(name="appCodeName")
    public native String getAppCodeName();
    
    @JsProperty(name="appName")
    public native String getAppName();
    
    @JsProperty(name="appVersion")
    public native String getAppVersion();
    
    @JsProperty(name="platform")
    public native String getPlatform();
    
    @JsProperty(name="product")
    public native String getProduct();
    
    @JsProperty(name="userAgent")
    public native String getUserAgent();
    
    @JsProperty(name="onLine")
    public native boolean isOnLine();
    
}
