package com.lti.mini;

import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class ReadingCSV {
	
	
	public Map fileLoader() {
		
		Map<String,ComplaintPojo> details = new HashMap<String,ComplaintPojo>();
		
		String path ="C:\\Users\\pavan\\Downloads\\complaints.csv";
		String line="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while((line=br.readLine())!=null) {
				String[] det=line.split(",");
				ComplaintPojo obj = new ComplaintPojo(det[0],det[1],det[2],det[3],det[4],det[5],det[6],det[7],det[8],det[det.length-5],det[10],det[11],det[12]);
				details.put(det[det.length-1], obj);
				//System.out.println(details.get(det[13]).get);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return details;
	}
	
	
	/*public static void main(String[] args) {
		
		Map<String,ComplaintPojo> m = new ReadingCSV().fileLoader();
		System.out.println(m.get("468889").getComp_response());

	}*/
}
