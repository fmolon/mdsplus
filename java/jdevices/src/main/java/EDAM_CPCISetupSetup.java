

import java.awt.*;
import javax.swing.*;
/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class EDAM_CPCISetupSetup extends DeviceSetup
{
  BorderLayout borderLayout1 = new BorderLayout();
  DeviceButtons deviceButtons1 = new DeviceButtons();
  JTabbedPane jTabbedPane1 = new JTabbedPane();
  JPanel jPanel5 = new JPanel();
  GridLayout gridLayout1 = new GridLayout();
  JPanel jPanel1 = new JPanel();
  JPanel jPanel2 = new JPanel();
  JPanel jPanel3 = new JPanel();
  JPanel jPanel4 = new JPanel();
  JPanel jPanel6 = new JPanel();
  JPanel jPanel7 = new JPanel();
  JPanel jPanel8 = new JPanel();
  DeviceField deviceField1 = new DeviceField();
  DeviceField deviceField2 = new DeviceField();
  DeviceField deviceField3 = new DeviceField();
  DeviceField deviceField4 = new DeviceField();
  DeviceField deviceField5 = new DeviceField();
  DeviceField deviceField6 = new DeviceField();
  DeviceField deviceField7 = new DeviceField();
  JPanel jPanel9 = new JPanel();
  GridLayout gridLayout2 = new GridLayout();
  DeviceField deviceField8 = new DeviceField();
  DeviceField deviceField9 = new DeviceField();
  JPanel jPanel10 = new JPanel();
  DeviceField deviceField10 = new DeviceField();
  JPanel jPanel11 = new JPanel();
  JPanel jPanel12 = new JPanel();
  JPanel jPanel13 = new JPanel();
  DeviceField deviceField12 = new DeviceField();
  JPanel jPanel14 = new JPanel();
  JPanel jPanel15 = new JPanel();
  DeviceField deviceField13 = new DeviceField();
  JPanel jPanel16 = new JPanel();
  JPanel jPanel17 = new JPanel();
  GridLayout gridLayout3 = new GridLayout();
  DeviceField deviceField15 = new DeviceField();
  DeviceField deviceField16 = new DeviceField();
  JPanel jPanel18 = new JPanel();
  DeviceField deviceField17 = new DeviceField();
  JPanel jPanel19 = new JPanel();
  JPanel jPanel110 = new JPanel();
  DeviceField deviceField18 = new DeviceField();
  JPanel jPanel111 = new JPanel();
  DeviceField deviceField19 = new DeviceField();
  JPanel jPanel112 = new JPanel();
  JPanel jPanel113 = new JPanel();
  DeviceField deviceField110 = new DeviceField();
  JPanel jPanel114 = new JPanel();
  DeviceField deviceField111 = new DeviceField();
  JPanel jPanel115 = new JPanel();
  GridLayout gridLayout4 = new GridLayout();
  DeviceField deviceField112 = new DeviceField();
  DeviceField deviceField113 = new DeviceField();
  JPanel jPanel116 = new JPanel();
  DeviceField deviceField114 = new DeviceField();
  JPanel jPanel117 = new JPanel();
  JPanel jPanel118 = new JPanel();
  JPanel jPanel119 = new JPanel();
  DeviceField deviceField116 = new DeviceField();
  JPanel jPanel1110 = new JPanel();
  JPanel jPanel1111 = new JPanel();
  DeviceField deviceField117 = new DeviceField();
  JPanel jPanel1112 = new JPanel();
  JPanel jPanel1113 = new JPanel();
  GridLayout gridLayout5 = new GridLayout();
  JPanel jPanel1114 = new JPanel();
  DeviceField deviceField1111 = new DeviceField();
  JPanel jPanel1115 = new JPanel();
  JPanel jPanel1116 = new JPanel();
  DeviceField deviceField1112 = new DeviceField();
  JPanel jPanel1117 = new JPanel();
  JPanel jPanel1118 = new JPanel();
  JPanel jPanel1119 = new JPanel();
  JPanel jPanel11110 = new JPanel();
  DeviceField deviceField1115 = new DeviceField();
  JPanel jPanel20 = new JPanel();
  JPanel jPanel21 = new JPanel();
  DeviceField deviceField20 = new DeviceField();
  DeviceField deviceField21 = new DeviceField();
  JPanel jPanel22 = new JPanel();
  JPanel jPanel23 = new JPanel();
  DeviceField deviceField22 = new DeviceField();
  DeviceField deviceField23 = new DeviceField();
  JPanel jPanel24 = new JPanel();
  JPanel jPanel25 = new JPanel();
  DeviceField deviceField24 = new DeviceField();
  DeviceField deviceField25 = new DeviceField();
  JPanel jPanel26 = new JPanel();
  JPanel jPanel27 = new JPanel();
  DeviceField deviceField26 = new DeviceField();
  DeviceField deviceField27 = new DeviceField();
  JPanel jPanel28 = new JPanel();
  JPanel jPanel29 = new JPanel();
  public EDAM_CPCISetupSetup()
  {
    try
    {
      jbInit();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  private void jbInit() throws Exception
  {
    this.setWidth(467);
    this.setHeight(467);
    this.setDeviceType("EDAM_CPCISetup");
    this.setDeviceProvider("localhost");
    this.setDeviceTitle("EDAM CPCI Data Acquisition Setup");
    this.getContentPane().setLayout(borderLayout1);
    jPanel5.setLayout(gridLayout1);
    gridLayout1.setColumns(1);
    gridLayout1.setRows(9);
    deviceField1.setOffsetNid(37);
    deviceField1.setTextOnly(true);
    deviceField1.setLabelString("Trigger Event: ");
    deviceField1.setNumCols(25);
    deviceField1.setIdentifier("");
    deviceField1.setEditable(false);
    deviceField1.setDisplayEvaluated(true);
    deviceField2.setOffsetNid(38);
    deviceField2.setLabelString("Trigger delay: ");
    deviceField2.setNumCols(25);
    deviceField2.setIdentifier("");
    deviceField3.setOffsetNid(32);
    deviceField3.setTextOnly(true);
    deviceField3.setLabelString("DClock Event: ");
    deviceField3.setNumCols(25);
    deviceField3.setIdentifier("");
    deviceField3.setEditable(false);
    deviceField3.setDisplayEvaluated(true);
    deviceField4.setOffsetNid(33);
    deviceField4.setLabelString("DClock delay: ");
    deviceField4.setNumCols(25);
    deviceField4.setIdentifier("");
    deviceField5.setOffsetNid(34);
    deviceField5.setLabelString("DClock duration: ");
    deviceField5.setNumCols(25);
    deviceField5.setIdentifier("");
    deviceField6.setOffsetNid(35);
    deviceField6.setLabelString("DClock frequency 1: ");
    deviceField6.setIdentifier("");
    deviceField7.setOffsetNid(36);
    deviceField7.setLabelString("DClock frequency 2: ");
    deviceField7.setIdentifier("");
    gridLayout2.setColumns(1);
    gridLayout2.setRows(9);
    deviceField8.setOffsetNid(24);
    deviceField8.setLabelString("DClock duration: ");
    deviceField8.setNumCols(25);
    deviceField8.setIdentifier("");
    deviceField9.setOffsetNid(26);
    deviceField9.setLabelString("DClock frequency 2: ");
    deviceField9.setIdentifier("");
    deviceField10.setOffsetNid(22);
    deviceField10.setTextOnly(true);
    deviceField10.setLabelString("DClock Event: ");
    deviceField10.setNumCols(25);
    deviceField10.setIdentifier("");
    deviceField10.setEditable(false);
    deviceField10.setDisplayEvaluated(true);
    deviceField12.setOffsetNid(25);
    deviceField12.setLabelString("DClock frequency 1: ");
    deviceField12.setIdentifier("");
    jPanel14.setLayout(gridLayout2);
    deviceField13.setOffsetNid(23);
    deviceField13.setLabelString("DClock delay: ");
    deviceField13.setNumCols(25);
    deviceField13.setIdentifier("");
    gridLayout3.setColumns(1);
    gridLayout3.setRows(9);
    deviceField15.setOffsetNid(14);
    deviceField15.setLabelString("DClock duration: ");
    deviceField15.setNumCols(25);
    deviceField15.setIdentifier("");
    deviceField16.setOffsetNid(16);
    deviceField16.setLabelString("DClock frequency 2: ");
    deviceField16.setIdentifier("");
    deviceField17.setOffsetNid(12);
    deviceField17.setTextOnly(true);
    deviceField17.setLabelString("DClock Event: ");
    deviceField17.setNumCols(25);
    deviceField17.setIdentifier("");
    deviceField17.setEditable(false);
    deviceField17.setDisplayEvaluated(true);
    deviceField18.setOffsetNid(17);
    deviceField18.setTextOnly(true);
    deviceField18.setLabelString("Trigger Event: ");
    deviceField18.setNumCols(25);
    deviceField18.setIdentifier("");
    deviceField18.setEditable(false);
    deviceField18.setDisplayEvaluated(true);
    deviceField19.setOffsetNid(15);
    deviceField19.setLabelString("DClock frequency 1: ");
    deviceField19.setIdentifier("");
    jPanel112.setLayout(gridLayout3);
    deviceField110.setOffsetNid(13);
    deviceField110.setLabelString("DClock delay: ");
    deviceField110.setNumCols(25);
    deviceField110.setIdentifier("");
    deviceField111.setOffsetNid(18);
    deviceField111.setLabelString("Trigger delay: ");
    deviceField111.setNumCols(25);
    deviceField111.setIdentifier("");
    gridLayout4.setColumns(1);
    gridLayout4.setRows(9);
    deviceField112.setOffsetNid(4);
    deviceField112.setLabelString("DClock duration: ");
    deviceField112.setNumCols(25);
    deviceField112.setIdentifier("");
    deviceField113.setOffsetNid(6);
    deviceField113.setLabelString("DClock frequency 2: ");
    deviceField113.setIdentifier("");
    deviceField114.setOffsetNid(2);
    deviceField114.setTextOnly(true);
    deviceField114.setLabelString("DClock Event: ");
    deviceField114.setNumCols(25);
    deviceField114.setIdentifier("");
    deviceField114.setEditable(false);
    deviceField114.setDisplayEvaluated(true);
    deviceField116.setOffsetNid(5);
    deviceField116.setLabelString("DClock frequency 1: ");
    deviceField116.setIdentifier("");
    jPanel1110.setLayout(gridLayout4);
    deviceField117.setOffsetNid(3);
    deviceField117.setLabelString("DClock delay: ");
    deviceField117.setNumCols(25);
    deviceField117.setIdentifier("");
    gridLayout5.setColumns(1);
    gridLayout5.setRows(9);
    deviceField1111.setOffsetNid(44);
    deviceField1111.setTextOnly(false);
    deviceField1111.setLabelString("Trigger duration: ");
    deviceField1111.setNumCols(25);
    deviceField1111.setIdentifier("");
    deviceField1111.setEditable(true);
    deviceField1111.setDisplayEvaluated(false);
    deviceField1111.setPreferredWidth(-1);
    deviceField1112.setOffsetNid(42);
    deviceField1112.setTextOnly(true);
    deviceField1112.setLabelString("Trigger Event: ");
    deviceField1112.setNumCols(25);
    deviceField1112.setIdentifier("");
    deviceField1112.setEditable(false);
    deviceField1112.setDisplayEvaluated(true);
    jPanel1118.setLayout(gridLayout5);
    deviceField1115.setOffsetNid(43);
    deviceField1115.setLabelString("Trigger delay: ");
    deviceField1115.setNumCols(25);
    deviceField1115.setIdentifier("");
    deviceField20.setOffsetNid(39);
    deviceField20.setLabelString("Start acq: ");
    deviceField20.setIdentifier("");
    deviceField21.setOffsetNid(40);
    deviceField21.setLabelString("End acq: ");
    deviceField21.setIdentifier("");
    deviceField22.setOffsetNid(29);
    deviceField22.setLabelString("Start acq: ");
    deviceField22.setIdentifier("");
    deviceField23.setOffsetNid(30);
    deviceField23.setLabelString("End acq: ");
    deviceField23.setIdentifier("");
    deviceField24.setOffsetNid(19);
    deviceField24.setLabelString("Start acq: ");
    deviceField24.setIdentifier("");
    deviceField25.setOffsetNid(20);
    deviceField25.setLabelString("End acq: ");
    deviceField25.setIdentifier("");
    deviceField26.setOffsetNid(9);
    deviceField26.setLabelString("Start acq: ");
    deviceField26.setIdentifier("");
    deviceField27.setOffsetNid(10);
    deviceField27.setLabelString("End acq: ");
    deviceField27.setIdentifier("");
    this.getContentPane().add(deviceButtons1, BorderLayout.SOUTH);
    this.getContentPane().add(jTabbedPane1, BorderLayout.CENTER);
    jTabbedPane1.add(jPanel5,      "PBMV");
    jPanel5.add(jPanel1, null);
    jPanel1.add(deviceField1, null);
    jPanel5.add(jPanel8, null);
    jPanel8.add(deviceField2, null);
    jPanel5.add(jPanel7, null);
    jPanel7.add(deviceField3, null);
    jPanel5.add(jPanel6, null);
    jPanel6.add(deviceField4, null);
    jPanel5.add(jPanel4, null);
    jPanel4.add(deviceField5, null);
    jPanel5.add(jPanel3, null);
    jPanel3.add(deviceField6, null);
    jPanel5.add(jPanel2, null);
    jPanel2.add(deviceField7, null);
    jPanel5.add(jPanel20, null);
    jPanel20.add(deviceField20, null);
    jPanel5.add(jPanel21, null);
    jPanel21.add(deviceField21, null);
    jTabbedPane1.add(jPanel14,      "PBMC");
    jPanel14.add(jPanel9, null);
    jPanel14.add(jPanel11, null);
    jPanel14.add(jPanel15, null);
    jPanel15.add(deviceField10, null);
    jPanel14.add(jPanel10, null);
    jPanel10.add(deviceField13, null);
    jPanel14.add(jPanel12, null);
    jPanel12.add(deviceField8, null);
    jPanel14.add(jPanel16, null);
    jPanel16.add(deviceField12, null);
    jPanel14.add(jPanel13, null);
    jPanel13.add(deviceField9, null);
    jPanel14.add(jPanel23, null);
    jPanel23.add(deviceField22, null);
    jPanel14.add(jPanel22, null);
    jPanel22.add(deviceField23, null);
    jTabbedPane1.add(jPanel112,     "TBMV");
    jPanel112.add(jPanel17, null);
    jPanel17.add(deviceField18, null);
    jPanel112.add(jPanel19, null);
    jPanel19.add(deviceField111, null);
    jPanel112.add(jPanel113, null);
    jPanel113.add(deviceField17, null);
    jPanel112.add(jPanel18, null);
    jPanel18.add(deviceField110, null);
    jPanel112.add(jPanel110, null);
    jPanel110.add(deviceField15, null);
    jPanel112.add(jPanel114, null);
    jPanel114.add(deviceField19, null);
    jPanel112.add(jPanel111, null);
    jPanel111.add(deviceField16, null);
    jPanel112.add(jPanel25, null);
    jPanel25.add(deviceField24, null);
    jPanel112.add(jPanel24, null);
    jPanel24.add(deviceField25, null);
    jTabbedPane1.add(jPanel1110,     "TBMC");
    jPanel1110.add(jPanel115, null);
    jPanel1110.add(jPanel117, null);
    jPanel1110.add(jPanel1111, null);
    jPanel1111.add(deviceField114, null);
    jPanel1110.add(jPanel116, null);
    jPanel116.add(deviceField117, null);
    jPanel1110.add(jPanel118, null);
    jPanel118.add(deviceField112, null);
    jPanel1110.add(jPanel1112, null);
    jPanel1112.add(deviceField116, null);
    jPanel1110.add(jPanel119, null);
    jPanel119.add(deviceField113, null);
    jPanel1110.add(jPanel27, null);
    jPanel27.add(deviceField26, null);
    jPanel1110.add(jPanel26, null);
    jPanel26.add(deviceField27, null);
    jTabbedPane1.add(jPanel1118,    "ZERO");
    jPanel1118.add(jPanel1113, null);
    jPanel1113.add(deviceField1112, null);
    jPanel1118.add(jPanel1115, null);
    jPanel1115.add(deviceField1115, null);
    jPanel1118.add(jPanel1119, null);
    jPanel1119.add(deviceField1111, null);
    jPanel1118.add(jPanel1114, null);
    jPanel1118.add(jPanel1116, null);
    jPanel1118.add(jPanel11110, null);
    jPanel1118.add(jPanel1117, null);
    jPanel1118.add(jPanel29, null);
    jPanel1118.add(jPanel28, null);
  }

}