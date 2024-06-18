package com.bookstore.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "category" , catalog = "bookstoredb")
@NamedQueries({
	
@NamedQuery(name = "Category.findAll" , query =" select c from Category c order by c.name "),
@NamedQuery(name = "Category.countAll" , query =" select count(*) from Category  "),
@NamedQuery(name="Category.findByCategory" , query = "select c from Category c WHERE c.name = :name")
	
})
public class Category {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String name) {
		super();
		this.name = name;
	}

	public Category(int categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


    // Constructors, getters, and setters
}
