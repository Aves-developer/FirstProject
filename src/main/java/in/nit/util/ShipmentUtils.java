package in.nit.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;


@Component
public class ShipmentUtils {

	public void generatePie(String path,List<Object[]>data) {
		//create dataset
		DefaultPieDataset dataset = new DefaultPieDataset();

		for(Object[]arr:data) {
			//key-shipment,value-count
			dataset.setValue(arr[0].toString(),
					Double.valueOf(arr[1].toString()));
		}

		//create JfreeChart using chartfactory
		JFreeChart chart= ChartFactory.createPieChart3D("ShipmentTypeMode",dataset, true,true, false);

		//save as image using ChartUtils
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"resourcess/ShipmentA.jpg"),chart,400,400);
		}
		catch (IOException e) {
			e.printStackTrace();
		}


	}
}

