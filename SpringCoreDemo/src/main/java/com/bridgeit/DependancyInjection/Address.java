package com.bridgeit.DependancyInjection;

public class Address {

		String city;
		String State;
		int zipCode;
		
		public Address(){
			
		}

		public Address(String city, String state, int zipCode) {
			super();
			this.city = city;
			State = state;
			this.zipCode = zipCode;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return State;
		}

		public void setState(String state) {
			State = state;
		}

		public int getZipCode() {
			return zipCode;
		}

		public void setZipCode(int zipCode) {
			this.zipCode = zipCode;
		}

		@Override
		public String toString() {
			return "Address [city=" + city + ", State=" + State + ", zipCode=" + zipCode + "]";
		}
		
		
		
}
