package com.ita.actitime.basic.popup;

import java.io.IOException;

import com.ita.actitime.basic.utils.ActitimeUtils;

public class AuthenticationPopUpForIE extends ActitimeUtils
{
	static
	{
		System.out.println("Executing Auto it code....");
		try {
			Runtime.getRuntime().exec("D:\\ITA_Automation\\eclipse_ws\\SeleniumTraining\\autoIT\\AuthenticationPopUp_HandlerForIE.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		
		driver = getMyDriver("ie");
		launch("https://www.engprod-charter.net");
		
	}
}
