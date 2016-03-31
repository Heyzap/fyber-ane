# Fyber SDK ANE

A thin wrapper around the Fyber SDK for use in an Adobe AIR Android application by native code.

Pull requests and issues are welcome.

#### Fyber SDK version
- Android: 8.1.6

#### Adding to your project

- Add the `FyberSDK.ane` to your Adobe Flex Builder or Adobe Flash project.
- If not done automatically, add the follow extension context to your application descriptor:

	```xml
	<extensions>
	    <extensionID>com.heyzap.sdk.extensions.fyberSDK</extensionID>
	</extensions>
	```

#### Updating Fyber's SDK
**For Android**:
- Replace `fyber-sdk.jar` in `android/libs` with a newer version, keeping the same name.

After making the necessary modifications, build the new ANE by following the [building](#building) instructions below.

#### Building

##### Requirements:
- Mac OS X
- XCode
- [Apache Ant](http://ant.apache.org/)
- [AIR SDK](http://www.adobe.com/devnet/air/air-sdk-download.html)

##### Building:
- Make a `build.config` by copying `build.config.dist` (your local config file)
- Change the path to the AIR SDK in `build.config` (named `air.sdk`)
- From the root of the repository, run `ant`.

After build completes, the native extension will be in `bin/FyberSDK.ane`.
