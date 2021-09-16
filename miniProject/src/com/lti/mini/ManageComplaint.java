package com.lti.mini;

import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ManageComplaint {
	
	ComplaintPojo obj;
	ReadingCSV robj;
	
	static Map<String,ComplaintPojo> m;
	Set<String> keys = m.keySet();
	
	public void complaintsByYear(String yr) {
	
		for(String s:keys) {
			if(m.get(s).getDt_received().contains(yr)) {
				System.out.println("Issue is "+m.get(s).getIssue()+"  Sub-issue is "+m.get(s).getSub_issue());
			}
		}
		System.out.println("------------------------------------------------------------------------");
	}
	
	public void complaintsByBank(String bname) {
		for(String s:keys) {
			if(m.get(s).getCompany().equalsIgnoreCase(bname)) 
				System.out.println("Issue is "+m.get(s).getIssue()+"  Sub-issue is "+m.get(s).getSub_issue());
		}
	}
	
	public void complaintsById(String cid) {
		for(String s:keys) {
			if(s.equals(cid)) 
				System.out.println("Issue is "+m.get(s).getIssue()+"  Sub-issue is "+m.get(s).getSub_issue());
		}
		System.out.println("------------------------------------------------------------------------");
	}
	
	public void timeTocloseComplaint(String cid) {
		
		String received_dt = m.get(cid).getDt_received();
		String resolved_dt = m.get(cid).getDt_sent_to_comp();
		
		if(resolved_dt.contains("-"))
			resolved_dt = resolved_dt.replace('-','/');
		
		SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yyyy");
		String inputString1 = resolved_dt;
		String inputString2 = received_dt;
		
		try {
		    Date date1 = myFormat.parse(inputString1);
		    Date date2 = myFormat.parse(inputString2);
		    long diff = date2.getTime() - date1.getTime();
		    System.out.println ("The issue resolved in " + Math.abs(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS))+" days");
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		System.out.println("------------------------------------------------------------------------");
		
	}
	
	public void complaintsClosed() {
		for(String s:keys) {
			if(m.get(s).getComp_response().equals("Closed") || m.get(s).getComp_response().equals("Closed with explanation")) 
				System.out.println("Issue is "+m.get(s).getIssue()+"  Sub-issue is "+m.get(s).getSub_issue()+" is closed");
		}
		System.out.println("------------------------------------------------------------------------");
	}
	
	public void timelyResponse() {
		for(String s:keys) {
			if(m.get(s).getTimely_res().equals("Yes")) 
				System.out.println("Issue is "+m.get(s).getIssue()+"  Sub-issue is "+m.get(s).getSub_issue()+" received timely response");
		}
		System.out.println("------------------------------------------------------------------------");
	}
	
	
	
	public static void main(String[] args) {
		
		m = new ReadingCSV().fileLoader();
		
		Scanner sc = new Scanner(System.in);
		
		ManageComplaint mobj = new ManageComplaint();
		
		do {
			System.out.println("\nHello! Welcome to our page");
			System.out.println("Select your choice\n1.Display all complaints based on year.\n2.Display all complaints based on bank.\n3.Display complaints based on complaint ID.\n4.Display days took to close the complaint.\n5.display complaints closed with/without explaination.\n6.display complaints that received a timely response.\n7.Lodge a complaint.\n8.EXIT");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter year");
				String yr = sc.nextLine();
				mobj.complaintsByYear(yr);
				break;
			case 2:
				System.out.println("Enter bank name");
				String bname = sc.nextLine();
				mobj.complaintsByBank(bname);
				break;
			case 3:
				System.out.println("Enter complaint ID");
				String cid1 = sc.nextLine();
				mobj.complaintsById(cid1);
				break;
			case 4:
				System.out.println("enter complaint ID");
				String cid2 = sc.nextLine();
				mobj.timeTocloseComplaint(cid2);
				break;
			case 5:
				mobj.complaintsClosed();
				break;
			case 6:
				mobj.timelyResponse();
				break;
			case 7:
				/*System.out.println("Enter bank name");
				String bname = sc.nextLine();
				obj.complaintsByBank();*/
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}while(true);
		
	}
}
