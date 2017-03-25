//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.22 at 09:12:27 PM CST 
//


package org.suren.autotest.platform.schemas.datasource;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="simple"/>
 *     &lt;enumeration value="page_ref"/>
 *     &lt;enumeration value="groovy"/>
 *     &lt;enumeration value="javascript"/>
 *     &lt;enumeration value="encrypt"/>
 *     &lt;enumeration value="callback"/>
 *     &lt;enumeration value="sequence"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataTypeEnum")
@XmlEnum
public enum DataTypeEnum {


    /**
     * 
     * 						�򵥵�������ͣ������Ǿ�̬��ݻ����Ǹ�ݿ���ṩ�Ķ�̬��ݡ�
     * 					
     * 
     */
    @XmlEnumValue("simple")
    SIMPLE("simple"),
    @XmlEnumValue("freemarker")
    FREEMARKER("freemarker"),

    /**
     * 
     * 						Page��֮���������ã����磺User.name��
     * 					
     * 
     */
    @XmlEnumValue("page_ref")
    PAGE_REF("page_ref"),

    /**
     * 
     * 						groovy��̬��ݣ������ο�http://surenpi.com/?s=groovy��
     * 					
     * 
     */
    @XmlEnumValue("groovy")
    GROOVY("groovy"),

    /**
     * 
     * 						javascript��̬��ݣ������ο�http://surenpi.com/?s=javascript��
     * 					
     * 
     */
    @XmlEnumValue("javascript")
    JAVASCRIPT("javascript"),

    /**
     * 
     * 						���ģ���Կ�ڿ�������ļ�encrypt.properties�С�
     * 					
     * 
     */
    @XmlEnumValue("encrypt")
    ENCRYPT("encrypt"),

    /**
     * 
     * 						�ص�����Ҫ��һ������+�������ѡ�������磺org.suren.autotest.CallBack!test������CallBackΪ����testΪ���������д������Ļ�Ĭ��Ϊexecute������Ҫ�󷵻��ַ����ͣ�����Ϊһ���ַ����ͻ�����SettingUtil���ͺ��ַ����ͣ����磺execute(String),execute(SettingUtil, String)
     * 					
     * 
     */
    @XmlEnumValue("callback")
    CALLBACK("callback"),

    /**
     * 
     * 						���ģ���Կ�ڿ�������ļ�encrypt.properties�С�
     * 					
     * 
     */
    @XmlEnumValue("sequence")
    SEQUENCE("sequence");
    public final String value;

    DataTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeEnum fromValue(String v) {
        for (DataTypeEnum c: DataTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

	/**
	 * @return the value
	 */
	public String getValue()
	{
		return value;
	}

}
