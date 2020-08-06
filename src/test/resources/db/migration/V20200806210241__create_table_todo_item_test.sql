drop table if exists todo_item;
create table todo_item (
    id int auto_increment not null,
    content varchar(50) not null,
    status boolean not null
);