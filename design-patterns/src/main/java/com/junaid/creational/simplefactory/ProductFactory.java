package com.junaid.creational.simplefactory;

public class ProductFactory {
	
	public static Product getChart(String chartType)
	{
		if(chartType.equals("pie"))
		{
			return new PieChart();
		}
		else if(chartType.equals("bar"))
		{
			return new BarChart();
		}
		return null;
		
	}

}
