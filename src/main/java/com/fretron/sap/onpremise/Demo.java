package com.fretron.sap.onpremise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import mc_style.functions.soap.sap.document.sap_com.Zfm_shipment_serviceLocator;
import mc_style.functions.soap.sap.document.sap_com.ZshipmentNoTable;
import mc_style.functions.soap.sap.document.sap_com.holders.TableOfZshipmentNoTableHolder;

public class Demo {
	
	public static void main(String[] ard)
	{
		
		System.out.println("Sync start at ::"+new Date().toString());
		
		 Date dateObject = new Date();
		 Calendar calendar = Calendar.getInstance();
			calendar.setTime(dateObject);
			int m = calendar.get(Calendar.MONTH)+1;
			int dd = calendar.get(Calendar.DATE);
		System.out.println(calendar.get(Calendar.MINUTE));
		//fetchShipmentFromSap();
 }
	
	private static void fetchShipmentFromSap() {
		String  lastSync ="";
		boolean isFirstTime = true;
		try {
			ZshipmentNoTable[] zNoTables =null;
			 List<ZshipmentNoTable> tripShipmentList = null;

			TableOfZshipmentNoTableHolder itTable = new TableOfZshipmentNoTableHolder();

			Zfm_shipment_serviceLocator  shipmentno_serviceLocator = new Zfm_shipment_serviceLocator();


			shipmentno_serviceLocator.getZfm_shipment_service_abap().zfmShipmentnoService(itTable, 50);
			zNoTables = itTable.value;

			if (zNoTables.length>0 ) {
				
				if (!isFirstTime) {
					
					for (int i=0;i<zNoTables.length;i++) {
						ZshipmentNoTable  shipment = zNoTables[i];
						
						String spmtNo = shipment.getShipmentno();
						String date = shipment.getCreatedOn();
						
	                    if (lastSync.equals(spmtNo+"@"+date) && !isFirstTime) {
	                    	
	                    List<ZshipmentNoTable> shipmentList =  Arrays.asList(zNoTables);
	                    tripShipmentList =  shipmentList.subList(i+1, zNoTables.length);
	                    break;
						}
	                    else {
							System.out.println("skip::"+spmtNo);
						}
					}
				}
				
				for (ZshipmentNoTable zshipmentNoTable : tripShipmentList) {
					
					System.out.println("sync shipment ::"+zshipmentNoTable.getShipmentno());
					lastSync = zshipmentNoTable.getShipmentno()+"@"+zshipmentNoTable.getCreatedOn();
				}
				isFirstTime = false;
			}
			else {
				System.out.println("No data found from sap");
			}

		}
		catch (Exception e) {
			System.out.println("Exception Occurs::"+e.getMessage());

		}

	}


}
