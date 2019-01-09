/**
 * ZshipmentNoTable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZshipmentNoTable  implements java.io.Serializable {
    private java.lang.String shipmentno;

    private java.lang.String createdOn;

    private java.lang.String changeOn;

    private java.lang.String changeBy;

    private org.apache.axis.types.Time changeat;

    public ZshipmentNoTable() {
    }

    public ZshipmentNoTable(
           java.lang.String shipmentno,
           java.lang.String createdOn,
           java.lang.String changeOn,
           java.lang.String changeBy,
           org.apache.axis.types.Time changeat) {
           this.shipmentno = shipmentno;
           this.createdOn = createdOn;
           this.changeOn = changeOn;
           this.changeBy = changeBy;
           this.changeat = changeat;
    }


    /**
     * Gets the shipmentno value for this ZshipmentNoTable.
     * 
     * @return shipmentno
     */
    public java.lang.String getShipmentno() {
        return shipmentno;
    }


    /**
     * Sets the shipmentno value for this ZshipmentNoTable.
     * 
     * @param shipmentno
     */
    public void setShipmentno(java.lang.String shipmentno) {
        this.shipmentno = shipmentno;
    }


    /**
     * Gets the createdOn value for this ZshipmentNoTable.
     * 
     * @return createdOn
     */
    public java.lang.String getCreatedOn() {
        return createdOn;
    }


    /**
     * Sets the createdOn value for this ZshipmentNoTable.
     * 
     * @param createdOn
     */
    public void setCreatedOn(java.lang.String createdOn) {
        this.createdOn = createdOn;
    }


    /**
     * Gets the changeOn value for this ZshipmentNoTable.
     * 
     * @return changeOn
     */
    public java.lang.String getChangeOn() {
        return changeOn;
    }


    /**
     * Sets the changeOn value for this ZshipmentNoTable.
     * 
     * @param changeOn
     */
    public void setChangeOn(java.lang.String changeOn) {
        this.changeOn = changeOn;
    }


    /**
     * Gets the changeBy value for this ZshipmentNoTable.
     * 
     * @return changeBy
     */
    public java.lang.String getChangeBy() {
        return changeBy;
    }


    /**
     * Sets the changeBy value for this ZshipmentNoTable.
     * 
     * @param changeBy
     */
    public void setChangeBy(java.lang.String changeBy) {
        this.changeBy = changeBy;
    }


    /**
     * Gets the changeat value for this ZshipmentNoTable.
     * 
     * @return changeat
     */
    public org.apache.axis.types.Time getChangeat() {
        return changeat;
    }


    /**
     * Sets the changeat value for this ZshipmentNoTable.
     * 
     * @param changeat
     */
    public void setChangeat(org.apache.axis.types.Time changeat) {
        this.changeat = changeat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZshipmentNoTable)) return false;
        ZshipmentNoTable other = (ZshipmentNoTable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipmentno==null && other.getShipmentno()==null) || 
             (this.shipmentno!=null &&
              this.shipmentno.equals(other.getShipmentno()))) &&
            ((this.createdOn==null && other.getCreatedOn()==null) || 
             (this.createdOn!=null &&
              this.createdOn.equals(other.getCreatedOn()))) &&
            ((this.changeOn==null && other.getChangeOn()==null) || 
             (this.changeOn!=null &&
              this.changeOn.equals(other.getChangeOn()))) &&
            ((this.changeBy==null && other.getChangeBy()==null) || 
             (this.changeBy!=null &&
              this.changeBy.equals(other.getChangeBy()))) &&
            ((this.changeat==null && other.getChangeat()==null) || 
             (this.changeat!=null &&
              this.changeat.equals(other.getChangeat())));
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
        if (getShipmentno() != null) {
            _hashCode += getShipmentno().hashCode();
        }
        if (getCreatedOn() != null) {
            _hashCode += getCreatedOn().hashCode();
        }
        if (getChangeOn() != null) {
            _hashCode += getChangeOn().hashCode();
        }
        if (getChangeBy() != null) {
            _hashCode += getChangeBy().hashCode();
        }
        if (getChangeat() != null) {
            _hashCode += getChangeat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZshipmentNoTable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZshipmentNoTable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Shipmentno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChangeOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChangeBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Changeat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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
