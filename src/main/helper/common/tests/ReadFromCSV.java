package common.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reading private Application data from CSV
 * 
 * @author jmatharu - Jagdeep Singh Matharu
 *
 */
public class ReadFromCSV {

	/**
	 * Get Login User Name (More work to be done; at this time it's good to go)
	 * 
	 * @return userName
	 */
	public String getLoginUserName() {
		File classPath = new File(System.getProperty("user.dir"));
		File csvDir = new File(classPath, "/src/main/resources/com/wp/automation/csv/protected_data/loginInfo.csv");
		String csvFile = csvDir.toString();
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		String userName = null;
		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				// use comma as separator
				// use comma as separator
				String[] loginInfo = line.split(cvsSplitBy);

				userName = loginInfo[0];
			}
			return userName;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	/**
	 * Get Login Password (More work to be done; at this time it's good to go)
	 * 
	 * @return password
	 */
	public String getLoginPassword() {
		File classPath = new File(System.getProperty("user.dir"));
		File csvDir = new File(classPath, "/src/main/resources/com/wp/automation/csv/protected_data/loginInfo.csv");
		String csvFile = csvDir.toString();
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		String userName = null;
		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				// use comma as separator
				// use comma as separator
				String[] loginInfo = line.split(cvsSplitBy);

				userName = loginInfo[1];
			}
			return userName;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
