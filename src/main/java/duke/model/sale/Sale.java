package duke.model.sale;

import java.util.Collections;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

import static duke.commons.util.CollectionUtil.requireAllNonNull;

public class Sale {

    //Identity field
    private long id;

    //Data fields
    private String description;
    private Date saleDate;
    private double value;
    private String remarks;

    public Sale(String description, Date saleDate, double value, String remarks) {
        requireAllNonNull(description, saleDate, value, remarks);
        this.id = System.currentTimeMillis();
        this.description = description;
        this.value = value;
        this.saleDate = saleDate;
        this.remarks = remarks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object s) {
        if (this == s) {
            return true;
        }
        if (s == null || getClass() != s.getClass()) {
            return false;
        }
        Sale sale = (Sale) s;
        return id == sale.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}