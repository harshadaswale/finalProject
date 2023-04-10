package UtilsLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import BaseLayer.BaseClass;

public class HandleWindow extends BaseClass{

	public HandleWindow() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public String[] newWindowByIterator() {
		Set<String> allwindow=driver.getWindowHandles();
	    Iterator<String>allwin=allwindow.iterator();
		int a=allwindow.size();
		String[] arr=new String[a];
		for(int i=0;i<a;i++) {
			arr[i]=allwin.next();
		}
		return arr;
	}
	
	public String[] newWindowByIterator0() {
		
		Set<String>allwindow=driver.getWindowHandles();
		Iterator<String>allwin=allwindow.iterator();
		int a=allwindow.size();
		String[] arr=new String[a];
		int i=0;
		while(allwin.hasNext()) {
			arr[i]=allwin.next();
			i++;
	}
		return arr;
	}
	
	public ArrayList<String> newWindowByArrayList(){
		Set<String>allwindow=driver.getWindowHandles();
		ArrayList<String>allwin=new ArrayList<String>(allwindow);
		return allwin;
	}
}
