package com.ita.actitime.basic.popup;

import java.io.IOException;

import com.ita.actitime.basic.utils.ActitimeUtils;

public class FileDownloadPopUpDemo  extends ActitimeUtils
{

	static
	{
		try {
			Runtime.getRuntime().exec("D:\\ITA_Automation\\eclipse_ws\\SeleniumTraining\\autoIT\\fileDownloaderForIE.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		
		driver = getMyDriver("Ff");
		launch("https://www.seleniumhq.org/download/");
		clickOnElement("xpath", "//td[text()='Java']/following-sibling::td/a[text()='Download']");
		
		
	}
}
