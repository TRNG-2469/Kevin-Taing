create table users(
user_id int primary key, 
username varchar(50) not null
)

create table user_profile(
profile_id int primary key, 
user_id int,
bio text
)

insert into users values(1, 'Alice'), (2, 'Bob'), (3, 'Charlie');

insert into user_profile values(101, 1, 'Software Developer'), (102, NULL, 'Currently updating Bio...');

select u.username, up.bio from users u inner join user_profile up on u.user_id = up.user_id;