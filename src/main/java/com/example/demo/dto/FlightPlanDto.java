package com.example.demo.dto;

public class FlightPlanDto {
	private String flightNumber;
	private Double legDate;
	private String origin;
	private String destination;
	private String alternate;
	private String equipment;
	private String aircraftNumber;
	private Double cruiseValue;
	private String windValue;
	private String routeCode;
	private String completeText;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Double getLegDate() {
		return legDate;
	}

	public void setLegDate(Double legDate) {
		this.legDate = legDate;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAlternate() {
		return alternate;
	}

	public void setAlternate(String alternate) {
		this.alternate = alternate;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getAircraftNumber() {
		return aircraftNumber;
	}

	public void setAircraftNumber(String aircraftNumber) {
		this.aircraftNumber = aircraftNumber;
	}

	public Double getCruiseValue() {
		return cruiseValue;
	}

	public void setCruiseValue(Double cruiseValue) {
		this.cruiseValue = cruiseValue;
	}

	public String getWindValue() {
		return windValue;
	}

	public void setWindValue(String windValue) {
		this.windValue = windValue;
	}

	public String getRouteCode() {
		return routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	public String getCompleteText() {
		return completeText;
	}

	public void setCompleteText(String completeText) {
		this.completeText = completeText;
	}

}
