package carrentalsystem;

/**
 * Creates a simple real-time chart
 */
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

//import org.jfree.chart;

public class RecordReport {

  public XYChart getAnnualChart(int inputYear) {
    double[] month = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    GeneralGetters g = new GeneralGetters();
    ArrayList<RecordBooking> allBookings = g.getAllBooking();
    ArrayList<RecordBooking> filteredBookings = new ArrayList<RecordBooking>();

    for (RecordBooking record : allBookings) {
      Calendar bookingTime = new GregorianCalendar();
      bookingTime.setTime(record.getBookingDate());
      int year = bookingTime.get(Calendar.YEAR);
      if (year == inputYear) filteredBookings.add(record);
    }

    ArrayList<Double> arrayRevenue = new ArrayList<>();
    for (int i = 0; i < 12; i++) {
      arrayRevenue.add(0.0);
    }
    for (RecordBooking record : filteredBookings) {
      Calendar bookingTime = new GregorianCalendar();
      bookingTime.setTime(record.getBookingDate());
      int indexMonth = bookingTime.get(Calendar.MONTH);
      if (arrayRevenue.get(indexMonth) == 0) arrayRevenue.set(
        indexMonth,
        record.getTotalPrice()
      ); else arrayRevenue.set(
        indexMonth,
        arrayRevenue.get(indexMonth) + record.getTotalPrice()
      );
    }

    List<Double> newList = arrayRevenue;
    double[] revenue = newList
      .stream()
      .mapToDouble(Double::doubleValue)
      .toArray();

    return QuickChart.getChart(
      "Annual Sales Report ",
      "Month",
      "Revenue",
      "y(x)",
      month,
      revenue
    );
  }
}
