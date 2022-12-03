package carrentalsystem;

import java.time.*;
/**
 * Creates a simple real-time chart
 */
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.*;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

//import org.jfree.chart;

public class RecordReport {

  public XYChart getAnnualChart(int inputYear) {
    // x axis labeling
    double[] month = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

    // initialize getters
    GeneralGetters g = new GeneralGetters();
    ArrayList<RecordBooking> allBookings = g.getAllBooking();
    ArrayList<RecordBooking> filteredBookings = new ArrayList<RecordBooking>();

    // only add valid bookings to "filteredBookings"
    // it will only add the year that the user specified, and in an approve state
    for (RecordBooking record : allBookings) {
      Calendar bookingTime = new GregorianCalendar();
      bookingTime.setTime(record.getBookingDate());
      int year = bookingTime.get(Calendar.YEAR);
      if (
        year == inputYear && record.getStatus().equalsIgnoreCase("Approve")
      ) filteredBookings.add(record);
    }

    // get the sum of revenue in that month
    ArrayList<Double> arrayRevenue = new ArrayList<>();
    // initialize empty values, so if the month has no booking it will return 0
    for (int i = 0; i < 12; i++) {
      arrayRevenue.add(0.0);
    }
    // sum of the revenue
    for (RecordBooking record : filteredBookings) {
      Calendar bookingTime = new GregorianCalendar();
      bookingTime.setTime(record.getBookingDate());
      int indexMonth = bookingTime.get(Calendar.MONTH);
      // if there is no booking, we use set method
      if (arrayRevenue.get(indexMonth) == 0) arrayRevenue.set(
        indexMonth,
        record.getTotalPrice()
        // else we get the current number, then add it before setting it
      ); else arrayRevenue.set(
        indexMonth,
        arrayRevenue.get(indexMonth) + record.getTotalPrice()
      );
    }

    // because the chart only accepts Array and not ArrayList,
    // we have to convert it to an Array
    List<Double> newList = arrayRevenue;
    double[] revenue = newList
      .stream()
      .mapToDouble(Double::doubleValue)
      .toArray();

    // we return it
    return QuickChart.getChart(
      "Annual Sales Report ",
      "Month",
      "Revenue",
      "y(x)",
      month,
      revenue
    );
  }

  public XYChart getMonthlyChart(int inputYear, int inputMonth) {
    GeneralGetters g = new GeneralGetters();
    ArrayList<RecordBooking> allBookings = g.getAllBooking();
    ArrayList<RecordBooking> filteredBookings = new ArrayList<RecordBooking>();
    for (RecordBooking r : allBookings) {
      Calendar bookingTime = new GregorianCalendar();
      bookingTime.setTime(r.getBookingDate());

      int year = bookingTime.get(Calendar.YEAR);
      int month = bookingTime.get(Calendar.MONTH) + 1;
      int day = bookingTime.get(Calendar.DAY_OF_MONTH);

      if (
        year == inputYear &&
        month == inputMonth &&
        r.getStatus().equalsIgnoreCase("Approve")
      ) filteredBookings.add(r);
    }

    // set X axis values
    YearMonth yearMonthObject = YearMonth.of(inputYear, inputMonth);
    int selectedMonthDays = yearMonthObject.lengthOfMonth();
    double[] totalDays = new double[selectedMonthDays];
    Arrays.setAll(totalDays, i -> i + 1);

    // set renenue
    ArrayList<Double> arrayRevenue = new ArrayList<>();
    // initialize empty values, so if the month has no booking it will return 0
    for (int i = 0; i < selectedMonthDays; i++) {
      arrayRevenue.add(0.0);
    }

    for (RecordBooking record : filteredBookings) {
      Calendar bookingTime = new GregorianCalendar();
      bookingTime.setTime(record.getBookingDate());
      int indexDay = bookingTime.get(Calendar.DAY_OF_MONTH) - 1;
      // if there is no booking, we use set method
      if (arrayRevenue.get(indexDay) == 0) arrayRevenue.set(
        indexDay,
        record.getTotalPrice()
        // else we get the current number, then add it before setting it
      ); else arrayRevenue.set(
        indexDay,
        arrayRevenue.get(indexDay) + record.getTotalPrice()
      );
    }

    List<Double> newList = arrayRevenue;
    double[] revenue = newList
      .stream()
      .mapToDouble(Double::doubleValue)
      .toArray();

    return QuickChart.getChart(
      "Monthly Sales Report ",
      "Days",
      "Revenue",
      "y(x)",
      totalDays,
      revenue
    );
  }
}
