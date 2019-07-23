package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.react.GestureHandler;

public interface RNGestureHandlerEventDataExtractor<T extends GestureHandler> {
  void extractEventData(T handler, WritableMap eventData);
}
