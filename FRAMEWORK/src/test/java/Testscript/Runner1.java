package Testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericscripts.Base_Test;
import Genericscripts.ReadExcel;
import Pomscript.Facebooklogin;

public class Runner1 extends Base_Test {
	@Test
	public  void Test1() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String username=ReadExcel.getdata("sheet",0,0);
		String password=ReadExcel.getdata("sheet",1,0);
		Facebooklogin fb=new Facebooklogin(driver);
		fb.username("abzal");
		fb.username("123");
		Assert.fail();
		fb.clicklogin();

		
	}

}
