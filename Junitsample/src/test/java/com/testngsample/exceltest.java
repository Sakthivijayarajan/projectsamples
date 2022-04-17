package com.testngsample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.sql.rowset.spi.XmlReader;

import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.xmlbeans.impl.piccolo.xml.XMLInputReader;

public class exceltest {
	
	static FileInputStream reader;
	
	public static void getexcel() throws FileNotFoundException{
		
		ArrayList<Object[]>mydata = new ArrayList<Object[]>();
		
		reader = new FileInputStream("C:\\Users\\vijay\\eclipse-workspace\\Junitsample\\src\\main\\resources\\data.xlsx");
		
		
		
		
		
		
		
		
		
		
	}

	
	
}
