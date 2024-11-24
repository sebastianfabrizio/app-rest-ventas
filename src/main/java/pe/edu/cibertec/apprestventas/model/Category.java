package pe.edu.cibertec.apprestventas.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Categories")
public class Category {
    @Id
    private Integer categoryid;
    private String categoryname;
    private String description;
}
