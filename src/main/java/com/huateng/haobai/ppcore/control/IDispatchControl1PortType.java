package com.huateng.haobai.ppcore.control;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-09-12T09:26:10.303+08:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://control.ppcore.haobai.huateng.com", name = "IDispatchControl1PortType")
@XmlSeeAlso({ObjectFactory.class})
public interface IDispatchControl1PortType {

    @WebResult(name = "out", targetNamespace = "http://control.ppcore.haobai.huateng.com")
    @RequestWrapper(localName = "dispatchCommand", targetNamespace = "http://control.ppcore.haobai.huateng.com", className = "com.huateng.haobai.ppcore.control.DispatchCommand")
    @WebMethod
    @ResponseWrapper(localName = "dispatchCommandResponse", targetNamespace = "http://control.ppcore.haobai.huateng.com", className = "com.huateng.haobai.ppcore.control.DispatchCommandResponse")
    public java.lang.String dispatchCommand(
        @WebParam(name = "in0", targetNamespace = "http://control.ppcore.haobai.huateng.com")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://control.ppcore.haobai.huateng.com")
        java.lang.String in1
    );
}
