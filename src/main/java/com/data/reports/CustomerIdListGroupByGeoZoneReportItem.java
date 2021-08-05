package com.data.reports;

import com.data.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerIdListGroupByGeoZoneReportItem extends ReportItem
{
   List<Customer> customers = new ArrayList<Customer>();


    /* printReport method accept the list of Customes and print the report
     * List of customers Grouping by Geozone
     * @Input: List of customers
     * @Output: report in string format.
     */
    @Override String printReport(List<Customer> customers)
    {

        Map<String, List<Long>> customerListByGeoZoneMap= customers.stream().collect( Collectors.groupingBy( Customer::getGeozone, Collectors.mapping( Customer::getCustomerId, Collectors.toList())));

        StringBuilder output = new StringBuilder();
        output.append("Customer ID GroupBy Geo Zone:").append("\n");
        output.append("Geo Zone").append("\t").append("Customer_Id").append("\n");
        for (String geoZone: customerListByGeoZoneMap.keySet())
        {
            List<Long> list = customerListByGeoZoneMap.get(geoZone);
            for(long customerId : list)
            {
                output.append(geoZone).append("\t");
                output.append(customerId).append("\t");
                output.append("\n");
            }
        }
        return output.toString();
    }
}
