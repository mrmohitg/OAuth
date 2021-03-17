insert into user(id, name, password) values (1,'john','$2a$10$MBl9kw9QYiA3cLrw6cCkKet98RBGpD3j21bIpGhmTMfp/y0og7W9i');
insert into user(id, name, password) values (2,'bharat','$2a$10$MBl9kw9QYiA3cLrw6cCkKet98RBGpD3j21bIpGhmTMfp/y0og7W9i');

insert into role(id, name) values (1,'ROLE_USER');
insert into role(id, name) values (2,'ROLE_ADMIN');


insert into user_role(user_id, role_id) values (1,1);
insert into user_role(user_id, role_id) values (2,1);
insert into user_role(user_id, role_id) values (2,2);