/**
 * Copyright 2018, MKS GROUP.
 */
package mksgroup.goodway.model;

import java.util.List;

/**
 * @author ThachLN
 */
public class OrderModel {
    /** Tên header của bảng Product . */
    private List productHeader;

    /** Lưới 2 chiều của danh sách sản phẩm . */
    private List productData;

    /** Mã đơn hàng . */
    private String orderCd;

    /** Địa chỉ giao hàng . */
    private String address;

    /** Vĩ độ của địa chỉ . */
    private Double latitude;

    /** Kinh độ . */
    private Double longitude;
    
    /** Customer's Name */
    private String customer_name;

    /**
     * Get value of productHeader.
     * @return the productHeader
     */
    public List getProductHeader() {
        return productHeader;
    }

    /**
     * Get value of productData.
     * @return the productData
     */
    public List getProductData() {
        return productData;
    }

    /**
     * Get value of orderCd.
     * @return the orderCd
     */
    public String getOrderCd() {
        return orderCd;
    }

    /**
     * Get value of address.
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Get value of latitude.
     * @return the latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Get value of longitude.
     * @return the longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Set the value for productHeader.
     * @param productHeader the productHeader to set
     */
    public void setProductHeader(List productHeader) {
        this.productHeader = productHeader;
    }

    /**
     * Set the value for productData.
     * @param productData the productData to set
     */
    public void setProductData(List productData) {
        this.productData = productData;
    }

    /**
     * Set the value for orderCd.
     * @param orderCd the orderCd to set
     */
    public void setOrderCd(String orderCd) {
        this.orderCd = orderCd;
    }

    /**
     * Set the value for address.
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Set the value for latitude.
     * @param latitude the latitude to set
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Set the value for longitude.
     * @param longitude the longitude to set
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * [Explain the description for this method here].
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format(
                "OrderModel [productHeader=%s, productData=%s, orderCd=%s, address=%s, latitude=%s, longitude=%s]",
                productHeader, productData, orderCd, address, latitude, longitude);
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
}
