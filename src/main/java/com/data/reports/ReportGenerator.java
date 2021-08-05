package com.data.reports;

import com.data.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class ReportGenerator
{
    List<Customer> customers;

    List<ReportItem> reportItems = new ArrayList<>();

    public ReportGenerator( List<Customer> customers )
    {
        this.customers = customers;
        reportItems.add( new CustomersGroupByContractIDReportItem() );
        reportItems.add( new CustomersGroupByGeozoneReportItem() );
        reportItems.add( new CustomerIdListGroupByGeoZoneReportItem() );
        reportItems.add( new AvgBuildTimeGroupByGeoZoneReportItem() );

    }

    public String generateReport()
    {

        StringBuilder report = new StringBuilder();
        for( ReportItem reportItem : reportItems )
        {
            report.append( reportItem.printReport( customers ) ).append( "\n" );
        }

        return report.toString();
    }
}
