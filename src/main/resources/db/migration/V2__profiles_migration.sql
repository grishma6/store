create table profiles
(
    id             bigint auto_increment
        primary key,
    bio            varchar(255) not null,
    phone_number   bigint       not null,
    date_of_birth  bigint       not null,
    loyalty_points bigint       not null
);

