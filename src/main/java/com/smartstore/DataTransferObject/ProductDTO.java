package com.smartstore.DataTransferObject;

import com.smartstore.Model.Category;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ProductDTO {
    private Long id;
    private String name;

    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
