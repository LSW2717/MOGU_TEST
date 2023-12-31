create database mogu_test;
use mogu_test;

create table contest
(
    id       bigint auto_increment
        primary key,
    name     varchar(100) null,
    category varchar(100) null,
    end_date datetime(6)  null,
    img_url  varchar(255) null,
    url      varchar(255) null

);

INSERT INTO contest (name, category, end_date, img_url, url) VALUES
('실감미디어 콘텐츠 제작 공모전', 'inha', '2024-01-15', './assets/asset/img/img1.png', 'https://open.kakao.com/o/g864AJUf'),
('ZEPETO WORLD JAM FALL 2023', 'game', '2023-12-11', './assets/asset/img/img2.png', 'https://open.kakao.com/o/gdbFCJUf'),
('인공지능윤리 아이디어 경진대회', 'AI', '2023-12-3', './assets/asset/img/img3.png', 'https://open.kakao.com/o/gElkHJUf'),
('K-PaaS 아이디어 공모전', 'idea', '2023-12-13', './assets/asset/img/img4.png', 'https://open.kakao.com/o/glSB1HUf'),
('엔지니어링산업 대국민 콘텐츠 공모전', 'contest', '2024-01-31', './assets/asset/img/img5.png', 'https://open.kakao.com/o/gFrQNJUf');
