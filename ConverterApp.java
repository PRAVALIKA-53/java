/*⦁	Develop a java application to inherit currency converter 
 * (Dollar to INR, EURO to INR, Yen to INR and vice versa), 
 * distance converter (meter to KM, miles to KM and vice versa) ,
 *  time converter (hours to minutes, seconds and vice versa) from a base class Converter
 */
package lab_projects;
 abstract class Converter {
 public abstract double convert(double value);
}

 class CurrencyConverter extends Converter {
 String fromCurrency;
 String toCurrency;
 double conversionRate;

 public CurrencyConverter(String fromCurrency, String toCurrency, double conversionRate) {
     this.fromCurrency = fromCurrency;
     this.toCurrency = toCurrency;
     this.conversionRate = conversionRate;
 }
 public double convert(double value) {
     return value * conversionRate;
 }

 public String getConversionInfo(double value) {
     return value + " " + fromCurrency + " = " + convert(value) + " " + toCurrency;
 }
}

class DistanceConverter extends Converter {
 String fromUnit;
 String toUnit;
 double conversionFactor;

 public DistanceConverter(String fromUnit, String toUnit, double conversionFactor) {
     this.fromUnit = fromUnit;
     this.toUnit = toUnit;
     this.conversionFactor = conversionFactor;
 }

 public double convert(double value) {
     return value * conversionFactor;
 }

 public String getConversionInfo(double value) {
     return value + " " + fromUnit + " = " + convert(value) + " " + toUnit;
 }
}


 class TimeConverter extends Converter {
  String fromUnit;
  String toUnit;
  double conversionFactor;

 public TimeConverter(String fromUnit, String toUnit, double conversionFactor) {
     this.fromUnit = fromUnit;
     this.toUnit = toUnit;
     this.conversionFactor = conversionFactor;
 }


 public double convert(double value) {
     return value * conversionFactor;
 }

 public String getConversionInfo(double value) {
     return value + " " + fromUnit + " = " + convert(value) + " " + toUnit;
 }
}

public class ConverterApp {
 public static void main(String[] args) {
     CurrencyConverter dollarToInr = new CurrencyConverter("USD", "INR", 75.0);
     CurrencyConverter inrToDollar = new CurrencyConverter("INR", "USD", 1/75.0);
     DistanceConverter meterToKm = new DistanceConverter("meters", "kilometers", 0.001);
     DistanceConverter kmToMeter = new DistanceConverter("kilometers", "meters", 1000.0); 
     TimeConverter hoursToMinutes = new TimeConverter("hours", "minutes", 60.0);
     TimeConverter minutesToHours = new TimeConverter("minutes", "hours", 1/60.0);
    
     System.out.println("Currency Conversions:");
     System.out.println(dollarToInr.getConversionInfo(100.0));
     System.out.println(inrToDollar.getConversionInfo(7500.0));
     System.out.println("\nDistance Conversions:");
     System.out.println(meterToKm.getConversionInfo(1000.0));
     System.out.println(kmToMeter.getConversionInfo(1.0)); 
     System.out.println("\nTime Conversions:");
     System.out.println(hoursToMinutes.getConversionInfo(2.0));
     System.out.println(minutesToHours.getConversionInfo(120.0));

 }
}
