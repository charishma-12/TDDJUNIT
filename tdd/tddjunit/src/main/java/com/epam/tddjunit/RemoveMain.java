package com.epam.tddjunit;
public class RemoveMain {
	String update(String s) {
		String ans="";
		if(s.length()==1) {
			if(s.charAt(0)!='A') {
				ans+=s.charAt(0);
			}
		}
		else if(s.length()>1) {
			if(s.charAt(0)!='A') {
				ans+=s.charAt(0);
			}
			if(s.charAt(1)!='A') {
				ans+=s.charAt(1);
			}
			if(s.length()>2) {
				ans=ans+s.substring(2);
			}
		}
		return ans;
	}
}

