package carrentalsystem;

import java.util.Date;
/**
 * Creates a simple real-time chart
 */
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

//import org.jfree.chart;

public class RecordReport {

  public XYChart getAnnualChart() {
    double[] month = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    double[] revenue = new double[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

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
