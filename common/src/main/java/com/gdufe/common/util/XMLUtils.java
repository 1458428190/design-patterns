package com.gdufe.common.util;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @Author: laichengfeng
 * @Description: XML工具类
 * @Date: 2018/7/29 17:45
 */
public class XMLUtils {

    /**
     * 通过读取xml配置文件获取Bean
     * TODO 未测试
     * @param filePath
     * @param beanId
     * @return
     */
    public static Object getBean(String filePath, String beanId) {
        try {

            // 创建DOM文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document document = builder.parse(new File(filePath));

            // 获取包含类名的文本节点
            Element element = document.getElementById(beanId);
            String className = element.getTextContent();

            // 通过类名生成实例对象并将其返回
            Class c = Class.forName(className);
            return c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
