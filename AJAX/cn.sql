select * from Star;

create table Star(
       s_id number,
       s_name Varchar2(20),
       t_id number
);

drop table Star;

insert into Star values(1,'��ʿ',0);
insert into Star values(2,'��ǹ��',0);
insert into Star values(3,'�񶷼�',0);
insert into Star values(4,'ħ��ʦ',0);
insert into Star values(5,'����',1);
insert into Star values(6,'��սʿ',1);
insert into Star values(7,'������',1);
insert into Star values(8,'����',1);
insert into Star values(9,'����ǹ��',2);
insert into Star values(10,'��ҩר��',2);
insert into Star values(11,'��еʦ',2);
insert into Star values(12,'ǹ��ʦ',2);
insert into Star values(13,'ɢ��',3);
insert into Star values(14,'�����',3);
insert into Star values(15,'����ʦ',3);
insert into Star values(16,'�ְ�',3);
insert into Star values(17,'Ԫ��ʦ',4);
insert into Star values(18,'�ٻ�ʦ',4);
insert into Star values(19,'ս����ʦ',4);
insert into Star values(20,'ħ��ѧ��',4);

select * from Star where t_id = 0;

create table users(
    
       s_name Varchar2(20),
       s_password Varchar2(20)
);

insert into users values('admin','123');
insert into users values('����','456');
