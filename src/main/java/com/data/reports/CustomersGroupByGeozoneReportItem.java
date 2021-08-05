package com.data.reports;

import com.data.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomersGroupByGeozoneReportItem extends ReportItem
{

    List<Customer> customers = new ArrayList<Customer>();


    @Override
   /* printReport method accept the list of Customes and print the report
    * for number of customers grouping by Geozone
    * @Input: List of customers
    * @Output: report in string format.
    */
    String printReport(List<Customer> customers)
    {

        Map<String,Long> customersToGeoZoneMap= customers.stream().collect( Collectors.groupingBy( Customer::getGeozone, Collectors.counting()) );
        StringBuilder output = new StringBuilder();
        output.append("Number of customers Per Geo Zone:").append("\n");
        output.append("Geo Zone").append("\t").append("Number of Customers").append("\n");
        for (String geoZone: customersToGeoZoneMap.keySet()){
            output.append(geoZone).append("\t");
            output.append(customersToGeoZoneMap.get(geoZone)).append("\n");
        }
        return output.toString();
    }
}
