create table info (
gender nvarchar2(10),
name nvarchar2(100),
birth number,
bt nvarchar2(100),
color nvarchar2(100));

create table color (
no number,
color nvarchar2(100),
ans nvarchar2(100));

insert into info values('m','��â��',880731,'A','Red');
insert into info values('m','���ȣ',901120,'O','Blue');
insert into info values('m','�ڹ�ȣ',901213,'AB','Green');
insert into info values('m','��ȣ��',911116,'AB','Pink');
insert into info values('f','�氡��',930601,'B','Black');

insert into color values(1,'Red','Ȱ���ϰ� �������� ���� �̼�');
insert into color values(2,'Blue','�ɷ��ִ� �濵�� Ÿ���� �̼�');
insert into color values(3,'Green','�ǰ��� �Ű澲�� �ɽ��� ����ϰ� ���ִ� �̼�');
insert into color values(4,'Pink','������� ���� �̼�');
insert into color values(5,'Black','�̼����� �ڱ��ڽ��� �� ����ϴ� Ÿ��');

select a.name as �̸�, a.color as ���û���, b.ans as �̼�Ÿ��
from info a, color b
where a.color = b.color;