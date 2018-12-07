package com.lib.valueobject;

import java.math.BigDecimal;

public class Books {
    private Integer id;
    private String name;
    private BigDecimal price;
    private String index;
    public Books() {
    }

    public Books(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
//        this.index=index;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
