create table players (
    player_id integer not null unique, 
    group_id integer not null
);

create table matches (
    match_id integer not null unique, 
    first_player integer not null, 
    second_player integer not null, 
    first_score integer not null, 
    second_score integer not null
);

delete from players;
delete from matches;
insert into players values (20, 2);
insert into players values (30, 1);
insert into players values (40, 3);
insert into players values (45, 1);
insert into players values (50, 2);
insert into players values (65, 1);
insert into matches values (1, 30, 45, 10, 12);
insert into matches values (2, 20, 50, 5, 5);
insert into matches values (13, 65, 45, 10, 10);
insert into matches values (5, 30, 65, 3, 15);
insert into matches values (42, 45, 65, 8, 4);


select p.group_id, p.player_id as 'winner_id'
from matches
inner join players on matches
where max(score) 
group by group_id
having max(score)
order by group_id





