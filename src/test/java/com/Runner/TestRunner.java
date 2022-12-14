package com.Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",dryRun=true,
snippets = SnippetType.CAMELCASE, glue = "com.step",monochrome=true, plugin ="json:target/output.json")
public class TestRunner {
@AfterClass
public static void afterclass() {
Report.generateJvmRport(System.getProperty("user.dir")+"\\target\\output.json");
}
}
