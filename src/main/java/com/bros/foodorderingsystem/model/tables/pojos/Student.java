/*
 * This file is generated by jOOQ.
 */
package com.bros.foodorderingsystem.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        id;
    private String        name;
    private String        email;
    private String        phone;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Student() {}

    public Student(Student value) {
        this.id = value.id;
        this.name = value.name;
        this.email = value.email;
        this.phone = value.phone;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public Student(
        String        id,
        String        name,
        String        email,
        String        phone,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for <code>public.student.id</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.student.id</code>.
     */
    public Student setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>public.student.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>public.student.name</code>.
     */
    public Student setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>public.student.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>public.student.email</code>.
     */
    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>public.student.phone</code>.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for <code>public.student.phone</code>.
     */
    public Student setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Getter for <code>public.student.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>public.student.created_at</code>.
     */
    public Student setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>public.student.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>public.student.updated_at</code>.
     */
    public Student setUpdatedAt(LocalDateTime updatedAt) {
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
        final Student other = (Student) obj;
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
        if (email == null) {
            if (other.email != null)
                return false;
        }
        else if (!email.equals(other.email))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        }
        else if (!phone.equals(other.phone))
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
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.phone == null) ? 0 : this.phone.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(email);
        sb.append(", ").append(phone);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}
