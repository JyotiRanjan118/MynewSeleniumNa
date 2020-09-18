package Session15;

public class ExcelUtilTest {

	public static void main(String[] args) {
		Xlsutil reader=new Xlsutil("./ExcelFolder/SampleExcel.xlsx");
		String sheetname="login";
		
		String data=reader.getCellData(sheetname, 0,3);
		System.out.println(data);
		
		int rowcount=reader.getRowCount(sheetname);
		System.out.println("Total rows: "+rowcount);
		
		//reader.addColumn(sheetname, "status");		//Add column
		
		if(!reader.isSheetExist("Registration")) {		//Add sheet
			reader.addSheet("Registration");
		}
		
		reader.setCellData(sheetname, "status",2, "PASS");
		//reader.setCellData(sheetname, "status",3, "FAIL");
		
		System.out.println(reader.getCellData(sheetname, "Username", 2));		//Column-Username,2nd row
		
		System.out.println(reader.getColumnCount(sheetname));
		
		//reader.removeColumn("Registration", 0);
		
		System.out.println(reader.getCellData("Registration", "phonenumber", 2));	//Column-phonenumber,2nd row
		System.out.println(reader.getCellData("Registration", "age", 2));			//
		
		System.out.println(reader.getCellData("Registration", "boolean", 2));
		
					
		
		
		
		
		

	}

}
