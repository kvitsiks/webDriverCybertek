package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {

        // Properties: Use Properties class object
        // We create properties object to be able to read configuration.properties file
        //import from java.util
        Properties properties = new Properties();

        // FileInputStream: opens the file
        String path = "configuration.properties";

        //We need to pass the path of the file we want to open in JVM
        FileInputStream file = new FileInputStream(path);

        // We will load the file
        properties.load(file);

        // We read from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

        // Close the file
        file.close();

    }

    @Test
    public void using_properties_utility_method(){
        //This will read the given "key's" value and return it
        // as a String
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"smartbearUrl\") = " + ConfigurationReader.getProperty("smartbearUrl"));
        //break until : 3.08PM CST - 4.08PM EST
    }

}
