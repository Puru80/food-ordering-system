/*
 * This file is generated by jOOQ.
 */
package com.bros.foodorderingsystem.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID          id;
    private String        name;
    private Double        price;
    private String        description;
    private String        image;
    private UUID          vendorId;
    private Integer       preparationtime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Item() {}

    public Item(Item value) {
        this.id = value.id;
        this.name = value.name;
        this.price = value.price;
        this.description = value.description;
        this.image = value.image;
        this.vendorId = value.vendorId;
        this.preparationtime = value.preparationtime;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public Item(
        UUID          id,
        String        name,
        Double        price,
        String        description,
        String        image,
        UUID          vendorId,
        Integer       preparationtime,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
    ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.vendorId = vendorId;
        this.preparationtime = preparationtime;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for <code>public.item.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.item.id</code>.
     */
    public Item setId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>public.item.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>public.item.name</code>.
     */
    public Item setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>public.item.price</code>.
     */
    public Double getPrice() {
        return this.price;
    }

    /**
     * Setter for <code>public.item.price</code>.
     */
    public Item setPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Getter for <code>public.item.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>public.item.description</code>.
     */
    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>public.item.image</code>.
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Setter for <code>public.item.image</code>.
     */
    public Item setImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Getter for <code>public.item.vendor_id</code>.
     */
    public UUID getVendorId() {
        return this.vendorId;
    }

    /**
     * Setter for <code>public.item.vendor_id</code>.
     */
    public Item setVendorId(UUID vendorId) {
        this.vendorId = vendorId;
        return this;
    }

    /**
     * Getter for <code>public.item.preparationtime</code>.
     */
    public Integer getPreparationtime() {
        return this.preparationtime;
    }

    /**
     * Setter for <code>public.item.preparationtime</code>.
     */
    public Item setPreparationtime(Integer preparationtime) {
        this.preparationtime = preparationtime;
        return this;
    }

    /**
     * Getter for <code>public.item.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>public.item.created_at</code>.
     */
    public Item setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>public.item.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>public.item.updated_at</code>.
     */
    public Item setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Item other = (Item) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        }
        else if (!price.equals(other.price))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (image == null) {
            if (other.image != null)
                return false;
        }
        else if (!image.equals(other.image))
            return false;
        if (vendorId == null) {
            if (other.vendorId != null)
                return false;
        }
        else if (!vendorId.equals(other.vendorId))
            return false;
        if (preparationtime == null) {
            if (other.preparationtime != null)
                return false;
        }
        else if (!preparationtime.equals(other.preparationtime))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!updatedAt.equals(other.updatedAt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.price == null) ? 0 : this.price.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.image == null) ? 0 : this.image.hashCode());
        result = prime * result + ((this.vendorId == null) ? 0 : this.vendorId.hashCode());
        result = prime * result + ((this.preparationtime == null) ? 0 : this.preparationtime.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Item (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(price);
        sb.append(", ").append(description);
        sb.append(", ").append(image);
        sb.append(", ").append(vendorId);
        sb.append(", ").append(preparationtime);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}
