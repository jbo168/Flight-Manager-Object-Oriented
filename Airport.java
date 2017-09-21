public class Airport
{
	private String airportName;
	private String airportCode;
	
	Airport(String anAirportName,String anAirportCode)
	{
		airportName = anAirportName;
		airportCode = anAirportCode;
	}
	
	public String getAirportName()
	{
		return airportName;
	}
	
	public String getAirportCode()
	{
		return airportCode;
	}
	
	public void setAirportCode(String anAirportCode)
	{
		airportCode = anAirportCode;
	}
	
	public void setAirportName(String anAirportName)
	{
		airportName = anAirportName;
	}
}
