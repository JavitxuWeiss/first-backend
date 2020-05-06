create table user
(
    id int not null,
    name varchar(50) not null,
    email varchar(200) not null unique ,
        primary key (id)
) charset = utf8;
