/**
 * ZcustomerResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZcustomerResult  implements java.io.Serializable {
    private java.lang.String kunnr;

    private java.lang.String name1;

    private java.lang.String street;

    private java.lang.String strSuppl1;

    private java.lang.String strSuppl2;

    private java.lang.String strSuppl3;

    private java.lang.String postCode1;

    private java.lang.String smtpAddr;

    private java.lang.String telf1;

    private java.lang.String bezei;

    public ZcustomerResult() {
    }

    public ZcustomerResult(
           java.lang.String kunnr,
           java.lang.String name1,
           java.lang.String street,
           java.lang.String strSuppl1,
           java.lang.String strSuppl2,
           java.lang.String strSuppl3,
           java.lang.String postCode1,
           java.lang.String smtpAddr,
           java.lang.String telf1,
           java.lang.String bezei) {
           this.kunnr = kunnr;
           this.name1 = name1;
           this.street = street;
           this.strSuppl1 = strSuppl1;
           this.strSuppl2 = strSuppl2;
           this.strSuppl3 = strSuppl3;
           this.postCode1 = postCode1;
           this.smtpAddr = smtpAddr;
           this.telf1 = telf1;
           this.bezei = bezei;
    }


    /**
     * Gets the kunnr value for this ZcustomerResult.
     * 
     * @return kunnr
     */
    public java.lang.String getKunnr() {
        return kunnr;
    }


    /**
     * Sets the kunnr value for this ZcustomerResult.
     * 
     * @param kunnr
     */
    public void setKunnr(java.lang.String kunnr) {
        this.kunnr = kunnr;
    }


    /**
     * Gets the name1 value for this ZcustomerResult.
     * 
     * @return name1
     */
    public java.lang.String getName1() {
        return name1;
    }


    /**
     * Sets the name1 value for this ZcustomerResult.
     * 
     * @param name1
     */
    public void setName1(java.lang.String name1) {
        this.name1 = name1;
    }


    /**
     * Gets the street value for this ZcustomerResult.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this ZcustomerResult.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the strSuppl1 value for this ZcustomerResult.
     * 
     * @return strSuppl1
     */
    public java.lang.String getStrSuppl1() {
        return strSuppl1;
    }


    /**
     * Sets the strSuppl1 value for this ZcustomerResult.
     * 
     * @param strSuppl1
     */
    public void setStrSuppl1(java.lang.String strSuppl1) {
        this.strSuppl1 = strSuppl1;
    }


    /**
     * Gets the strSuppl2 value for this ZcustomerResult.
     * 
     * @return strSuppl2
     */
    public java.lang.String getStrSuppl2() {
        return strSuppl2;
    }


    /**
     * Sets the strSuppl2 value for this ZcustomerResult.
     * 
     * @param strSuppl2
     */
    public void setStrSuppl2(java.lang.String strSuppl2) {
        this.strSuppl2 = strSuppl2;
    }


    /**
     * Gets the strSuppl3 value for this ZcustomerResult.
     * 
     * @return strSuppl3
     */
    public java.lang.String getStrSuppl3() {
        return strSuppl3;
    }


    /**
     * Sets the strSuppl3 value for this ZcustomerResult.
     * 
     * @param strSuppl3
     */
    public void setStrSuppl3(java.lang.String strSuppl3) {
        this.strSuppl3 = strSuppl3;
    }


    /**
     * Gets the postCode1 value for this ZcustomerResult.
     * 
     * @return postCode1
     */
    public java.lang.String getPostCode1() {
        return postCode1;
    }


    /**
     * Sets the postCode1 value for this ZcustomerResult.
     * 
     * @param postCode1
     */
    public void setPostCode1(java.lang.String postCode1) {
        this.postCode1 = postCode1;
    }


    /**
     * Gets the smtpAddr value for this ZcustomerResult.
     * 
     * @return smtpAddr
     */
    public java.lang.String getSmtpAddr() {
        return smtpAddr;
    }


    /**
     * Sets the smtpAddr value for this ZcustomerResult.
     * 
     * @param smtpAddr
     */
    public void setSmtpAddr(java.lang.String smtpAddr) {
        this.smtpAddr = smtpAddr;
    }


    /**
     * Gets the telf1 value for this ZcustomerResult.
     * 
     * @return telf1
     */
    public java.lang.String getTelf1() {
        return telf1;
    }


    /**
     * Sets the telf1 value for this ZcustomerResult.
     * 
     * @param telf1
     */
    public void setTelf1(java.lang.String telf1) {
        this.telf1 = telf1;
    }


    /**
     * Gets the bezei value for this ZcustomerResult.
     * 
     * @return bezei
     */
    public java.lang.String getBezei() {
        return bezei;
    }


    /**
     * Sets the bezei value for this ZcustomerResult.
     * 
     * @param bezei
     */
    public void setBezei(java.lang.String bezei) {
        this.bezei = bezei;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZcustomerResult)) return false;
        ZcustomerResult other = (ZcustomerResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kunnr==null && other.getKunnr()==null) || 
             (this.kunnr!=null &&
              this.kunnr.equals(other.getKunnr()))) &&
            ((this.name1==null && other.getName1()==null) || 
             (this.name1!=null &&
              this.name1.equals(other.getName1()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.strSuppl1==null && other.getStrSuppl1()==null) || 
             (this.strSuppl1!=null &&
              this.strSuppl1.equals(other.getStrSuppl1()))) &&
            ((this.strSuppl2==null && other.getStrSuppl2()==null) || 
             (this.strSuppl2!=null &&
              this.strSuppl2.equals(other.getStrSuppl2()))) &&
            ((this.strSuppl3==null && other.getStrSuppl3()==null) || 
             (this.strSuppl3!=null &&
              this.strSuppl3.equals(other.getStrSuppl3()))) &&
            ((this.postCode1==null && other.getPostCode1()==null) || 
             (this.postCode1!=null &&
              this.postCode1.equals(other.getPostCode1()))) &&
            ((this.smtpAddr==null && other.getSmtpAddr()==null) || 
             (this.smtpAddr!=null &&
              this.smtpAddr.equals(other.getSmtpAddr()))) &&
            ((this.telf1==null && other.getTelf1()==null) || 
             (this.telf1!=null &&
              this.telf1.equals(other.getTelf1()))) &&
            ((this.bezei==null && other.getBezei()==null) || 
             (this.bezei!=null &&
              this.bezei.equals(other.getBezei())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getKunnr() != null) {
            _hashCode += getKunnr().hashCode();
        }
        if (getName1() != null) {
            _hashCode += getName1().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getStrSuppl1() != null) {
            _hashCode += getStrSuppl1().hashCode();
        }
        if (getStrSuppl2() != null) {
            _hashCode += getStrSuppl2().hashCode();
        }
        if (getStrSuppl3() != null) {
            _hashCode += getStrSuppl3().hashCode();
        }
        if (getPostCode1() != null) {
            _hashCode += getPostCode1().hashCode();
        }
        if (getSmtpAddr() != null) {
            _hashCode += getSmtpAddr().hashCode();
        }
        if (getTelf1() != null) {
            _hashCode += getTelf1().hashCode();
        }
        if (getBezei() != null) {
            _hashCode += getBezei().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZcustomerResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZcustomerResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kunnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Kunnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strSuppl1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StrSuppl1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strSuppl2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StrSuppl2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strSuppl3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StrSuppl3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PostCode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smtpAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmtpAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telf1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Telf1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezei");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Bezei"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
