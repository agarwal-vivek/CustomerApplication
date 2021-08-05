package com.data.reports;

import com.data.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgBuildTimeGroupByGeoZoneReportItem extends ReportItem
{

    @Override
    /* printReport method accept the list of Customes and print the report
     * for avg. build time grouping by Geozone
     * @Input: List of customers
     * @Output: report in string format.
     */
    String printReport(List<Customer> customers)
    {

        Map<String,Double> avgBuildtimeGroupByGeoMap= customers.stream().collect( Collectors.groupingBy( Customer::getGeozone, Collectors.mapping( Customer::getBuildduration, Collectors.averagingLong( num->Long.valueOf( num) ))));
        StringBuilder output = new StringBuilder();
        output.append("Avg build time groupBy Geo Zone:").append("\n");
        output.append("Geo Zone").append("\t").append("Avg. build time");
        for (String geoZone: avgBuildtimeGroupByGeoMap.keySet())
        {
            output.append(geoZone).append("\t");
            output.append(avgBuildtimeGroupByGeoMap.get(geoZone)).append("\n");
        }
        return output.toString();
    }
    

}
