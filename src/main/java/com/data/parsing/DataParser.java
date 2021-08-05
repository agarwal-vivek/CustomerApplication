package com.data.parsing;

import com.data.model.Customer;

import java.util.List;

public interface DataParser
{
    List<Customer> parse( String data);

}
