package com.data.reports;

import com.data.model.Customer;

import java.util.List;

public abstract class ReportItem
{
   abstract String printReport(List<Customer> customers);
}
