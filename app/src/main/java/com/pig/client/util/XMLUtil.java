package com.pig.client.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class XMLUtil {

    // 解析XML
 static    public List<String> analysisMapXml(Context context,String fileName) {
        //获取网络XML数据
        try {
            AssetManager assetManager = context.getAssets();
            InputStream is = assetManager.open(fileName);
            //解析XMLDOM解析=====================================
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(is);
            //获取根标签
            Element element = document.getDocumentElement();
            Log.i("test", "根标签：" + element.getNodeName());
            NodeList nodeList = element.getElementsByTagName("info");
            List<String> infoList = new ArrayList<>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                //获取单个
                Element infoElement = (Element) nodeList.item(i);
                //获取<info>属性id的值
                int id = Integer.parseInt(infoElement.getAttribute("id"));
                //获取<info>的值
                String info = infoElement.getTextContent();
                infoList.add(info);
            }
            return infoList;
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<String>();
    }
}
