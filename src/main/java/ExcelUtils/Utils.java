package ExcelUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils {

	public static String addPlacePayload() throws IOException {

		FileInputStream Filepath = new FileInputStream("D:/EclipseWorkspace/GoogleAPIMaven/src/main/java/APIRequest/GoogleApi.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(Filepath);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String value = sheet.getRow(1).getCell(0).getStringCellValue();
		workbook.close();
		return value;

	}

	public static String getHttpMethod() throws IOException {

		FileInputStream Filepath = new FileInputStream("D:/EclipseWorkspace/GoogleAPIMaven/src/main/java/APIRequest/GoogleApi.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(Filepath);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String value = sheet.getRow(0).getCell(0).getStringCellValue();
		workbook.close();
		return value;

	}

	public static String getResourcePostAPI() throws IOException {

		FileInputStream Filepath = new FileInputStream("D:/EclipseWorkspace/GoogleAPIMaven/src/main/java/APIRequest/GoogleApi.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(Filepath);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String value = sheet.getRow(1).getCell(1).getStringCellValue();
		workbook.close();
		return value;

	}

	public static int getStatusCodePostAPI() throws IOException {

		FileInputStream Filepath = new FileInputStream("D:/EclipseWorkspace/GoogleAPIMaven/src/main/java/APIRequest/GoogleApi.xlsx");
		;
		XSSFWorkbook workbook = new XSSFWorkbook(Filepath);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int value = (int) sheet.getRow(1).getCell(2).getNumericCellValue();
		workbook.close();
		return value;

	}

	public static String getResourceGetAPI() throws IOException {

		FileInputStream Filepath = new FileInputStream("D:/EclipseWorkspace/GoogleAPIMaven/src/main/java/APIRequest/GoogleApi.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(Filepath);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String value = sheet.getRow(2).getCell(1).getStringCellValue();
		workbook.close();
		return value;

	}

	public static int getStatusCodeGetAPI() throws IOException {

		FileInputStream Filepath = new FileInputStream("D:/EclipseWorkspace/GoogleAPIMaven/src/main/java/APIRequest/GoogleApi.xlsx");		
		XSSFWorkbook workbook = new XSSFWorkbook(Filepath);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int value = (int) sheet.getRow(2).getCell(2).getNumericCellValue();
		workbook.close();
		return value;

	}

}
