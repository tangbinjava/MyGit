select * from Star;

create table Star(
       s_id number,
       s_name Varchar2(20),
       t_id number
);

drop table Star;

insert into Star values(1,'鬼剑士',0);
insert into Star values(2,'神枪手',0);
insert into Star values(3,'格斗家',0);
insert into Star values(4,'魔法师',0);
insert into Star values(5,'剑魂',1);
insert into Star values(6,'狂战士',1);
insert into Star values(7,'阿修罗',1);
insert into Star values(8,'鬼泣',1);
insert into Star values(9,'漫游枪手',2);
insert into Star values(10,'弹药专家',2);
insert into Star values(11,'机械师',2);
insert into Star values(12,'枪炮师',2);
insert into Star values(13,'散打',3);
insert into Star values(14,'柔道家',3);
insert into Star values(15,'气功师',3);
insert into Star values(16,'街霸',3);
insert into Star values(17,'元素师',4);
insert into Star values(18,'召唤师',4);
insert into Star values(19,'战斗法师',4);
insert into Star values(20,'魔道学者',4);

select * from Star where t_id = 0;

create table users(
    
       s_name Varchar2(20),
       s_password Varchar2(20)
);

insert into users values('admin','123');
insert into users values('张三','456');
