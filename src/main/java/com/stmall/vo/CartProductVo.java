package com.stmall.vo;

import java.math.BigDecimal;

/**
 * Created by liweqnaun on 2019/1/7.
 */
public class CartProductVo {
    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer quantity;
    private String productName;
    private String producSubtitle;
    private String productMainImage;
    private BigDecimal prodcutPrice;
    private Integer productStatus;
    private BigDecimal prodcutTotalPrice;
    private Integer productStock;
    private Integer productChecked;

    private String limitQuantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducSubtitle() {
        return producSubtitle;
    }

    public void setProducSubtitle(String producSubtitle) {
        this.producSubtitle = producSubtitle;
    }

    public String getProductMainImage() {
        return productMainImage;
    }

    public void setProductMainImage(String productMainImage) {
        this.productMainImage = productMainImage;
    }

    public BigDecimal getProdcutPrice() {
        return prodcutPrice;
    }

    public void setProdcutPrice(BigDecimal prodcutPrice) {
        this.prodcutPrice = prodcutPrice;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public BigDecimal getProdcutTotalPrice() {
        return prodcutTotalPrice;
    }

    public void setProdcutTotalPrice(BigDecimal prodcutTotalPrice) {
        this.prodcutTotalPrice = prodcutTotalPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public Integer getProductChecked() {
        return productChecked;
    }

    public void setProductChecked(Integer productChecked) {
        this.productChecked = productChecked;
    }

    public String getLimitQuantity() {
        return limitQuantity;
    }

    public void setLimitQuantity(String limitQuantity) {
        this.limitQuantity = limitQuantity;
    }
}
