package com.report;


import java.io.File;
import java.util.LinkedList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
  public static void generateJvmRport(String jsonFile) {
	  File file = new File(System.getProperty("user.dir")+"\\target");
Configuration configuration = new Configuration(file, "adactinhotelapp");
configuration.addClassifications("platform", "Windows");
configuration.addClassifications("platform version", "Windows 10");
configuration.addClassifications("author", "Saravanan");
configuration.addClassifications("Sprint", "21");
configuration.addClassifications("Buildnumber", "244534253");

LinkedList<String> jsonfiles=new LinkedList<String>();
jsonfiles.add(jsonFile);
ReportBuilder builder = new ReportBuilder(jsonfiles, configuration);
builder.generateReports();



}

}
