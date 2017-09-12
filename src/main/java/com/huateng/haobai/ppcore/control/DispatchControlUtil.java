package com.huateng.haobai.ppcore.control;

import javax.xml.namespace.QName;
import java.net.URL;

/**
 * Created by Maggie on 2017/9/11.
 */
public class DispatchControlUtil {

    private static final QName SERVICE_NAME = new QName("http://control.ppcore.haobai.huateng.com", "IDispatchControl1");

    public static String dispatchCommand(String cn0,String cn1){
        URL wsdlURL = IDispatchControl1.WSDL_LOCATION;
        IDispatchControl1 ss = new IDispatchControl1(wsdlURL, SERVICE_NAME);
        IDispatchControl1PortType port = ss.getIDispatchControl1HttpPort();
        System.out.println("Invoking dispatchCommand...");
        String _dispatchCommand__return = port.dispatchCommand(cn0,cn1);
        return _dispatchCommand__return;
    };
}
