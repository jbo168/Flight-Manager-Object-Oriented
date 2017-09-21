public class Flight
{
	private String flightCode;
	private String sourceAirport;
	private String destinationAirport;
	private String departureTime;
	private String arrivalTime;
	private String days;
	private String firstDate;
	private String secondDate;
	
	
	Flight(String aFlightCode,String aSourceAirport,String aDestinationAirport,
			String aDepartuteTime,String anArrivalTime,String aDays,
			String aFirstDate,String aSecondDate)
	{
		flightCode 			= aFlightCode;
		sourceAirport 		= aSourceAirport;
		destinationAirport	= aDestinationAirport;
		departureTime 		= aDepartuteTime;
		arrivalTime	 		= anArrivalTime;
		days				= aDays;
		firstDate 			= aFirstDate;
		secondDate 			= aSecondDate;
	}
	
	public String getFlightCode()
	{
		return flightCode;
	}
	
	public String getSourceAirport()
	{
		return sourceAirport;
	}
	
	public String getDestinationAirport()
	{
		return destinationAirport;
	}
	
	public String getDepartureTime()
	{
		return departureTime;
	}
	
	public String getArrivalTime()
	{
		return arrivalTime;
	}
	
	public String getDays()
	{
		return days;
	}
	
	public String getFirstDate()
	{
		return firstDate;
	}
	
	public String getSecondDate()
	{
		return secondDate;
	}
	
	public void setFlightCode(String aFlightCode)
	{
		flightCode = aFlightCode;
	}
	
	public void setSourceAirport(String aSourceAirport)
	{
		sourceAirport = aSourceAirport;
	}
	
	public void setDestinationAirport(String aDestinationAirport)
	{
		destinationAirport = aDestinationAirport;
	}
	
	public void setDepartureTime(String aDepartureTime)
	{
		departureTime = aDepartureTime;
	}
	
	public void setArrivalTime(String anArrivalTime)
	{
		arrivalTime = anArrivalTime;
	}
	
	public void setDays(String aDays)
	{
		days = aDays;
	}
	
	public void setFirstDate(String aFirstDate)
	{
		firstDate = aFirstDate;
	}
	
	public void setSecondDate(String aSecondDate)
	{
		secondDate = aSecondDate;
	}
}
