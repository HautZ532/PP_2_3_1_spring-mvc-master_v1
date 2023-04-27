package web.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @NotEmpty(message = "Укажите имя")
    @Size(min = 2, max = 15)
    private String name;

    @Column
    @NotEmpty(message = "Укажите фамилию")
    @Size(min = 2, max = 15)
    private String lastName;

    @Column
    @NotEmpty(message = "Укажите почту")
    @Email(message = "Не верный формат почты")
    private String email;

    public User() {
    }


    public String getName() {
        return name;
    }

    public void setName(String carBrand) {
        this.name = carBrand;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String carModel) {
        this.lastName = carModel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String carNumber) {
        this.email = carNumber;
    }

}
