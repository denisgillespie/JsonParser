package org.jsonparser.application;

public class JsonParser 
{
	
	public static void main (String[] args)
	{
		String unformattedJson = "{\"order_num\":\"O2012019231a\",\"order_date\":\"2012-06-27\",\"order_id\":21934,\"order_item\":[{\"product_id\":20933,\"quantity\":3,\"price\":36000,\"product_name\":\"Thingamagic 2000\",\"unit_price\":12000},{\"product_id\":10366,\"quantity\":1,\"price\":100,\"product_name\":\"Super Duper Blooper\",\"unit_price\":100}]}";
		String formattedJson = formatJsonString(unformattedJson);

		StringBuilder sb = new StringBuilder();
		
		System.out.print("ORIGINAL STRING:\n\n" + unformattedJson);
		System.out.print("\n\nNEW STRING:\n\n" + formattedJson);
		
	}
	
	public static String formatJsonString(String json)
	{
		int index = 0;
		String[] newJson = json.split(",", 0);
		newJson = json.split(",", 0);
		for(String s : newJson)
		{
			System.out.println(s);
		}
		
		return "";//newJson[0];
	}

}
