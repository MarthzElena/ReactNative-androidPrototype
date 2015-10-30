package com.loginproto;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.switchviewview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.toolbar.ReactToolbarManager;
import com.facebook.react.views.view.ReactViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by marthaelena on 10/21/15.
 */
public class LoginReactPackage implements ReactPackage{

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {

        return Arrays.<NativeModule>asList(
                new AsyncStorageModule(reactContext),
                new FrescoModule(reactContext),
                new NetworkingModule(reactContext),
                new com.facebook.react.modules.toast.ToastModule(reactContext),
                new LoginModule(reactContext));
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Arrays.<ViewManager>asList(
                new ReactDrawerLayoutManager(),
                new ReactHorizontalScrollViewManager(),
                new ReactImageManager(),
                new ReactProgressBarViewManager(),
                new ReactRawTextManager(),
                new ReactScrollViewManager(),
                new ReactSwitchManager(),
                new ReactTextInputManager(),
                new ReactTextViewManager(),
                new ReactToolbarManager(),
                new ReactViewManager(),
                new ReactVirtualTextViewManager());
    }
}
