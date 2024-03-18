package firstlevelcache.chache1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public User(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public User() {
	super();
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + "]";
}
}
