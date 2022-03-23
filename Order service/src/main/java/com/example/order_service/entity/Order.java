package com.example.order_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String description;
    @Field
    private double price;
}
