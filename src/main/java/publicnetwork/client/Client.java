/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package publicnetwork.client;

import com.huateng.haobai.ppcore.control.IDispatchControlPortType;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public final class Client {

    private static final QName SERVICE_NAME 
        = new QName("http://control.ppcore.haobai.huateng.com", "IDispatchControl");

    private Client() {
    } 

    public static void main(String args[]) throws Exception {
        URL url = new URL("http://*/provfront/services/businessService?wsdl");
        Service service = Service.create(url,SERVICE_NAME);
        IDispatchControlPortType hw = service.getPort(IDispatchControlPortType.class);
        String s=hw.dispatchCommand("100101|440000-TIS-1-121.33.197.198|1|121.33.197.198","<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<PayPlatRequestParameter>\n" +
                "\t<CTRL-INFO WEBSVRNAME=\"客户查询\" WEBSVRCODE=\"100101\"\n" +
                "\t\tAPPFROM=\"340000-IAS-V1.0-134.64.204.166\" KEEP=\"420201308301710450030000000001\" />\n" +
                "\t<PARAMETERS>\n" +
                "\t\t<PRODUCTNO>17383150015</PRODUCTNO>\n" +
                "\t\t<ACCEPTORGCODE>001999900000000</ACCEPTORGCODE>\n" +
                "\t\t<ACCEPTSEQNO>420201308301710450030000000001</ACCEPTSEQNO>\n" +
                "\t\t<INPUTTIME>20141126173259</INPUTTIME>\n" +
                "\t</PARAMETERS>\n" +
                "</PayPlatRequestParameter>");
        System.out.println(s);
    }

}
