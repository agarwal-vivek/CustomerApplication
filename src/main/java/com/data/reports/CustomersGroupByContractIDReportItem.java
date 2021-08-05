package com.data.reports;

import com.data.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomersGroupByContractIDReportItem extends ReportItem
{
    List<Customer> customers = new ArrayList<Customer>();


    @Override
   /* printReport method accept the list of Customes and print the report
    * for number of customers grouping by contractId
    * @Input: List of customers
    * @Output: report in string format.
    */
    String printReport(List<Customer> customers)
    {
        Map<Integer,Long>  customersByContractIdMap = customers.stream().collect( Collectors.groupingBy( Customer::getContractId, Collectors.counting()) );
        StringBuilder output = new StringBuilder();
        output.append("Number of customers Per Contact Id:").append("\n");
        output.append("Contract_Id").append("\t").append("Number of Customers").append("\n");
        for (int contractId: customersByContractIdMap.keySet())
        {
            output.append(contractId).append("\t");
            output.append(customersByContractIdMap.get(contractId)).append("\n");
        }
        return output.toString();
    }
}
