package com.data.controller;

import org.junit.*;

public class CustomerApplicationTest
{
    @Test
    public void processCustomerDataAndReport()
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
