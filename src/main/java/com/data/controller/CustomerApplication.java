package com.data.controller;

import com.data.model.Customer;
import com.data.parsing.DataParser;
import com.data.parsing.StringDataParser;
import com.data.reports.ReportGenerator;

import java.util.List;

public class CustomerApplication
{

    ReportGenerator report;

    /* processCustomerData method will accept a data string and parse it into
     * List of customers and pass this list into ReportGenerator.
     * @Input: String data
     */
     public void processCustomerData(String data)
     {
        DataParser parser =new StringDataParser();
        List<Customer> customerList =   parser.parse( data);
        report = new ReportGenerator(customerList);
     }

     /* getCustomerReport method will generate the report
      * and return as a string format
      */
    public String getCustomerReport()
    {
        return report.generateReport();
   }


    public static void main(String args[])
    {
       String data = "2343225,2345,us_east,RedTeam,ProjectApple,3445s\n"
               + "1223456,2345,us_west,BlueTeam,ProjectBanana,2211s\n"
               + "3244332,2346,eu_west,YellowTeam3,ProjectCarrot,4322s\n"
               + "1233456,2345,us_west,BlueTeam,ProjectDate,2221s\n"
               + "3244132,2346,eu_west,YellowTeam3,ProjectEgg,4122s";

        CustomerApplication customerApplication = new CustomerApplication();

        customerApplication.processCustomerData(data);
        System.out.println(customerApplication.getCustomerReport());
    }

}
