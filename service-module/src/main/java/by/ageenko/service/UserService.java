package by.ageenko.service;

import by.ageenko.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User add(User user);

    Page<User> findAll(Pageable pageable);
}
