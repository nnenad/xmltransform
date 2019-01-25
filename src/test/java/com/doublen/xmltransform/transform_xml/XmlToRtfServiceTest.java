package com.doublen.xmltransform.transform_xml;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

import static org.junit.Assert.*;

public class XmlToRtfServiceTest {

    private XmlToRtfService service;

    @Before
    public void setUp() throws Exception {
        service = new XmlToRtfService();
    }

    @Test
    public void transform() {
        try {
            service.transform();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void loadXmlFromFile() {

        Document s = service.loadXmlFromFile();
        System.out.println(s);
    }
}