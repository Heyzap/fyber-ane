package com.heyzap.sdk.extensions.fyberSDK;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class FyberSDKLib
  implements FREExtension
{
  public FREContext createContext(String args)
  {
    return new FyberSDKLibContext();
  }

  public void dispose() {}

  public void initialize() {}
}