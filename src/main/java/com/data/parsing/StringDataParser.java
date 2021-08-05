package com.data.parsing;

import com.data.model.Customer;

import java.util.LinkedList;
import java.util.List;

public class StringDataParser implements DataParser
{

    @Override
    /* Parse method accept a string and parse the data into list of Customer
     * @Input String
     * @Output List<Customer>
     */
    public List<Customer> parse( String data )
    {

         String[] info = new String[6];

         List<Customer> list = new LinkedList<Customer>();

         if(data == null || data.length()==0)
           return list;

         String[] customerData = data.split("\\n");

         for(String customerInfo : customerData)
         {
             info = customerInfo.split(",");
             Customer customer = new Customer();
             customer.setCustomerId( Long.parseLong( info[0]) );
             customer.setContractId( Integer.parseInt(info[1]) );
             customer.setGeozone( info[2] );
             customer.setTeamcode( info[3] );
             customer.setProjectcode(info[4]  );
             customer.setBuildduration( Integer.parseInt(info[5].substring( 0, info[5].length()-1)  ) );

             list.add( customer);
         }
         return list;
    }
}
