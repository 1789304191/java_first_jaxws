
package com.huateng.haobai.ppcore.control;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-08-18T17:35:14.682+08:00
 * Generated source version: 3.1.11
 * 
 */
public final class IDispatchControlPortType_IDispatchControlHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("http://control.ppcore.haobai.huateng.com", "IDispatchControl");

    private IDispatchControlPortType_IDispatchControlHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = IDispatchControl.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        IDispatchControl ss = new IDispatchControl(wsdlURL, SERVICE_NAME);
        IDispatchControlPortType port = ss.getIDispatchControlHttpPort();  
        
        {
        System.out.println("Invoking dispatchCommand...");
        String _dispatchCommand_in0 = "";
        String _dispatchCommand_in1 = "";
        String _dispatchCommand__return = port.dispatchCommand(_dispatchCommand_in0, _dispatchCommand_in1);
        System.out.println("dispatchCommand.result=" + _dispatchCommand__return);


        }

        System.exit(0);
    }

}
