package Generic_utility;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyfile_utility {
public String readaDataFrompf() {
	FileInputStream fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Advanceselenium\\src\\main\\resources\\Commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
}
}
