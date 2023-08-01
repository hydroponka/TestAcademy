create table users
(
    id         bigint                                                               not null auto_increment,
    first_name varchar(20)                                                          not null,
    last_name  varchar(40)                                                          not null,
    patronymic varchar(40)                                                          not null,
    email      varchar(50)                                                          not null,
    role       varchar(20) not null,
    primary key (id)
)