package com.quoc.store.vuahanghieu.payloads;

import com.quoc.store.vuahanghieu.entities.Category;
import com.quoc.store.vuahanghieu.entities.Comment;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String id;
    private String name;
    private String description;
    private int quantity;
    private double price;
    private float star;
    private CategoryDTO category;
    private List<CommentDTO> comments;
}
