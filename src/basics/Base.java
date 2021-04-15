package basics;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MegayaEmulator"); 
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\megay\\.eclipse\\MobileAutomationBasics\\SourceApp\\ApiDemos.apk");
		

	}

}
