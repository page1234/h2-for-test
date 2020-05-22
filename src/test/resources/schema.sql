create table cars
(
    id   bigint generated always as identity not null,
    name varchar(20),
    primary key (id)
);
