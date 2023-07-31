package by.ageenko.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(max = 40)
    @Pattern(regexp = "[a-zA-Z]+")
    private String last_name;
    @NotNull
    @Size(max = 20)
    @Pattern(regexp = "[a-zA-Z]+")
    private String first_name;
    @NotNull
    @Size(max = 40)
    @Pattern(regexp = "[a-zA-Z]+")
    private String patronymic;
    @NotNull
    @Email
    @Size(max = 50)
    private String email;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String last_name, String first_name, String patronymic, String email, Role role) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.patronymic = patronymic;
        this.email = email;
        this.role = role;
    }

    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(id, user.id) && Objects.equals(last_name, user.last_name) && Objects.equals(first_name, user.first_name) && Objects.equals(patronymic, user.patronymic) && Objects.equals(email, user.email) && role == user.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, last_name, first_name, patronymic, email, role);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("last_name='" + last_name + "'")
                .add("first_name='" + first_name + "'")
                .add("patronymic='" + patronymic + "'")
                .add("email='" + email + "'")
                .add("role=" + role)
                .toString();
    }
}