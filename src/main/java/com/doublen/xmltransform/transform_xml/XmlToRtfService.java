package com.doublen.xmltransform.transform_xml;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

public class XmlToRtfService {

    public void transform() throws IOException, TransformerException, ParserConfigurationException {

        final File xslFOFile = File.createTempFile("xslfo_",".xsl");
        final FileOutputStream xslFOFOS = new FileOutputStream(xslFOFile);


        TransformerFactory factory = TransformerFactory.newInstance();

        Transformer xformer = factory.newTransformer(new StreamSource(new File("transform.xslt")));


        xformer.transform(new StreamSource(new File("data.xml")), new StreamResult(xslFOFOS));

        xslFOFOS.flush();
        xslFOFOS.close();

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.newDocument();
            Result result = new DOMResult(doc);
          
    }

    public Document loadXmlFromFile(){
        try {
            File fXmlFile = new File("data.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            return doc;

        } catch (Exception e) {
            return null;
        }
    }
}
