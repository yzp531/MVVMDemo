/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.databinding.adapters;

import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.widget.VideoView;
import android.widget.ViewSwitcher;

@BindingMethods({
        @BindingMethod(type = VideoView.class, attribute = "android:onCompletion", method = "setOnCompletionListener"),
        @BindingMethod(type = VideoView.class, attribute = "android:onError", method = "setOnErrorListener"),
        @BindingMethod(type = VideoView.class, attribute = "android:onInfo", method = "setOnInfoListener"),
        @BindingMethod(type = VideoView.class, attribute = "android:onPrepared", method = "setOnPreparedListener"),
})
public class VideoViewBindingAdapter {
}
